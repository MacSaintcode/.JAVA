package GUI.flagtrivia3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JPanel;

import GUI.createFrames;

public class leaderboard extends createFrames {

    leaderboard() {
        JPanel north = new JPanel();
        // north.add();

        add(north,BorderLayout.CENTER);
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
        new menu();
    }
}
