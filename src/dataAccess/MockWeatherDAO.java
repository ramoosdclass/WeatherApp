package dataAccess;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import businessObjects.Weather;

public class MockWeatherDAO {
	
	public void createFileAndSaveWeather(Weather weather) throws IOException {
		String seperator = System.lineSeparator();
		String weatherOutputData = 
				"State: " + weather.getState()  + seperator 
				+ "City: " + weather.getCity() + seperator 
				+ "High: " + weather.getHigh() + seperator
				+ "Low: " + weather.getLow();
		
		FileOutputStream fileOutput = new FileOutputStream(
				"/Users/Ram/SnapItWorkspace/oosdClassProjects/WeatherApp/weatherData/" 
				+ LocalDate.now() + weather.getCity() + "Weather.txt");
		
		fileOutput.write(weatherOutputData.getBytes());
		fileOutput.close();
  		
	}

}
