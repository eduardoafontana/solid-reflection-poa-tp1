package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WatercraftSwitchesWithReflectionTest {

	@Test
	public void testJetSkiSwitches_On() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();
		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Method methodStartEngine = classWatercraft.getDeclaredMethod("startEngine");
		methodStartEngine.invoke(objectJetSki);

		Method methodStartTurboJetBooster = classJetSki.getDeclaredMethod("startTurboJetBooster");
		methodStartTurboJetBooster.invoke(objectJetSki);

		Method methodIsEngineRunning = classWatercraft.getDeclaredMethod("isEngineRunning");
		Boolean isEngineRunning = (boolean) methodIsEngineRunning.invoke(objectJetSki);

		Method methodIsTurboJetBoosterActivated = classJetSki.getDeclaredMethod("isTurboJetBoosterActivated");
		Boolean isTurboJetBoosterActivated = (boolean) methodIsTurboJetBoosterActivated.invoke(objectJetSki);

		assertEquals(true, isEngineRunning);
		assertEquals(true, isTurboJetBoosterActivated);
	}

	@Test
	public void testJetSkiSwitches_Off() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();
		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Method methodStartEngine = classWatercraft.getDeclaredMethod("startEngine");
		methodStartEngine.invoke(objectJetSki);

		Method methodStartTurboJetBooster = classJetSki.getDeclaredMethod("startTurboJetBooster");
		methodStartTurboJetBooster.invoke(objectJetSki);

		Method methodIsEngineRunning = classWatercraft.getDeclaredMethod("isEngineRunning");
		Boolean isEngineRunning = (boolean) methodIsEngineRunning.invoke(objectJetSki);

		Method methodIsTurboJetBoosterActivated = classJetSki.getDeclaredMethod("isTurboJetBoosterActivated");
		Boolean isTurboJetBoosterActivated = (boolean) methodIsTurboJetBoosterActivated.invoke(objectJetSki);

		assertEquals(true, isEngineRunning);
		assertEquals(true, isTurboJetBoosterActivated);

		Method methodShutDownEngine = classWatercraft.getDeclaredMethod("shutDownEngine");
		methodShutDownEngine.invoke(objectJetSki);

		Method methodShutDownTurboJetBooster = classJetSki.getDeclaredMethod("shutDownTurboJetBooster");
		methodShutDownTurboJetBooster.invoke(objectJetSki);

		assertEquals(false, (boolean) methodIsEngineRunning.invoke(objectJetSki));
		assertEquals(false, (boolean) methodIsTurboJetBoosterActivated.invoke(objectJetSki));
	}

	@Test
	public void testShipSwitches_On() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		Class<?> classWatercraft = classShip.getSuperclass();
		Object objectShip = classShip.getDeclaredConstructor().newInstance();

		Method methodStartEngine = classWatercraft.getDeclaredMethod("startEngine");
		methodStartEngine.invoke(objectShip);

		Method methodStartTurboPropeller = classShip.getDeclaredMethod("startTurboPropeller");
		methodStartTurboPropeller.invoke(objectShip);

		Method methodStartRadar = classShip.getDeclaredMethod("startRadar");
		methodStartRadar.invoke(objectShip);

		Method methodIsEngineRunning = classWatercraft.getDeclaredMethod("isEngineRunning");
		Boolean isEngineRunning = (boolean) methodIsEngineRunning.invoke(objectShip);

		Method methodIsTurboPropellerActivated = classShip.getDeclaredMethod("isTurboPropellerActivated");
		Boolean isTurboPropellerActivated = (boolean) methodIsTurboPropellerActivated.invoke(objectShip);
		
		Method methodIsRadarOn = classShip.getDeclaredMethod("isRadarOn");
		Boolean isRadarOn = (boolean) methodIsRadarOn.invoke(objectShip);

		assertEquals(true, isEngineRunning);
		assertEquals(true, isTurboPropellerActivated);
		assertEquals(true, isRadarOn);
	}

	@Test
	public void testShipSwitches_Off() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		Class<?> classWatercraft = classShip.getSuperclass();
		Object objectShip = classShip.getDeclaredConstructor().newInstance();

		Method methodStartEngine = classWatercraft.getDeclaredMethod("startEngine");
		methodStartEngine.invoke(objectShip);

		Method methodStartTurboPropeller = classShip.getDeclaredMethod("startTurboPropeller");
		methodStartTurboPropeller.invoke(objectShip);

		Method methodStartRadar = classShip.getDeclaredMethod("startRadar");
		methodStartRadar.invoke(objectShip);

		Method methodIsEngineRunning = classWatercraft.getDeclaredMethod("isEngineRunning");
		Boolean isEngineRunning = (boolean) methodIsEngineRunning.invoke(objectShip);

		Method methodIsTurboPropellerActivated = classShip.getDeclaredMethod("isTurboPropellerActivated");
		Boolean isTurboPropellerActivated = (boolean) methodIsTurboPropellerActivated.invoke(objectShip);
		
		Method methodIsRadarOn = classShip.getDeclaredMethod("isRadarOn");
		Boolean isRadarOn = (boolean) methodIsRadarOn.invoke(objectShip);

		assertEquals(true, isEngineRunning);
		assertEquals(true, isTurboPropellerActivated);
		assertEquals(true, isRadarOn);

		Method methodShutDownEngine = classWatercraft.getDeclaredMethod("shutDownEngine");
		methodShutDownEngine.invoke(objectShip);

		Method methodShutDownTurboPropeller = classShip.getDeclaredMethod("shutDownTurboPropeller");
		methodShutDownTurboPropeller.invoke(objectShip);

		Method methodShutDownRadar = classShip.getDeclaredMethod("shutDownRadar");
		methodShutDownRadar.invoke(objectShip);

		assertEquals(false, (boolean) methodIsEngineRunning.invoke(objectShip));
		assertEquals(false, (boolean) methodIsTurboPropellerActivated.invoke(objectShip));
		assertEquals(false, (boolean) methodIsRadarOn.invoke(objectShip));
	}
}
