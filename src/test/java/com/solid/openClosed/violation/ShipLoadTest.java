package com.solid.openClosed.violation;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShipLoadTest {

	@Test
	public void testPower() throws Exception {
		Ship ship = new Ship();

		ship.setPower(200);
		ship.setWaterlineHeight(5);

		assertEquals(200, ship.getPower());
		assertEquals(5, ship.getWaterlineHeight());
	}

	@Test
	public void testSetLoadEmpty() throws Exception {
		Ship ship = new Ship();
		ship.setPower(200);
		ship.setWaterlineHeight(5);

		EventHandler eventHandler = new EventHandler(ship);

		eventHandler.changeLoadingMode(LoadingMode.EMPTY);

		assertEquals(500, ship.getPower());
		assertEquals(10, ship.getWaterlineHeight());
	}

	@Test
	public void testSetLoadPartiallyLoaded() throws Exception {
		Ship ship = new Ship();
		ship.setPower(200);
		ship.setWaterlineHeight(5);

		EventHandler eventHandler = new EventHandler(ship);

		eventHandler.changeLoadingMode(LoadingMode.PARTIALLYLOADED);

		assertEquals(400, ship.getPower());
		assertEquals(20, ship.getWaterlineHeight());
	}

	@Test
	public void testSetLoadLoaded() throws Exception {
		Ship ship = new Ship();
		ship.setPower(200);
		ship.setWaterlineHeight(5);

		EventHandler eventHandler = new EventHandler(ship);

		eventHandler.changeLoadingMode(LoadingMode.LOADED);

		assertEquals(300, ship.getPower());
		assertEquals(30, ship.getWaterlineHeight());
	}
}
