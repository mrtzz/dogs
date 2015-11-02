package org.wahlzeit.model;


public class Location{

	private String name;	
	public Coordinate coordinate;
	
	/**
	 * @methodtype constructor
	 */
	public Location(String name, Coordinate coordinate){
		this.name=name;
		this.coordinate=coordinate;	
	}
	
	/**
	 * @methodtype get
	 */
	public String getName(){
		return this.name;
	}
}

