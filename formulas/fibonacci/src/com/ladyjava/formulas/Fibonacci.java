package com.ladyjava.formulas;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroA = 0;
		int numeroB = 1;
		int n = 12; //coloquei esta VAR N s� poder mostrar a quantidade da sequencia
		for (int i = 0; i < n; i++) {
			System.out.println("Sequencia de " + n + " algoritmo, o resultato � " + numeroA);
			numeroB = numeroA + numeroB;
			numeroA = numeroB-numeroA;
		}
	}
}
