package GUI.flagtrivia2;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

import GUI.createFrames;

public class leaderboard extends createFrames {
    String diff;

    leaderboard(String dif) {
        diff=dif;
        JPanel north = new JPanel();
        north.add(createLabel("TOP 20 Players"));

        add(north);
        addWindowListener(this);
        setTitle("Flag Trivia");
        setSize(550, 500);
        setDefaultCloseOperation(2);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void windowClosing(WindowEvent e) {
        new menu(diff);
    }
}
