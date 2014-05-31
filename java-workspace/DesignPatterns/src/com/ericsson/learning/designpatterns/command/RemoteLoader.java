package com.ericsson.learning.designpatterns.command;

import com.ericsson.learning.designpatterns.command.appliances.*;
import com.ericsson.learning.designpatterns.command.commands.*;

/**
 * COMMAND: Client
 * */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // creating appliances
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOff);


        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        System.out.println(remote);
        remote.undoButtonWasPressed();
        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);
    }
}
