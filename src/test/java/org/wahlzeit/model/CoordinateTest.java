package org.wahlzeit.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {

	private Coordinate a,b,c,d;
	private final double delta = 0.001;
	@Before
	public void setup() {
		a = new Coordinate(0,0);
		b = new Coordinate(10, 0);
		c = new Coordinate(0,-3.6);
		d = new Coordinate(-4,6);
	}

	/**
	 *
	 */
	@Test
	public void getLatitudinalDistanceTest(){
		assertEquals(0, a.getLatitudinalDistance(a), delta);
		assertEquals(0, d.getLatitudinalDistance(d), delta);
		assertEquals(14, b.getLatitudinalDistance(d), delta);
		assertEquals(d.getLatitudinalDistance(b), b.getLatitudinalDistance(d), delta);
	}
	
	/**
	 *
	 */
	@Test
	public void getLongitudinalDistanceTest(){
		assertEquals(0, a.getLongitudinalDistance(a), delta);
		assertEquals(0, d.getLongitudinalDistance(d), delta);
		assertEquals(9.6, c.getLongitudinalDistance(d), delta);
		assertEquals(d.getLongitudinalDistance(c), c.getLongitudinalDistance(d), delta);
	}

	/**
	 *
	 */
	@Test
	public void getDistanceTest(){
		/*assertEquals(0, a.getDistance(a).getLatitude(), delta);
		assertEquals(0, a.getDistance(a).getLongitude(), delta);
		assertEquals(Math.abs(d.getLongitude()), a.getDistance(d).getLongitude(), delta);
		assertEquals(Math.abs(d.getLatitude()), a.getDistance(d).getLatitude(), delta);*/
	}

}
