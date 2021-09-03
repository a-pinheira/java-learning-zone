package com.ladyjava.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	//Teste de expected com IndexOutOfBoundsException
	//simulamos true, para qnd é esperado que dê a exceção
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		//array list vazio e pega o primeiro objeto que não retorná nada
		new ArrayList<Object>().get(0);
	
	//simulando falha uma situação em que não tenha a exceção com Lista de String
	/*
	 * List<String> lista = new ArrayList<String>();
	 * lista.add("Simone");
	 * lista.get(0);
	 */
	}
	//Teste de expected com throws 
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shouldTestExpectedExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<Object>();
		thrown.expectMessage("Index: 0, Size: 0");
		list.get(0);
		
	}

}
