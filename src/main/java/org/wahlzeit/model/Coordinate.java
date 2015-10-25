package org.wahlzeit.model;

/**
 * Coordinate class
 * Providing basic coordinate functions
 */
public class Coordinate{

	private double latitude;	//geogr Breite
	private double longitude; 	//geogr Laenge

	/**
	 *
	 */
	public Coordinate(double latitude, double longitude){
		this.latitude=latitude;
		this.longitude=longitude;	
	}
	
	/**
	 *
	 */
	public double getLatitudinalDistance(Coordinate secCoordinate){
		return Math.abs(this.getLatitude()-secCoordinate.getLatitude());
	}
	
	/**
	 *
	 */
	public double getLongitudinalDistance(Coordinate secCoordinate){
		return Math.abs(this.getLongitude()-secCoordinate.getLongitude());
	}
	
	/**
	 *
	 */
	public Coordinate getDistance(Coordinate coordinate){
		return new Coordinate(getLatitudinalDistance(coordinate), getLongitudinalDistance(coordinate));

	}

	/**
	 *
	 */
	public double getLatitude(){
		return latitude;
	}
	/**
	 *
	 */
	public double getLongitude(){
		return longitude;
	}
}

