package com.ericsson.learning.designpatterns.compound.mvc;

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    Sequence sequence;
    Track track;

    // observers
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();

    int bpm = 90;


    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        System.out.println("Starting the sequencer");
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    private void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        beatObservers.add(beatObserver);
    }

    private void notifyBeatObservers() {
        for (BeatObserver observer : beatObservers) {
            observer.updateBeat();
        }
    }

    @Override
    public void removeObserver(BeatObserver beatObserver) {
        beatObservers.remove(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver bpmObserver) {
        bpmObservers.add(bpmObserver);
    }

    private void notifyBPMObservers() {
        for (BPMObserver observer : bpmObservers) {
            observer.updateBPM();
        }
    }

    @Override
    public void removeObserver(BPMObserver bpmObserver) {
        bpmObservers.remove(bpmObserver);
    }


    @Override
    public void meta(MetaMessage meta) {
        System.out.println(meta.getType());
        if (meta.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    private void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);

            sequence = new Sequence(Sequence.PPQ, 4);

            track = sequence.createTrack();

            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192, 9, 1, 0, 4));

        try {
            sequencer.setSequence(sequence);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    private void makeTracks(int[] trackList) {
        for (int i = 0; i < trackList.length; i++) {
            int key = trackList[i];

            if (key != 0) {
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(comd, chan, one, two);

            event = new MidiEvent(msg, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }
}
