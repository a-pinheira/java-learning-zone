package com.ladyjava.model;

//heran�a: usando o m�todo <extends> 
public class Diretores extends Funcionario {

	private int senha;
	
	//Metodo Bonifica��o
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.salario + 1000;	
	}

	// Metodo Autentica��o
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
  
		} else {
			return false;
		}
	}

	// Construtor
	public Diretores() {
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