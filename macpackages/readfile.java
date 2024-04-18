package macpackages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readfile {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Saintcoded\\Documents\\.JAVA\\macpackages\\example.txt"; // Replace with your file name

        try (FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // You can process the line here as needed
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
