package chapter10;

import java.util.HashMap;

public class CurrencyConverter {
	private HashMap<String, Double> exchangeRates;

	public CurrencyConverter() {
		exchangeRates = new HashMap<>();
	}

	public void setRate(String currency, double rate) {
		exchangeRates.put(currency.toLowerCase(), rate);
	}

	public double exchange(String fromCurrency, String toCurrency, double amount) {
		double fromRate = exchangeRates.getOrDefault(fromCurrency.toLowerCase(), 1.0);
		double toRate = exchangeRates.getOrDefault(toCurrency.toLowerCase(), 1.0);

		return (amount / fromRate) * toRate;
	}
}
