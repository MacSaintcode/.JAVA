package GUI.flagtrivia2;
import macpackage2.testing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import GUI.createFrames;

public class difficulty extends createFrames {
    JRadioButton Easy, Hard, Normal;
    Font font = new Font("Seriff", Font.BOLD, 30);

    difficulty() {
        JPanel north = new JPanel();
        north.add(createLabel("Select Difficulty"));

        add(north, BorderLayout.NORTH);
        GridLayout grid = new GridLayout(3, 1);
        grid.setVgap(20);
        JPanel center = new JPanel(grid);
        Hard = createradio("Hard (3 tries For the whole game)",
                font);
        Easy = createradio("Easy (3 tries for every flag)",
                font);
        Normal = createradio("Normal (5 tries for the whole game)",
                font);
        ButtonGroup group = new ButtonGroup();
        group.add(Easy);
        group.add(Normal);
        group.add(Hard);

        center.add(Easy);
        center.add(Normal);
        center.add(Hard);
        if (dificuu.equalsIgnoreCase("easy")) {
            Easy.setSelected(true);
        } else if (dificuu.equalsIgnoreCase("hard")) {
            Hard.setSelected(true);
        } else {
            Normal.setSelected(true);
        }
        Hard.addItemListener(this);
        Easy.addItemListener(this);
        Normal.addItemListener(this);

        add(center, BorderLayout.CENTER);

        addWindowListener(this);
        setTitle("Flag Trivia");
        setSize(550, 350);
        setDefaultCloseOperation(2);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (Hard.isSelected()) {
            dificuu = "Hard";
        } else if (Normal.isSelected()) {
            dificuu = "Normal";
        } else if (Easy.isSelected()) {
            dificuu = "Easy";
        }
        this.dispose();
        

    }

    @Override
    public void windowClosing(WindowEvent e) {
        new menu();
    }
    @Override
    public void windowClosed(WindowEvent e) {
        new menu();
    }
}