package com.java.myproject.myproject;

import com.java.myproject.myproject.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
//@AutoConfigureMockMvc
class MyprojectApplicationTests {

	@Autowired
	TestController testController;

//	@Autowired
//	private MockMvc mockMvc;

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
		assertEquals(30, result);
	}

//	@Test
//	void testEndPoint() throws Exception {
//       mockMvc.perform(get("/test"))
//			   .andExpect(status().isOk())
//			   .andExpect(content().string("Hello World CI/CD!!!"));
//	}
//
//	@Test
//	void welcomeEndpoint() throws Exception {
//		mockMvc.perform(get("/test/welcome"))
//				.andExpect(status().isOk())
//				.andExpect(content().string("Welcome to CI/CD!!!"));
//	}
//
//	@Test
//	void additionEndPoint() throws Exception {
//		mockMvc.perform(get("/test/addition"))
//				.andExpect(status().isOk())
//				.andExpect(content().string("30"));
//	}
}
