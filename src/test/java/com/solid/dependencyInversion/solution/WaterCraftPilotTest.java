package com.solid.dependencyInversion.solution;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WatercraftPilotTest {

	@Test
	public void testJetSkiPilot() throws Exception {
		JetSki jetSki = new JetSki(100);
		Pilot pilot = new Pilot(jetSki);

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(100, pilot.getWatercraft().getRemainingFuel());
		assertEquals(0, pilot.getWatercraft().getPower());
	}

	@Test
	public void testJetSkiPilot_accelerate() throws Exception {
		JetSki jetSki = new JetSki(100);
		Pilot pilot = new Pilot(jetSki);

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(99, pilot.getWatercraft().getRemainingFuel());
		assertEquals(1, pilot.getWatercraft().getPower());
	}

	@Test
	public void testShipPilot() throws Exception {
		Ship ship = new Ship(100);
		Pilot pilot = new Pilot(ship);

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(100, pilot.getWatercraft().getRemainingFuel());
		assertEquals(0, pilot.getWatercraft().getPower());
	}

	@Test
	public void testShipPilot_accelerate() throws Exception {
		Ship ship = new Ship(100);
		Pilot pilot = new Pilot(ship);

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWatercraft().getMaxFuel());
		assertEquals(98, pilot.getWatercraft().getRemainingFuel());
		assertEquals(2, pilot.getWatercraft().getPower());
	}
}
