package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;
import java.util.HashMap;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapgui.MapGui;

/**
 * QUESTION 09
 * 
 * If you decide to answer question 09 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer09 {
	public static void main(String[] args) {
		System.out.println("Question 09");
		/*
		 * Add your code below
		 */

		// create a new HashMap
		HashMap<Integer, WeatherStation> stations = DataHandler.getStations();

		ArrayList<Coordinate> tempStation = new ArrayList<Coordinate>();

		for (WeatherStation station : stations.values()) {

			boolean isOver25 = false;
			for (WeatherReading reading : station.getReading()) {
				if (reading.getTemperature() >= 25) {
					isOver25 = true;
				}

			}
			if (isOver25) {
				tempStation.add(station.getCoordinate());
			}
		}

		System.out.println("Number of WeatherStations recorded with a temperature of 25 or over : " + tempStation.size());
		MapGui.showMap(tempStation);

	}
}
