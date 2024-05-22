package GUI.flagtrivia4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GUI.createFrames;

public class leaderboard extends createFrames {
    String arr[]={ "Rank","Usernames","Scores"},row[]=new String[3];
    DefaultTableModel DM = new DefaultTableModel(arr, 0);
    int rank=0;

    leaderboard() {
        JPanel north = new JPanel();
        JTable JT = new JTable(DM);
        JT.setFont(new Font("Seriff", Font.BOLD,15));
        JScrollPane scroll = new JScrollPane(JT);
              
        ArrayList<Student> students = new ArrayList<>();
        north.add(createLabel("Players Ranking"));

        try (Scanner scan = new Scanner(
                new File("C:/Users/Saintcoded/Documents/.JAVA/macpackage2/example.txt"))) {
            while (scan.hasNext()) {
                String name = scan.next().toUpperCase();
                int score = scan.nextInt();
                students.add(new Student(name, score));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Collections.sort(students);
        for (Student student : students) {
            row[0]=String.valueOf(++rank);
            row[1]=student.getName();
            row[2]=String.valueOf(student.getScore());
            DM.addRow(row);
        }
        add(north, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        
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

class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        // Compare based on scores
        return Integer.compare(other.score, this.score);
    }
}