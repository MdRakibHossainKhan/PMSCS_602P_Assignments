package chapter10;

public class Chapter10Exercise25 {
	public static void main(String[] args) {
		CurrencyConverter converter = new CurrencyConverter();

		// Set exchange rates for different currencies
		converter.setRate("dollar", 1.0);
		converter.setRate("yen", 141.72);
		converter.setRate("euro", 0.91);

		// Perform currency conversion
		double yenAmount = converter.exchange("dollar", "yen", 250.0);
		double euroAmount = converter.exchange("dollar", "euro", 100.0);

		System.out.println("$250 in yen: " + yenAmount);
		System.out.println("$100 in euro: " + euroAmount);
	}
}
