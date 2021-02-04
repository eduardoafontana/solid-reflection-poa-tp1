package com.reflection;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MethodParametersTest {

	@Test
	public void testWatercraft_Name() throws Exception {
		Class<?> classJetSki = Class.forName("com.reflection.JetSki");
		Class<?> classWatercraft = classJetSki.getSuperclass();

		Object objectJetSki = classJetSki.getDeclaredConstructor().newInstance();

		Method methodSetName = classWatercraft.getDeclaredMethod("setName", String.class);
		methodSetName.invoke(objectJetSki, "One Thousand of Metal");

		Method methodGetName = classWatercraft.getDeclaredMethod("getName");
		Object valueGetName = methodGetName.invoke(objectJetSki);

		assertEquals("One Thousand of Metal", valueGetName);
	}
}