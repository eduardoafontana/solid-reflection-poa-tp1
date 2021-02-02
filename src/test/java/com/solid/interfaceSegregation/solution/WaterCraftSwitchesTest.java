package com.solid.interfaceSegregation.solution;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WatercraftSwitchesTest {

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
}
