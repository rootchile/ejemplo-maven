package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test 
	void contextLoads0() {
		String correcto = "hi";
		Assertions.assertThan(correcto).isEqualTo("hi");
	}

	@Test 
	void contextLoads1() {
		String correcto = "hi";
		Assertions.assertThan(correcto).isEqualTo("hi");
	}

}
