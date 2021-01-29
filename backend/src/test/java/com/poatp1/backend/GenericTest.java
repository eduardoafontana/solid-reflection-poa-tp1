package com.poatp1.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericTest {

	@LocalServerPort
	private int port;

	@Autowired
	protected TestRestTemplate restTemplate;

	protected String getUrl() {
		String server = "localhost";
		return "http://" + server + ":" + port;
	}

	protected Map<String, Object> getMap(Object object) throws Exception {
		Map<String, Object> map = new HashMap<String,Object>();
		Field[] allFields = object.getClass().getDeclaredFields();

		for (Field field : allFields) {
			field.setAccessible(true);

			try {
				Object value = field.get(object);
				map.put(field.getName(), value);
			} catch (Exception e) {
				throw e;
			}
		}

		return map;
	}

	protected ObjectMapper oMapper = new ObjectMapper();

	protected void clearDatabase() {

	}
}