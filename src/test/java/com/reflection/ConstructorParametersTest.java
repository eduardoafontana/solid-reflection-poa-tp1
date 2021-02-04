package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConstructorParametersTest {

	@Test
	public void testConstructor_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");

		Constructor<?> constructorJetSki = classJetSki.getDeclaredConstructor(boolean.class);
		
		Object objectJetSki = constructorJetSki.newInstance(true);

		Field fieldTurboJetBoosterActivated = classJetSki.getDeclaredField("turboJetBoosterActivated");
		
		fieldTurboJetBoosterActivated.setAccessible(true);
		Object value = fieldTurboJetBoosterActivated.get(objectJetSki);

		assertEquals(true, (Boolean) value);
	}

	@Test
	public void testConstructor_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");

		Constructor<?> constructorShip = classShip.getDeclaredConstructor(boolean.class, boolean.class);

		Object objectShip = constructorShip.newInstance(true, true);

		Field fieldTurboPropellerActivated = classShip.getDeclaredField("turboPropellerActivated");

		fieldTurboPropellerActivated.setAccessible(true);
		Object valueTurboPropellerActivated = fieldTurboPropellerActivated.get(objectShip);

		assertEquals(true, (Boolean) valueTurboPropellerActivated);

		Field fieldRadarOn = classShip.getDeclaredField("radarOn");

		fieldRadarOn.setAccessible(true);
		Object valueRadarOn = fieldRadarOn.get(objectShip);

		assertEquals(true, (Boolean) valueRadarOn);
	}

	@Test
	public void testConstructor_JetSki_Watercraft() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");

		Constructor<?> constructorJetSki = classJetSki.getDeclaredConstructor(boolean.class);

		Class<?> classWatercraft = classJetSki.getSuperclass();
		Object objectJetSki = constructorJetSki.newInstance(true);

		Field fieldEngineRunning = classWatercraft.getDeclaredField("engineRunning");

		fieldEngineRunning.setAccessible(true);
		Object valueEngineRunning = fieldEngineRunning.get(objectJetSki);

		assertEquals(true, (Boolean) valueEngineRunning);
	}
}