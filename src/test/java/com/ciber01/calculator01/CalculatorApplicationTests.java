package com.ciber01.calculator01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Calculator01ApplicationTests {

	private Calculator calculator = new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
