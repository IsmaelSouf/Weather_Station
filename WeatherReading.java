package ac.uk.napier.set07110Coursework;

public class WeatherReading {
	private int year;
	private int month;
	private int date;
	private int hour;
	private int windspeed;
	private double temperature;

	public WeatherReading(int year, int month, int date, int hour, int windspeed, double temperature) {

		this.year = year;
		this.month = month;
		this.date = date;
		this.hour = hour;
		this.windspeed = windspeed;
		this.temperature = temperature;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int getHour() {
		return hour;
	}

	public int getWindspeed() {
		return windspeed;
	}

	public double getTemperature() {
		return temperature;
	}

	@Override
	public String toString() {
		return "WeatherReading [year=" + year + ", month=" + month + ", date=" + date + ", hour=" + hour
				+ ", windspeed=" + windspeed + ", temperature=" + temperature + "]";
	}

}