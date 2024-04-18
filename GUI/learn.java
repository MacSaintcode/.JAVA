package GUI;

import java.util.Random;
import java.util.Scanner;

public class learn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        String gotten = "Hello ";
        int i = 0;
        String arr[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        Random rand = new Random();
        String letter;
        while (i < name.length()) {
            letter = arr[rand.nextInt(0, arr.length - 1)];
            System.out.println(gotten + letter);
            if (letter.equalsIgnoreCase(name.substring(i,i+1))) {
                gotten += letter;
                i++;
            }
        }
    }
}
