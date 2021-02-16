package exercises;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(price, dollar));
		
		sc.close();
	}
}