package onlinecode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class filewriter {

    public static void main(String[] args) {

// using try with resourses

        // try (FileWriter fw = new FileWriter("C:\\Users\\Saintcoded\\Documents\\.JAVA\\macpackage2\\example.txt", true);
        //         BufferedWriter bw = new BufferedWriter(fw);
        //         PrintWriter out = new PrintWriter(bw)) {
        //     out.println("the text");
        // } catch (IOException e) {
            
        // }

// OR

// using try and catch

        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/LENOVO/Documents/.JAVA/macpackage2/example.txt", true)));
            out.println("the text");
            out.close();
        } catch (IOException e) {
        }
        
    }

}
