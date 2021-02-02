package com.poatp1.solid.dependencyInversion.solution;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WaterCraftPilotTest {

	@Test
	public void testJetSkiPilot() throws Exception {
		JetSki jetSki = new JetSki(100);
		Pilot pilot = new Pilot(jetSki);

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(100, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(0, pilot.getWaterCraft().getPower());
	}

	@Test
	public void testJetSkiPilot_accelerate() throws Exception {
		JetSki jetSki = new JetSki(100);
		Pilot pilot = new Pilot(jetSki);

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(99, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(1, pilot.getWaterCraft().getPower());
	}

	@Test
	public void testShipPilot() throws Exception {
		Ship ship = new Ship(100);
		Pilot pilot = new Pilot(ship);

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(100, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(0, pilot.getWaterCraft().getPower());
	}

	@Test
	public void testShipPilot_accelerate() throws Exception {
		Ship ship = new Ship(100);
		Pilot pilot = new Pilot(ship);

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(98, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(2, pilot.getWaterCraft().getPower());
	}
}
