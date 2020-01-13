package ac.uk.napier.set07110Coursework;

import java.util.HashMap;

import mapGui.MapGui;


/**
 * QUESTION 10
 * 
 * If you decide to answer question 10 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer10 {
	public static void main(String[] args) {
		System.out.println("Question 10");
		/*
		 * Add your code below
		 */
		HashMap<Integer, WeatherStation> stations = DataHandler.getStations();

		WeatherStation easterlyStation = null;
		WeatherStation southerlyStation = null;

		double minLat = 90;
		double maxLon = -180;

		for (WeatherStation station : stations.values()) {
			double currLat = station.getLatitude();
			double currLon = station.getLongitude();

			if (currLat < minLat) {
				minLat = currLat;
				southerlyStation = station;
			}

			if (currLon > maxLon) {
				maxLon = currLon;
				easterlyStation = station;
			}
		}
		System.out.println(easterlyStation);
		MapGui.showMap(southerlyStation.getCoordinate());
	}
}
