package GUI.flagtrivia2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import GUI.createFrames;

public class difficulty extends createFrames {
    JRadioButton Easy, Hard, Normal;
    Font font = new Font("Seriff", Font.BOLD, 30);
    String diff;

    difficulty(String di) {
        JPanel north = new JPanel();
        north.add(createLabel("Select Difficulty"));

        add(north, BorderLayout.NORTH);
        GridLayout grid = new GridLayout(3, 1);
        grid.setVgap(20);
        JPanel center = new JPanel(grid);
        Hard = createradio("Hard", font);
        Easy = createradio("Easy", font);
        Normal = createradio("Normal", font);
        ButtonGroup group = new ButtonGroup();
        group.add(Easy);
        group.add(Normal);
        group.add(Hard);

        center.add(Easy);
        center.add(Normal);
        center.add(Hard);
        if (di.equalsIgnoreCase("easy")) {
            Easy.setSelected(true);
        } else if (di.equalsIgnoreCase("hard")) {
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
        setSize(250, 350);
        setDefaultCloseOperation(2);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (Hard.isSelected()) {
            diff = "Hard";
        } else if (Normal.isSelected()) {
            diff = "Normal";
        } else if (Easy.isSelected()) {
            diff = "Easy";
        }
        new menu(diff);
        this.dispose();
    }
}
