package com.poatp1.solid.liskovSubstitution.violation;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ShipTypeTest {

	@Test
	public void testTypeShip() throws Exception {
		WaterCraft ship = new Ship();
		ship.changeState(State.CRUISING);

		assertEquals(State.CRUISING, ship.getState());
	}

	@Test
	public void testTypeJetSki() throws Exception {
		WaterCraft jetSki = new JetSki();
		jetSki.changeState(State.MOVING);

		assertEquals(State.MOVING, jetSki.getState());
	}

	@Test
	public void testTypeJetSkiCruising() throws Exception {
		WaterCraft jetSki = new JetSki();
		
		Exception exception = assertThrows(Exception.class, () -> {
			jetSki.changeState(State.CRUISING);
		});

		assertEquals("JetSki does not support Cruising and Towing movement states.", exception.getMessage());
	}
}
