package com.ladyjava.model;

import com.ladyjava.controller.FuncionarioAutenticavel;

//heran�a: usando o m�todo <extends> 
//Gerente herda e � FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {

	// Metodo Bonificacao para gerente
	// Usa-se o <@Override> e <Super>, s� se o m�todo tiver na clase gen�rica/m�e 
	public double getBonificacao() {
		// TODO Auto-generated method stub
		// return super.getBonificacao();
		// Para o atributo privado em funcionario
		// return super.getBonificacao() + super.salario;
		// return (this.salario * 0.1)+super.salario;
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		//sal�rio simples
		//return super.getSalario() + super.getSalario();
		return this.getSalario();
	}

	// Metodo Autentica��o precisa est� descrito em cada tipo de funcionario
	// pois cada um tem as permiss�es diferentes 
	/*
	 * public boolean autentica(int senha) { if ((this.login == login) &&
	 * (this.senha == senha)) { return true;
	 * 
	 * } else { return false; } }
	 */

	// Construtor
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Get's & Set's
	/*
	 * public int getSenha() { return senha; }
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * public String getLogin() { return login; }
	 * 
	 * public void setLogin(String login) { this.login = login; }
	 */

}