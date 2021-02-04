package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InterfacesTest {

	@Test
	public void testInterface_JetSki() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");

		Class<?>[] interfaces = classJetSki.getInterfaces();

		assertEquals(1, interfaces.length);
		assertEquals(TurboJetBoosterSwitch.class, interfaces[0]);
	}

	@Test
	public void testInterface_Ship() throws Exception {
		Class<?> classShip = Class.forName("com.reflection.Ship");

		Class<?>[] interfaces = classShip.getInterfaces();

		assertEquals(2, interfaces.length);
		assertEquals(TurboPropellerSwitch.class, interfaces[0]);
		assertEquals(RadarSwitch.class, interfaces[1]);
	}

	@Test
	public void testInterface_JetSki_Watercraft() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();

		Class<?>[] interfaces = classWatercraft.getInterfaces();

		assertEquals(1, interfaces.length);
		assertEquals(EngineSwitch.class, interfaces[0]);
	}
}