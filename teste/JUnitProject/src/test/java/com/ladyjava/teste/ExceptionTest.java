package com.ladyjava.teste;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	// Teste de expected com IndexOutOfBoundsException
	// simulamos true, para qnd é esperado que dê a exceção

/*	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
	// array list vazio e pega o primeiro objeto que não retorná nada
		//new ArrayList<Object>().get(0);

		// simulando falha uma situação em que não tenha a exceção com Lista de String
		List<String> lista = new ArrayList<String>();
		// lista.add("Simone");
		lista.get(0);
	}
	*/

	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<Object>();
		// esse teste serve somente para esta msg de string, ou seja,
		// precisa saber/conhecer qual a mensagen
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");
		list.get(0);
	}

	//	Example Try Catch Idiom 
	//	@SuppressWarnings("deprecation")
	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançada");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
		}
	}

	private Object is(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
