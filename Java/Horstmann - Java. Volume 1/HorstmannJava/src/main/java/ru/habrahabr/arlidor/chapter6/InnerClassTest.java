package ru.habrahabr.arlidor.chapter6;

import javax.swing.JOptionPane;

public class InnerClassTest {
    
    public static void main(String args[]) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
