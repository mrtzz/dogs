package org.wahlzeit.model;

import com.googlecode.objectify.annotation.Subclass;

@Subclass
public class DogPhoto extends Photo{
	
	private int birthyear;
	private Breed breed;

	/**
	 * @methodtype constructor
	 */
	public DogPhoto() {
		super();
	}

	/**
	 * @methodtype constructor
	 */
	public DogPhoto(PhotoId myId) {
		super(myId);
	}
	
	/**
	 * @methodtype constructor
	 */
	public DogPhoto(PhotoId myId, int birthyear, Breed breed) {
		super(myId);
		this.birthyear=birthyear;
		this.breed=breed;
	}
	
	/**
	 * @methodtype get
	 */
	public int getBirthyear() {
		return this.birthyear;
	}
	
	/**
	 * @methodtype get
	 */
	public Breed breed() {
		return this.breed;
	}
	
	//no setters, birthyear and breed do not change
}
