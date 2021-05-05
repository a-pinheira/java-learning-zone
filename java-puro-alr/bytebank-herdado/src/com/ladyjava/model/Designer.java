package com.ladyjava.model;

public class Designer extends Funcionario {
	
	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do DESINER");
		return super.getBonificacao() + 200;
	}

	// Metodo Autenticação
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;

		} else {
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
}
