package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IntrospectionTest {

	@Test
	public void testClassType_JetSki() throws Exception {
		JetSki jetSki = new JetSki();
		
		assertEquals(true, jetSki instanceof JetSki);
	}

	@Test
	public void testClassType_Ship() throws Exception {
		Ship ship = new Ship();
		
		assertEquals(true, ship instanceof Ship);
	}

	@Test
	public void testClassType_Watercraft() throws Exception {
		Ship ship = new Ship();
		
		assertEquals(Watercraft.class, ship.getClass().getSuperclass());
	}

	@Test
	public void testMethodType_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		
		Method methodIsTurboJetBoosterActivated = classJetSki.getDeclaredMethod("isTurboJetBoosterActivated");
		Class<?> typeIsEngineRunning = methodIsTurboJetBoosterActivated.getReturnType();
		
		assertEquals(boolean.class, typeIsEngineRunning);
	}

	@Test
	public void testMethodType_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		
		Method methodIsRadarOn = classShip.getDeclaredMethod("isRadarOn");
		Class<?> typeIsRadarOn = methodIsRadarOn.getReturnType();
		
		assertEquals(boolean.class, typeIsRadarOn);
	}

	@Test
	public void testMethodType_Watercraft() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		Class<?> classWatercraft = classShip.getSuperclass();
		
		Method methodIsEngineRunning = classWatercraft.getDeclaredMethod("isEngineRunning");
		Class<?> typeIsEngineRunning = methodIsEngineRunning.getReturnType();
		
		assertEquals(boolean.class, typeIsEngineRunning);

		Method methodGetName = classWatercraft.getDeclaredMethod("getName");
		Class<?> typeGetName = methodGetName.getReturnType();
		
		assertEquals(String.class, typeGetName);
	}

	@Test
	public void testFieldType_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		
		Field fieldTurboJetBoosterActivated = classJetSki.getDeclaredField("turboJetBoosterActivated");
		Class<?> typeTurboJetBoosterActivated = fieldTurboJetBoosterActivated.getType();
		
		assertEquals(boolean.class, typeTurboJetBoosterActivated);
	}

	@Test
	public void testFieldType_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		
		Field fieldRadarOn = classShip.getDeclaredField("radarOn");
		Class<?> typeRadarOn = fieldRadarOn.getType();
		
		assertEquals(boolean.class, typeRadarOn);
	}

	@Test
	public void testFieldType_Watercraft() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");
		Class<?> classWatercraft = classShip.getSuperclass();
		
		Field fieldEngineRunning = classWatercraft.getDeclaredField("engineRunning");
		Class<?> typeEngineRunning = fieldEngineRunning.getType();
		
		assertEquals(boolean.class, typeEngineRunning);

		Field fieldName = classWatercraft.getDeclaredField("name");
		Class<?> typeName = fieldName.getType();
		
		assertEquals(String.class, typeName);
	}
}