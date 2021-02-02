package com.poatp1.solid.dependencyInversion.violation;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WaterCraftPilotTest {

	@Test
	public void testJetSkiPilot() throws Exception {
		JetSkiPilot pilot = new JetSkiPilot();

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(100, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(0, pilot.getWaterCraft().getPower());
	}

	@Test
	public void testJetSkiPilot_accelerate() throws Exception {
		JetSkiPilot pilot = new JetSkiPilot();

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(99, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(1, pilot.getWaterCraft().getPower());
	}

	@Test
	public void testShipPilot() throws Exception {
		ShipPilot pilot = new ShipPilot();

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(100, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(0, pilot.getWaterCraft().getPower());
	}

	@Test
	public void testShipPilot_accelerate() throws Exception {
		ShipPilot pilot = new ShipPilot();

		pilot.increaseSpeed();

		assertEquals(100, pilot.getWaterCraft().getMaxFuel());
		assertEquals(98, pilot.getWaterCraft().getRemainingFuel());
		assertEquals(2, pilot.getWaterCraft().getPower());
	}
}
