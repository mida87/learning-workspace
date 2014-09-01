package com.ericsson.learning.designpatterns.proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * PROXY: Proxy
 * Icon in this case is Subject interface
 * ImageIcon is Real Subject
 * */
public class ImageProxy implements Icon {
    ImageIcon icon;
    URL url;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.url = url;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (icon != null) {
            icon.paintIcon(c, g, x, y);
        }
        else {
            g.drawString("Loading CD cover, please wait", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            icon = new ImageIcon(url, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }

    }

    @Override
    public int getIconWidth() {
        if (icon != null) {
            return icon.getIconWidth();
        }
        else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (icon != null) {
            return icon.getIconHeight();
        }
        else {
            return 600;
        }
    }
}
