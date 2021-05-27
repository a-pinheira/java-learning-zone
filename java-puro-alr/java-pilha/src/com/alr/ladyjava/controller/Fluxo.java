package com.alr.ladyjava.controller;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		//chamada do metódo na main
		metodo1();
		System.out.println("Fim do main");
	}

	//chamada do metódo 1
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	} 

	//chamada do metódo 2
	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do metodo2 - yep");
	}
}