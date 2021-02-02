package com.solid.liskovSubstitution.solution;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShipTypeTest {

	@Test
	public void testTypeShip_StateTravel() throws Exception {
		WaterCraftTravel ship = new Ship();
		ship.changeState(StateTravel.CRUISING);

		assertEquals(StateTravel.CRUISING, ship.getState());
	}

	@Test
	public void testTypeShip_StateGeneral() throws Exception {
		WaterCraftTravel ship = new Ship();
		ship.changeState(StateGeneral.MOORED);

		assertEquals(StateGeneral.MOORED, ship.getState());
	}

	@Test
	public void testTypeJetSki_StateGeneral() throws Exception {
		WaterCraftSport jetSki = new JetSki();
		//jetSki.changeState(StateTravel.TOWING); //Syntax error, JetSki does not support travel states.
		jetSki.changeState(StateGeneral.MOORED);

		assertEquals(StateGeneral.MOORED, jetSki.getState());
	}
}
