package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FieldSetTest {

	@Test
	public void testField_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Field fieldTurboJetBoosterActivated = classJetSki.getDeclaredField("turboJetBoosterActivated");
		
		fieldTurboJetBoosterActivated.setAccessible(true);
		fieldTurboJetBoosterActivated.set(objectJetSki, true);

		assertEquals(true, ((JetSki) objectJetSki).isTurboJetBoosterActivated());
	}

	@Test
	public void testField_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		Object objectShip = classShip.getDeclaredConstructor().newInstance();

		Field fieldTurboPropellerActivated = classShip.getDeclaredField("turboPropellerActivated");

		fieldTurboPropellerActivated.setAccessible(true);
		fieldTurboPropellerActivated.set(objectShip, true);

		assertEquals(true, ((Ship) objectShip).isTurboPropellerActivated());

		Field fieldRadarOn = classShip.getDeclaredField("radarOn");

		fieldRadarOn.setAccessible(true);
		fieldRadarOn.set(objectShip, true);

		assertEquals(true, ((Ship) objectShip).isRadarOn());
	}

	@Test
	public void testField_JetSki_Watercraft() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();
		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Field fieldEngineRunning = classWatercraft.getDeclaredField("engineRunning");

		fieldEngineRunning.setAccessible(true);
		fieldEngineRunning.set(objectJetSki, true);

		assertEquals(true, ((JetSki) objectJetSki).isEngineRunning());
	}
}