package com.solid.dependencyInversion.violation;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WatercraftPilotTest {

	@Test
	public void testJetSkiPilot() throws Exception {
		JetSkiPilot pilot = new JetSkiPilot();

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(100, pilot.getWatercraft().getRemainingFuel());
		assertEquals(0, pilot.getWatercraft().getPower());
	}

	@Test
	public void testJetSkiPilot_accelerate() throws Exception {
		JetSkiPilot pilot = new JetSkiPilot();

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(99, pilot.getWatercraft().getRemainingFuel());
		assertEquals(1, pilot.getWatercraft().getPower());
	}

	@Test
	public void testShipPilot() throws Exception {
		ShipPilot pilot = new ShipPilot();

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(100, pilot.getWatercraft().getRemainingFuel());
		assertEquals(0, pilot.getWatercraft().getPower());
	}

	@Test
	public void testShipPilot_accelerate() throws Exception {
		ShipPilot pilot = new ShipPilot();

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(98, pilot.getWatercraft().getRemainingFuel());
		assertEquals(2, pilot.getWatercraft().getPower());
	}
}
