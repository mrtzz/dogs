/*
 * Copyright (c) 2006-2009 by Dirk Riehle, http://dirkriehle.com
 *
 * This file is part of the Wahlzeit photo rating application.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.wahlzeit.model;

import org.wahlzeit.services.LogBuilder;

import java.util.logging.Logger;

/**
 * An Abstract Factory for creating photos and related objects.
 */
public class DogPhotoFactory extends PhotoFactory {

	private static final Logger log = Logger.getLogger(DogPhotoFactory.class.getName());
	/**
	 * Hidden singleton instance; needs to be initialized from the outside.
	 */
	private static DogPhotoFactory instance = null;

	/**
	 *
	 */
	protected DogPhotoFactory() {
		// do nothing
	}

	/**
	 * Public singleton access method.
	 */
	public static synchronized DogPhotoFactory getInstance() {
		if (instance == null) {
			log.config(LogBuilder.createSystemMessage().addAction("setting generic DogPhotoFactory").toString());
			setInstance(new DogPhotoFactory());
		}

		return instance;
	}

	/**
	 * Method to set the singleton instance of PhotoFactory.
	 */
	protected static synchronized void setInstance(DogPhotoFactory photoFactory) {
		if (instance != null) {
			throw new IllegalStateException("attempt to initalize DogPhotoFactory twice");
		}

		instance = photoFactory;
	}

	/**
	 * @methodtype factory
	 */
	public DogPhoto createPhoto() {
		return new DogPhoto();
	}

	/**
	 * Creates a new photo with the specified id
	 */
	public DogPhoto createPhoto(PhotoId id) {
		return new DogPhoto(id);
	}


}
