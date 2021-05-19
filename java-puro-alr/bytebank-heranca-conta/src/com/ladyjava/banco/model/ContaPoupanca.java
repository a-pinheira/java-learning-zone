 package com.ladyjava.banco.model;

import com.ladyjava.banco.controller.Tributavel;

//new ContaCorrente()
public class ContaPoupanca extends Conta implements Tributavel {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); //o mesmo que conta(), mas por converção do java é: super()
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
