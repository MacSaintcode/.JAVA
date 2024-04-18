package GUI.flagtrivia2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import GUI.createFrames;

public class menu extends createFrames {
    JButton play, instruct, leaders, dif;
    Font font = new Font("Seriff", Font.BOLD, 30);
    String dificulty;

    menu(String di) {
            dificulty=di;
            System.out.println(di);
        JPanel north = new JPanel();
        north.add(createLabel("Main Menu"));

        add(north, BorderLayout.NORTH);
        GridLayout grid = new GridLayout(3, 1);
        FlowLayout flow = new FlowLayout();
        flow.setVgap(40);
        grid.setVgap(20);
        JPanel center = new JPanel(flow);
        leaders = createButton("Leaderboard", font);
        play = createButton("Start Game", font);
        instruct = createButton("View Instruction", font);
        dif = createButton("Difficulty", font);
        center.add(play);
        center.add(dif);
        center.add(leaders);
        center.add(instruct);

        add(center, BorderLayout.CENTER);

        addWindowListener(this);
        setTitle("Flag Trivia");
        setSize(350, 450);
        setDefaultCloseOperation(0);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new menu("easy");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            this.dispose();
            new GuiFlagTrivia(dificulty);

        } else if (e.getSource() == instruct) {
            JOptionPane.showMessageDialog(this,
                    "1.)Choose Difficulty\n2.)get the nam of as many country flags and accumulate points.\n3.)try not to fail too many times or its game over\n4.)\n5.)\n",
                    "Instructions", 1);
        } else if (e.getSource() == leaders) {
            this.dispose();
            new leaderboard();
        } else {
            this.dispose();
            new difficulty(dificulty);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int n = JOptionPane.showConfirmDialog(this, "Do you want to exit the game", "OPTION",
                JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            System.exit(0);
        }
    }
}
