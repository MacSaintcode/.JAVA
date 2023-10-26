package HANGMAN;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hangman extends Exception {

	String[] countries = { "mauritania", "nigeria", "malaysia", "israel", "iran", "brazil", "france", "england",
			"canada", "germany", "turkey" };

	static String user;

	String country, dashes, missedLetters = "";

	Scanner sc = new Scanner(System.in);

	void Promtname() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("INPUT YOUR NAME: ");
			String users = sc.nextLine();
			if (users.length() == 0) {
				users = sc.nextLine();
			} else {
				user = users.toUpperCase();
				break;
			}

		}
		System.out.println("Hi " + user);

	}

	void How_to_play() {
		Scanner sc = new Scanner(System.in);
		Hangman hg = new Hangman();

		System.out.println(
				"(1) Player neck must be on a rope" + "\n" + "(2) " + "if player loses he/she must die by strangling"
						+ "\n" + "(3) player must die were no one will find dere body" + "\n"
						+ "(4) if this conditions are not met you are fucked figuratively & literaly" + "\n"
						+ "Let the game begin!\n");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Caught an error");

		}

		while (true) {
			System.out.println("WOULD YOU LIKE TO RETURN TO THE MAIN MENU?");
			System.out.print(">>");
			String opt = sc.next().toLowerCase();

			if (opt.equalsIgnoreCase("yes")) {
				hg.Playing(); // chose to play
				break;

			} else if (opt.equalsIgnoreCase("no")) {
				try {
					Thread.sleep(5000);
					continue;

				} catch (InterruptedException e) {
					System.out.println("Caught an error");
				}

			} else {
				System.out.println("Invalid input");
				continue;
			}
		}
	}

	String generateCountry() {
		int index = new Random().nextInt(countries.length);
		country = countries[index];
		return country;
	}

	String generateDashes() {
		dashes = "";
		for (int j = 0; j < country.length(); j++) {
			dashes += "-";
		}
		return dashes;
	}

	void processInput() {
//		System.out.println(country);
		System.out.println(dashes);
		while (!country.equals(dashes)) {

			System.out.println(">>");
			char input = sc.nextLine().charAt(0); // come back to this

			String dash = "";

			if (country.contains(String.valueOf(input))) {
				for (int i = 0; i < country.length(); i++) {
					if (input == country.charAt(i))
						dash += input;
					else
						dash += dashes.charAt(i);
				}

				dashes = dash;
				System.out.println(dashes);
			} else {
				if (missedLetters.contains(String.valueOf(input)))
					continue;
				missedLetters += input;
			}
		}

		char[] wrongLetters = missedLetters.toCharArray();
		System.out.println("Wrong letters: " + Arrays.toString(wrongLetters));

	}

	Hangman() {
		super("InvalidOptionException");

	}

	void Playing() {
		Scanner sc = new Scanner(System.in);
		Hangman hg = new Hangman();

		while (true) {
			System.out.format("\nHi %s WHAT WOULD YOU LIKE TO DO ON HANGMAN? \n", user);

			System.out.println("1. PLAY GAME\n" + "2. INSTRUCTIONS\n" + "3. QUIT GAME");
			System.out.print(">> ");
			int option = sc.nextInt();
			try {
				switch (option) {
				case 1: {
					// start the game
					System.out.println("Welcome to Hangman Game your life is on the line");

					hg.generateCountry();
					hg.generateDashes();
					hg.processInput();

					break;
				}
				case 2: {
					// view instruction
					hg.How_to_play();
//					break;
				}
				case 3: {
					// quit game
					System.out.println("Good bye " + user);
					break;
				}

				default:
					throw new Hangman();

				}
				break;
			} catch (Hangman en) {
				System.out.println("Message: " + en.getMessage());

			} catch (InputMismatchException ea) {
				System.out.println("Message: " + ea.getMessage());

			}
		}

	}

	public static void main(String[] args) {
		Hangman hg = new Hangman();

		hg.Promtname();// players name
		hg.Playing(); // chose to play

	}

}
