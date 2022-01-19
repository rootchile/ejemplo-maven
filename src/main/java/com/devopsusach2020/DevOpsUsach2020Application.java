package com.devopsusach2020;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsUsach2020Application {

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
