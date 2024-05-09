package macpackage2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readfile {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Saintcoded\\Documents\\.JAVA\\macpackage2\\example.txt";

        // try (FileReader fileReader = new FileReader(fileName);
        // BufferedReader bufferedReader = new BufferedReader(fileReader)) {

        // String line;
        // while ((line = bufferedReader.readLine()) != null) {
        // System.out.println(line); // You can process the line here as needed
        // }
        // } catch (IOException e) {
        // System.err.println("Error reading file: " + e.getMessage());
        // }

        // or

        try (BufferedReader buff = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = buff.readLine()) != null) {
                System.out.println(line); // You can process the line here as needed
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());

        }
    }
}
