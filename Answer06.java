package ac.uk.napier.set07110Coursework;

import java.util.*;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapgui.MapGui;
/**
 * QUESTION 06
 * 
 * If you decide to answer question 08 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer06 {

	public static void main(String[] args) {

		System.out.println("Question 06");

		/*
		 * Add your code below
		 */

		HashMap<Integer, WeatherStation> stations = DataHandler.getStations();

		int maxReadings = 0;
		WeatherStation maxStation = null;

		for (WeatherStation station : stations.values()) {
			int currReading = station.getReading().size();
			if (currReading > maxReadings) {
				maxReadings = currReading;
				maxStation = station;
			}

		}
		System.out.println(maxStation);
		
		//specify a latitude and longitude
		double lat = 53.03;
		double lon = -0.5;
		
		// Create a new Coordinate using lat and lon
		Coordinate coordinates = new Coordinate(lat, lon);
		
		// Display the coordinates on a map
		MapGui.showMap(coordinates);

		
	}

}
