 package com.ladyjava.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSomar() {
		Calculator calc = new Calculator();
		//vamos testar o valor que o metodo somar retorna, no caso é o valor de INT (Inteiro)
		int soma = calc.somar("1+3+1");
		assertEquals(5, soma);

	}

}
