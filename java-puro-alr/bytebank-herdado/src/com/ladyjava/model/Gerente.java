package com.ladyjava.model;

//herança: usando o método <extends> 
public class Gerente extends Funcionario {

	private int senha;

	// Metodo Bonificacao para gerente
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		// return super.getBonificacao();
		// Para o atributo privado em funcionario
		// return super.getBonificacao() + super.salario;
		// return (this.salario * 0.1)+super.salario;
		return super.getBonificacao() + super.getSalario();
	}

	// Metodo Autenticação
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;

		} else {
			return false;
		}
	}

	// Construtor
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Get's & Set's
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}