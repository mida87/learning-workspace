package com.ericsson.learning.designpatterns.templatemethod.applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello world, I'm alive";
        repaint();
    }

    public void start() {
        message = "Now I am starting up...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I am being stopped...";
        repaint();
    }

    public void destroy() {
        // applet is going away
    }

    public void paint(Graphics graphics) {
        graphics.drawString(message, 5, 15);
    }
}
