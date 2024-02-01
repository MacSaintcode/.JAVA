package macpackages;

import java.util.Scanner;

public class Except extends Exception {

	Except() {
		super("EniolaException");

	}

	Except(String mesage) {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("INPUT NUMBER: ");
//		int input = scan.nextInt();
//		if (input <= 5) {
		throw new ArithmeticException(mesage);

//	}

	}

	public static void main(String[] args) throws Except {
		try {
			Except call = new Except("IT IS WRONG");

			Except cal = new Except();
			throw new Except();

		} catch (ArithmeticException ea) {
			System.out.println("Message: " + ea.getMessage());

			try {
				throw new Except();
			} catch (Except e) {
				System.out.println("Message: " + e.getMessage());

			}

		} catch (Except en) {
			System.out.println("Message: " + en.getMessage());

		}

		finally {

		}
		assert (12 > 4);

	}

}
