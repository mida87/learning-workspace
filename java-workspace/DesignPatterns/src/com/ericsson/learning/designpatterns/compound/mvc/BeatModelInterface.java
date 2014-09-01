package com.ericsson.learning.designpatterns.compound.mvc;

public interface BeatModelInterface {
    public void initialize();

    public void on();

    public void off();

    public void setBPM(int bmp);

    public int getBPM();

    public void registerObserver(BeatObserver beatObserver);

    public void removeObserver(BeatObserver beatObserver);

    public void registerObserver(BPMObserver bmpObserver);

    public void removeObserver(BPMObserver bmpObserver);
}
