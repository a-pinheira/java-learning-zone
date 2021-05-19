package com.ladyjava.banco.view;

import com.ladyjava.banco.controller.CalculadorDeImposto;
import com.ladyjava.banco.model.ContaCorrente;
import com.ladyjava.banco.model.SeguroDeVida;

public class TesteTributáveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(011, 1010);
		cc.deposita(100.00);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = CalculadorDeImposto();
		calc.registro(cc);
		calc.registro(seguro);
		
		System.out.println("Calculo da CC: " + calc.getTotalImposto());
		
	
		
		

	}

	private static CalculadorDeImposto CalculadorDeImposto() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
