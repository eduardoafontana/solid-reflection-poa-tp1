package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FieldGetTest {

	@Test
	public void testField_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Field fieldTurboJetBoosterActivated = classJetSki.getDeclaredField("turboJetBoosterActivated");
		
		fieldTurboJetBoosterActivated.setAccessible(true);
		Object value = fieldTurboJetBoosterActivated.get(objectJetSki);

		assertEquals(false, (Boolean) value);
	}

	@Test
	public void testField_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		Object objectShip = classShip.getDeclaredConstructor().newInstance();

		Field fieldTurboPropellerActivated = classShip.getDeclaredField("turboPropellerActivated");

		fieldTurboPropellerActivated.setAccessible(true);
		Object valueTurboPropellerActivated = fieldTurboPropellerActivated.get(objectShip);

		assertEquals(false, (Boolean) valueTurboPropellerActivated);

		Field fieldRadarOn = classShip.getDeclaredField("radarOn");

		fieldRadarOn.setAccessible(true);
		Object valueRadarOn = fieldRadarOn.get(objectShip);

		assertEquals(false, (Boolean) valueRadarOn);
	}

	@Test
	public void testField_JetSki_Watercraft() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();
		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Field fieldEngineRunning = classWatercraft.getDeclaredField("engineRunning");

		fieldEngineRunning.setAccessible(true);
		Object valueEngineRunning = fieldEngineRunning.get(objectJetSki);

		assertEquals(false, (Boolean) valueEngineRunning);
	}
}