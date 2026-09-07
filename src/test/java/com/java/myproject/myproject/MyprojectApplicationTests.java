package com.java.myproject.myproject;

import com.java.myproject.myproject.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MyprojectApplicationTests {

	@Autowired
	TestController testController;

	@Test
	void contextLoads() {
	}

	@Test
	void test(){
		String result = testController.test();
		assertEquals("Hello World CI/CD!!!", result);
	}

	@Test
	void testWelcome() {
		String result = testController.testWelcome();
		assertEquals("Welcome to CI/CD!!!", result);
	}

	@Test
	void addition() {
		Integer result = testController.addition();
		assertEquals(50, result);
	}
}
