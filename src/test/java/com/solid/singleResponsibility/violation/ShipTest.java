package com.solid.singleResponsibility.violation;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShipTest {

	@Test
	public void testFuel() throws Exception {
		Ship ship = new Ship(10);

		assertEquals(10, ship.getMaxFuel());
		assertEquals(10, ship.getRemainingFuel());
	}

	@Test
	public void testAccelerate() throws Exception {
		Ship ship = new Ship(10);

		ship.accelerate();

		assertEquals(10, ship.getMaxFuel());
		assertEquals(9, ship.getRemainingFuel());
	}

	@Test
	public void testSetRemainingFuel() throws Exception {
		Ship ship = new Ship(10);

		ship.setRemainingFuel(2);

		assertEquals(10, ship.getMaxFuel());
		assertEquals(2, ship.getRemainingFuel());
	}

	@Test
	public void testReFuel() throws Exception {
		Ship ship = new Ship(10);
		ship.accelerate();
		ship.accelerate();
		ship.accelerate();

		assertEquals(7, ship.getRemainingFuel());

		ship.reFuel();

		assertEquals(10, ship.getMaxFuel());
		assertEquals(10, ship.getRemainingFuel());
	}
}
