package org.wahlzeit.model;

/**
 * Coordinate class
 * Providing basic coordinate functions
 */
public class Coordinate{

	private double latitude;	//geogr Breite
	private double longitude; 	//geogr Laenge

	/**
	 * @methodtype constructor
	 */
	public Coordinate(double latitude, double longitude){
		if(latitude < -180 || latitude > 180 || longitude < -90 || longitude > 90)
 			throw new IllegalArgumentException("Values out of range! Latitude[-180,180], Longitude[-90, 90]");
		
		this.latitude=latitude;
		this.longitude=longitude;	
	}
	
	/**
	 * @methodtype get
	 */
	public double getLatitudinalDistance(Coordinate secCoordinate){
		return Math.abs(this.getLatitude()-secCoordinate.getLatitude());
	}
	
	/**
	 * @methodtype get
	 */
	public double getLongitudinalDistance(Coordinate secCoordinate){
		return Math.abs(this.getLongitude()-secCoordinate.getLongitude());
	}
	
	/**
	 * @methodtype get
	 */
	public double getDistance (Coordinate coordinate) {
			double posALa = Math.PI*this.latitude/180;
			double posALo = Math.PI*this.longitude/180;
			double posBLa = Math.PI*coordinate.getLatitude()/180;
			double posBLo = Math.PI*coordinate.getLongitude()/180;

			return Math.acos(Math.sin(posALa)*Math.sin(posBLa) + 
							 Math.cos(posALa)*Math.cos(posBLa) *
							 Math.cos(posBLo-posALo))*6371;
		 	}

	/**
	 * @methodtype get
	 */
	public double getLatitude(){
		return latitude;
	}
	/**
	 * @methodtype get
	 */
	public double getLongitude(){
		return longitude;
	}
}

