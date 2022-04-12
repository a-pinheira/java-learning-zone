package com.ladyjava.formulas;

/*
 * @param args the command line arguments
 */
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numA = 0;
		int numB = 1;

		for (int cont= 1; cont <= 12; cont++) {
//			if (i < 2) {
//				System.out.println("Teste " + 1);
//			} else {
			numA = numA + numB;
			numB = numA - numB;
			System.out.println("Resultado, item " + cont + " fibonacci " + numA);
//			}
		}
	}
}
