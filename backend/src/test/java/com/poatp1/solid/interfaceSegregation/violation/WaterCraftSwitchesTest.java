package com.poatp1.solid.interfaceSegregation.violation;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class WaterCraftSwitchesTest {

	@Test
	public void testJetSkiSwitches_On() throws Exception {
		JetSki jetSki = new JetSki();
		jetSki.startEngine();
		jetSki.startTurboJetBooster();

		assertEquals(true, jetSki.isEngineRunning());
		assertEquals(true, jetSki.isTurboJetBoosterActivated());
	}

	@Test
	public void testJetSkiSwitches_Off() throws Exception {
		JetSki jetSki = new JetSki();
		jetSki.startEngine();
		jetSki.startTurboJetBooster();

		assertEquals(true, jetSki.isEngineRunning());
		assertEquals(true, jetSki.isTurboJetBoosterActivated());

		jetSki.shutDownEngine();
		jetSki.shutDownTurboJetBooster();

		assertEquals(false, jetSki.isEngineRunning());
		assertEquals(false, jetSki.isTurboJetBoosterActivated());
	}

	@Test
	public void testShipSwitches_On() throws Exception {
		Ship ship = new Ship();
		ship.startEngine();
		ship.startTurboPropeller();
		ship.startRadar();

		assertEquals(true, ship.isEngineRunning());
		assertEquals(true, ship.isTurboPropellerActivated());
		assertEquals(true, ship.isRadarOn());
	}

	@Test
	public void testShipSwitches_Off() throws Exception {
		Ship ship = new Ship();
		ship.startEngine();
		ship.startTurboPropeller();
		ship.startRadar();

		assertEquals(true, ship.isEngineRunning());
		assertEquals(true, ship.isTurboPropellerActivated());
		assertEquals(true, ship.isRadarOn());

		ship.shutDownEngine();
		ship.shutDownTurboPropeller();
		ship.shutDownRadar();

		assertEquals(false, ship.isEngineRunning());
		assertEquals(false, ship.isTurboPropellerActivated());
		assertEquals(false, ship.isRadarOn());
	}

	@Test
	public void testJetSkiSwitches_fromShip() throws UnsupportedOperationException {
		JetSki jetSki = new JetSki();

		assertThrows(UnsupportedOperationException.class, () -> {
			jetSki.startTurboPropeller();
		});

		assertThrows(UnsupportedOperationException.class, () -> {
			jetSki.shutDownTurboPropeller();
		});

		assertThrows(UnsupportedOperationException.class, () -> {
			jetSki.startRadar();
		});

		assertThrows(UnsupportedOperationException.class, () -> {
			jetSki.shutDownRadar();
		});
	}

	@Test
	public void testShipSwitches_fromJetSki() throws UnsupportedOperationException {
		Ship ship = new Ship();

		assertThrows(UnsupportedOperationException.class, () -> {
			ship.startTurboJetBooster();
		});

		assertThrows(UnsupportedOperationException.class, () -> {
			ship.shutDownTurboJetBooster();
		});
	}
}
