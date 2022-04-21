package com.ladyjava.formulas.fatorial;

import java.util.Scanner;

/*
 * Simone  Lady Java
 * Exercício que calcula fatorial.
 * Fazer consistencia de nums positivos, a partir de zero (0).
 */

public class Fatorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fat = 1, exp;

		Scanner io = new Scanner(System.in);
		System.out.println("Digite um número fat: ");
		n = io.nextInt();
//		System.out.println("Digite um número do expoente" + exp);
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				fat = fat * i;
			}
			System.out.println("Fatorial: " + fat);
		} else {
			System.out.println("Informe numero a partir de zero [positivos]");
		}
	}
}
