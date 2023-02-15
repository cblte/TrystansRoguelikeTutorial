package net.zn80;

import asciiPanel.AsciiPanel;

import javax.swing.*;

public class ApplicationMain extends JFrame {

    /**
     * The AsciiPanel instance used for text-based display.
     */
    private AsciiPanel terminal;

    /**
     * Creates a new instance of ApplicationMain class.
     */
    public ApplicationMain() {
        super();
        terminal = new AsciiPanel();
        terminal.write("rl tutorial", 1, 1);
        add(terminal);
        pack();
    }

    /*
     * The main entry point for the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationMain applicationMain = new ApplicationMain();
        applicationMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        applicationMain.setVisible(true);
    }
}
