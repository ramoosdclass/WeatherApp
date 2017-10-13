package UI;

import java.io.IOException;
import java.util.Scanner;

import businessObjects.Weather;
import service.WeatherService;

public class WeatherApp {

	public static void main(String[] args) throws IOException {

		System.out.println("Please enter the city: ");
		String city = new Scanner(System.in).nextLine();

		System.out.println("Please enter the state: ");
		String state = new Scanner(System.in).nextLine();

		System.out.println("Please enter the high: ");
		int high = new Scanner(System.in).nextInt();

		System.out.println("Please enter the low: ");
		int low = new Scanner(System.in).nextInt();

		Weather weather = new Weather();
		weather.setCity(city);
		weather.setState(state);
		weather.setHigh(high);
		weather.setLow(low);
		
		WeatherService weatherService = new WeatherService();
		System.out.println(weatherService.saveWeather(weather));

	}

}
