package util;

public class CurrencyConverter {
	
	public static double converter(double price, double dollar) {
		return dollar * price * 1.06;
	}
}
