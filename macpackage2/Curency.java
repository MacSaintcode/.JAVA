package macpackage2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Curency {
	String[] countries = { "UNITED STATES", "INDIA", "FRANCE", "CHINA", "NIGERIA" };
	String country = "";
	Scanner scan = new Scanner(System.in);

	// @SuppressWarnings("deprecation")
	Curency() {

		// Locale locale=new Locale("ng", "NG");

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.print("WHICH CONTRY ARE YOU FROM ? ");
		country = scan.nextLine().toUpperCase();
		int g = 0;
		while (true) {

			if (country.equalsIgnoreCase(countries[g])) {
				System.out.println("COUNTRY AVAILABE!");
				for (int i = 0; i <= 3; i++) {
					System.out.print("CREDIT ME: ");
					double credit = scan.nextDouble();

					if (credit <= 0) {
						System.out.println("INVALID AMOUNT");
						continue;
					}
					switch (country.toUpperCase()) {
						case "UNITED STATES":
						case "US":
							System.out.println("My Balance: " + nf.format(credit));
							break;
						case "NIGERIA":
							nf = NumberFormat.getCurrencyInstance(new Locale("ng", "NG"));
							System.out.println("My Balance: " + nf.format(credit));
							break;
						case "CHINA":
							nf = NumberFormat.getCurrencyInstance(new Locale("ng", "NG"));
							System.out.println("My Balance: " + nf.format(credit));
							break;
						case "FRANCE":
							nf = NumberFormat.getCurrencyInstance(new Locale("ng", "NG"));
							System.out.println("My Balance: " + nf.format(credit));
							break;
						case "INDIA":
							nf = NumberFormat.getCurrencyInstance(new Locale("ng", "NG"));
							System.out.println("My Balance: " + nf.format(credit));
							break;
						default:
							System.out.println("TRY AGAIN!");
							break;
					}
				}
				break;
			}
			if (g == countries.length - 1) {
				System.out.println("COUNTRY UNAVAILABE!");
				break;

			}
			g++;

		}

	}

	public static void main(String[] args) {
		Curency call = new Curency();
	}

}
