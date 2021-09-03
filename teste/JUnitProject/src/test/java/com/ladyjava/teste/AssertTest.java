package com.ladyjava.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {

	// teste de Equals para os valores de um array
	@Test
	public void testAssertArrayEquals() {
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}

	// teste de Equals para uma string
	@Test
	public void testAssertEquals() {
		assertEquals("text", "text");
	}

	// teste de qualquer objeto/item se é falso - validação de um IF, por exemplo
	@Test
	public void testAssertFalse() {
		assertFalse(false);
	}

	// teste assertNotNull para ver se o objeto não retorna um valor nulo
	@Test
	public void testAssertNotBull() {
		assertNotNull(new Object());

	}

	// teste assertNotSame verifica se o objeto não são os mesmos
	@Test
	public void testAssertNotSame() {
		assertNotSame(new Object(), new Object());
	}

	// teste testAssertNull para garantir que aquele objeto esteja nulo em
	// determinado momento
	@Test
	public void testAssertNull() {
		assertNotNull(null);

	}

	// teste assertSame verifica se o objetos são os mesmos
	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(768);
		assertSame(aNumber, aNumber);
	}

}
