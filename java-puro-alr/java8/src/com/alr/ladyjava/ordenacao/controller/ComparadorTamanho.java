package com.alr.ladyjava.ordenacao.controller;

import java.util.Comparator;
import java.util.function.Consumer;

public class ComparadorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// length da string compara tamanho da string
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		} else
			return 0;
	}

	// Interface do Java8 Consummer
	// package: java.util.function
	public class ImprimeNaLinha implements Consumer<String> {

		@Override
		public void accept(String s) {
			System.out.println("teste string do método:" + s);

		}

	}
}
