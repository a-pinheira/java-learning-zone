 package com.ladyjava.banco.model;

//new ContaCorrente()
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero); //o mesmo que conta(), mas por conver��o do java �: super()
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}

}
