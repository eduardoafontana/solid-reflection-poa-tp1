package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ModifiersTest {

	@Test
	public void testModifiers_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");

		Field fieldTurboJetBoosterActivated = classJetSki.getDeclaredField("turboJetBoosterActivated");

		int modifierField = fieldTurboJetBoosterActivated.getModifiers();

		assertEquals(true, Modifier.isPrivate(modifierField));
		assertEquals(false, Modifier.isFinal(modifierField));

		int modifierClass = classJetSki.getModifiers();

		assertEquals(false, Modifier.isPrivate(modifierClass));
		assertEquals(true, Modifier.isPublic(modifierClass));
		assertEquals(false, Modifier.isAbstract(modifierClass));

		Method methodStartTurboJetBooster = classJetSki.getDeclaredMethod("startTurboJetBooster");
		int modifierMethodStartTurboJetBooster = methodStartTurboJetBooster.getModifiers();

		assertEquals(false, Modifier.isPrivate(modifierMethodStartTurboJetBooster));
		assertEquals(false, Modifier.isFinal(modifierMethodStartTurboJetBooster));
		assertEquals(false, Modifier.isStatic(modifierMethodStartTurboJetBooster));
		assertEquals(true, Modifier.isPublic(modifierMethodStartTurboJetBooster));
	}

	@Test
	public void testModifiers_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");

		Field fieldTurboPropellerActivated = classShip.getDeclaredField("turboPropellerActivated");

		int modifierTurboPropellerActivated = fieldTurboPropellerActivated.getModifiers();

		assertEquals(true, Modifier.isPrivate(modifierTurboPropellerActivated));
		assertEquals(false, Modifier.isFinal(modifierTurboPropellerActivated));

		Field fieldRadarOn = classShip.getDeclaredField("radarOn");

		int modifierRadarOn = fieldRadarOn.getModifiers();

		assertEquals(true, Modifier.isPrivate(modifierRadarOn));
		assertEquals(false, Modifier.isFinal(modifierRadarOn));

		int modifierClass = classShip.getModifiers();

		assertEquals(false, Modifier.isPrivate(modifierClass));
		assertEquals(true, Modifier.isPublic(modifierClass));
		assertEquals(false, Modifier.isAbstract(modifierClass));

		Method methodStartRadar = classShip.getDeclaredMethod("startRadar");
		int modifierMethodStartRadar = methodStartRadar.getModifiers();

		assertEquals(false, Modifier.isPrivate(modifierMethodStartRadar));
		assertEquals(false, Modifier.isFinal(modifierMethodStartRadar));
		assertEquals(false, Modifier.isStatic(modifierMethodStartRadar));
		assertEquals(true, Modifier.isPublic(modifierMethodStartRadar));
	}

	@Test
	public void testModifiers_JetSki_Watercraft() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();

		Field fieldEngineRunning = classWatercraft.getDeclaredField("engineRunning");

		int modifierEngineRunning = fieldEngineRunning.getModifiers();

		assertEquals(true, Modifier.isPrivate(modifierEngineRunning));
		assertEquals(false, Modifier.isFinal(modifierEngineRunning));

		int modifierClass = classWatercraft.getModifiers();

		assertEquals(false, Modifier.isPrivate(modifierClass));
		assertEquals(true, Modifier.isPublic(modifierClass));
		assertEquals(true, Modifier.isAbstract(modifierClass));

		Method methodStartEngine = classWatercraft.getDeclaredMethod("startEngine");
		int modifierMethodStartEngine = methodStartEngine.getModifiers();

		assertEquals(false, Modifier.isPrivate(modifierMethodStartEngine));
		assertEquals(false, Modifier.isFinal(modifierMethodStartEngine));
		assertEquals(false, Modifier.isStatic(modifierMethodStartEngine));
		assertEquals(true, Modifier.isPublic(modifierMethodStartEngine));
	}
}