package com.ladyjava.banco.model;

//new ContaCorrente()
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // o mesmo que conta(), mas por converção do java é: super()
		// TODO Auto-generated constructor stub
	}

	// anotação de configuração no código java, para o
	// compilador saber que vc quer sobescrever o metodo da Conta.java
	// assinatura tem que ser igual nas 2 classes: Conta.java e ContaCorrente.java
	@Override
	public boolean saca(double valor) {
		double valorSac = valor * 0.2;
		return super.saca(valorSac);
	}
	/*
	 * @Override public boolean saca(double valor) {
	 * return super.saca(valor);
	 * }
	 * 
	 */
}
