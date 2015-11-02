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

import com.google.appengine.api.images.Image;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.Transform;
import org.wahlzeit.services.LogBuilder;

import java.util.logging.Logger;

/**
 * PhotoUtil provides a set of utility functions to create defined images.
 * Images are created from a source in different sizes as needed by the app.
 */
public class DogPhotoUtil extends PhotoUtil {

	private static final Logger log = Logger.getLogger(DogPhotoUtil.class.getName());

	/**
	 * @methodtype creation
	 */
	public static DogPhoto createPhoto(String filename, PhotoId id, Image uploadedImage) throws Exception {
		DogPhoto result = DogPhotoFactory.getInstance().createPhoto(id);
		result.setEnding(filename.substring(filename.lastIndexOf(".") + 1));

		createImageFiles(uploadedImage, result);

		int sourceWidth = uploadedImage.getWidth();
		int sourceHeight = uploadedImage.getHeight();
		result.setWidthAndHeight(sourceWidth, sourceHeight);

		return result;
	}

}
