package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AnnotationTest {

	@Test
	public void testAnnotation_NotPresent() throws Exception {
		Class<TurboJetBoosterSwitch> classTurboJetBoosterSwitch = TurboJetBoosterSwitch.class;

		assertEquals(false, classTurboJetBoosterSwitch.isAnnotationPresent(TypeHeader.class));
	}

	@Test
	public void testAnnotation_isPresent() throws Exception {
		Class<Watercraft> classWatercraft = Watercraft.class;
		assertEquals(true, classWatercraft.isAnnotationPresent(TypeHeader.class));

		Class<JetSki> classJetSki = JetSki.class;
		assertEquals(true, classJetSki.isAnnotationPresent(TypeHeader.class));

		Class<Ship> classShip = Ship.class;
		assertEquals(true, classShip.isAnnotationPresent(TypeHeader.class));
	}

	@Test
	public void testAnnotation_Watercraft() throws Exception {
		Class<Watercraft> classWatercraft = Watercraft.class;

		TypeHeader singleAnnotation = classWatercraft.getDeclaredAnnotation(TypeHeader.class);

		assertEquals("Eduardo A. Fontana", singleAnnotation.developer());
		assertEquals("2021-02-03", singleAnnotation.lastModified());
		assertEquals(12, singleAnnotation.meaningOfLife());

		assertEquals("me", singleAnnotation.teamMembers()[0]);
		assertEquals("mySelf", singleAnnotation.teamMembers()[1]);
		assertEquals("andI", singleAnnotation.teamMembers()[2]);
	}
}