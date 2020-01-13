package ac.uk.napier.set07110Coursework;

import java.util.HashMap;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import mapgui.MapGui;

/**
 * QUESTION 08
 * 
 * If you decide to answer question 08 then the main method below should be used
 * as the entry point for your application You may use as many other classes as
 * you feel necessary as long as all code is supplied
 * 
 * Remember to add -Xmx1024m to the VM arguments using menu run --> run
 * configurations in eclipse
 */
public class Answer08 {
	public static void main(String[] args) {
		System.out.println("Question 08");
		/*
		 * Add your code below
		 */
		HashMap<Integer, WeatherStation> stations = DataHandler.getStations();

		WeatherStation station = stations.get(3313);

		double minTemp = 100;
		double maxTemp = 0;
		int numReading = 0;
		double sumReading = 0;
		// loop through the readings of the stations
		for (WeatherReading reading : station.getReading()) {

			// Check for the right Reading
			if (reading.getMonth() == 7 && reading.getHour() == 11) {
				double currentTemp = reading.getTemperature();

				if (currentTemp < minTemp) {
					minTemp = currentTemp;
				}
				if (currentTemp > maxTemp) {
					maxTemp = currentTemp;
				}
				numReading++;
				sumReading += currentTemp;

			}
		}

		double avg = sumReading / numReading;
		System.out.println("WeatherStation : RHYL(3313) " + "Min : " + minTemp + " Max : " + maxTemp + " Avg : " + avg
				+ " Num of Readings : " + numReading);

		double lat = 53.259;
		double lon = -3.509;

		Coordinate coordinates = new Coordinate(lat, lon);

		MapGui.showMap(coordinates);

	}

}
