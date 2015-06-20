package ch.goodrick.brewcontrol.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.goodrick.brewcontrol.sensor.CalibrateTemperatureSensor;

public class CalibrateTemperatureSensorTest extends CalibrateTemperatureSensor {
	@Test
	public void testGetCalibratedValue() {
		calibrate(0, 102, 0);
		assertEquals(49, getCalibratedValue(50), 0.1);
		calibrate(-1, 101, 0);
		assertEquals(0d, getCalibratedValue(-1), 0.1);
		assertEquals(1d, getCalibratedValue(0), 0.1);
		assertEquals(50d, getCalibratedValue(50), 0.1);
		assertEquals(100d, getCalibratedValue(101), 0.1);

	}

}
