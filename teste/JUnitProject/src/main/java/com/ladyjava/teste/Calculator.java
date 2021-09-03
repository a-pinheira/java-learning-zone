package com.ladyjava.teste;

public class Calculator {

	public int somar(String exp) {
		int soma = 0;
		for (String vlrSoma : exp.split("\\+"))
			soma += Integer.valueOf(vlrSoma);
		System.out.println(soma);
		return soma;

	}

}
