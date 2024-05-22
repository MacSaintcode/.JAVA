package macpackage2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();

        Scanner scan = new Scanner(new File("C:\\Users\\Saintcoded\\Documents\\.JAVA\\macpackage2\\example.txt"));
        while (scan.hasNext()) {
            String name = scan.next();
            int score = scan.nextInt();

            students.add(new Student(name, score));
        }

        // Printing unsorted list
        System.out.println("Unsorted:");
        for (Student student : students) {
            System.out.println(student.getScore() + " " + student.getName());
        }
        // Sorting the list based on scores
        Collections.sort(students);

        // Printing sorted list
        System.out.println("\nSorted:");
        for (Student student : students) {
            System.out.println(student.getScore() + " " + student.getName());
        }
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