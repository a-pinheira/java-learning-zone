 package com.ladyjava.banco.view;

import com.ladyjava.banco.model.ContaCorrente;
import com.ladyjava.banco.model.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(11, 1212);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(012, 2222);
		cp.deposita(200.00);
				
		cc.transfere(12.00, cp);
		//cc.saca(10);
		
		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CP: " + cp.getSaldo());
		//System.out.println("Valor de saque: " + cc.getTotal());
		

	}

}  
