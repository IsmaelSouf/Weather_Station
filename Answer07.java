package ac.uk.napier.set07110Coursework;

import java.util.*;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapgui.MapGui;

/**
 * QUESTION 07
 * 
 * If you decide to answer question 07 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer07 {
	public static void main(String[] args) {
		System.out.println("Question 07");
		/*
		 * Add your code below
		 */
		HashMap<Integer, WeatherStation> stations = DataHandler.getStations();

		double maxTemp = 0;

		WeatherStation station = stations.get(3385);

		WeatherReading maxReading = null;

		for (WeatherReading reading : station.getReading()) {
			double currTemp = reading.getTemperature();
			if (currTemp > maxTemp) {
				maxTemp = currTemp;
				maxReading = reading;
			}
		}
		System.out.println("Highest temperature recorded at DONNA NOOK (3385) " + maxReading);

		double lat = 53.473;
		double lon = 0.154;

		Coordinate coordinates = new Coordinate(lat, lon);

		MapGui.showMap(coordinates);

	}

}
