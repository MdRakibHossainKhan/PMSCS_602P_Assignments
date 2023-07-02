package chapter04;

public class Chapter04Exercise07 {

	public static void main(String[] args) {
		Temperature temperature = new Temperature();

		temperature.setFahrenheit(100.0);

		System.out.println(String.format("Temperature in Degrees Fahrenheit: %.2f", temperature.getFahrenheit()));
		System.out.println(String.format("Temperature in Degrees Celsius: %.2f", temperature.getCelsius()));
	}

}

class Temperature {
	Double celsius;
	Double fahrenheit;

	public Double getCelsius() {
		return celsius;
	}

	public void setCelsius(Double value) {
		celsius = value;
		fahrenheit = toFahrenheit(celsius);
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Double value) {
		fahrenheit = value;
		celsius = toCelsius(fahrenheit);
	}

	public Double toCelsius(Double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public Double toFahrenheit(Double celsius) {
		return celsius * 9 / 5 + 32;
	}
}
