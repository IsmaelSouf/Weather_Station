package ac.uk.napier.set07110Coursework;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

public class WeatherStation {
	private int siteId;
	private String siteName;
	private double latitude;
	private double longitude;
	private ArrayList<WeatherReading> readings = new ArrayList<WeatherReading>();

	public WeatherStation(int siteId, String siteName, double latitude, double longitude) {

		this.siteId = siteId;
		this.siteName = siteName;
		this.latitude = latitude;
		this.longitude = longitude;

	}

         /**
	 * Adds a weather reading to the list of weather readings.
	 * @param reading WeatherReading; weather reading to add
	 */
	public void addReading(WeatherReading reading) {
		this.readings.add(reading);
	}

	public int getSiteId() {
		return siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public ArrayList<WeatherReading> getReading() {
		return readings;
	}

	public void setReading(ArrayList<WeatherReading> reading) {
		this.readings = reading;
	}

	public Coordinate getCoordinate() {
		Coordinate c = new Coordinate(latitude, longitude);
		return c;
	}

	@Override
	public String toString() {
		return "WeatherStation [siteId=" + siteId + ", siteName=" + siteName + ", latitude=" + latitude + ", longitude="
				+ longitude + ", readings=" + this.readings.size() + "]";
	}

}
