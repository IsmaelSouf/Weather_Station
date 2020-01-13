package ac.uk.napier.set07110Coursework;

import java.util.HashMap;

import weather.WeatherData;

public class DataHandler {

	public static HashMap<Integer, WeatherStation> getStations() {

		// create a new HashMap
		HashMap<Integer, WeatherStation> stations = new HashMap<Integer, WeatherStation>();

		String[] data = WeatherData.getData();

		for (int i = 1; i < data.length; i++) {

			// get the next line
			String line = data[i];

			// split the string
			String[] elements = line.split(",");

			int siteId = Integer.parseInt(elements[0]);
			String siteName = elements[1];
			double lat = Double.parseDouble(elements[2]);
			double lon = Double.parseDouble(elements[3]);

			int year = Integer.parseInt(elements[4]);
			int month = Integer.parseInt(elements[5]);
			int date = Integer.parseInt(elements[6]);
			int hour = Integer.parseInt(elements[7]);
			int windspeed = Integer.parseInt(elements[8]);
			double temperature = Double.parseDouble(elements[9]);

			WeatherStation station = new WeatherStation(siteId, siteName, lat, lon);

			WeatherReading readings = new WeatherReading(year, month, date, hour, windspeed, temperature);
			station.addReading(readings);

			if (stations.containsKey(siteId)) {
				stations.get(siteId).addReading(readings);
			} else {

				stations.put(siteId, station);

			}

		}
		return stations;
	}
}
