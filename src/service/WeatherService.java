package service;

import java.io.IOException;
import java.sql.SQLException;

import businessObjects.Weather;
import dataAccess.MockWeatherDAO;

public class WeatherService {
	
	
	
	public String saveWeather(Weather weather)   {
		
		MockWeatherDAO mockDAO = new MockWeatherDAO();
		
		if(weather.getHigh() > 180 && weather.getLow()< -30) {
			return "The weather cannot be greater than 180 or less than -30";
		}
		
		if(weather.getState().isEmpty()) {
			return "jdsjsk";
		}
		
		else
		{
			
			
				try {
					mockDAO.createFileAndSaveWeather(weather);
				} catch (IOException e) {
					return "The file could not be save please call "
							+ "help desk";
				}
				finally{
					System.out.println("I am finally block: I get executed whether"
							+ "I catch an exception or not");
				}
			
			//mockDAO.saveIntoDB(weather);
		}
			
			return "The Weather has beerrn successfully saved in folder";
		}
	}


