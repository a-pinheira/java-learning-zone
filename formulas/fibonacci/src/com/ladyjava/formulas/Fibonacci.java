package com.ladyjava.formulas;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroA = 1;
		int numeroB = 1;
		int n = 13; //coloquei esta VAR N só poder mostrar a quantidade da sequencia
		for (int i = 0; i < n; i++) {
			System.out.println("Sequencia de " + i + " algoritmo, o resultato é " + numeroA);
			numeroB = numeroA + numeroB;
			numeroA = numeroB-numeroA;
		}
		System.out.println("\n Sequencia de " + n);
	}
}
