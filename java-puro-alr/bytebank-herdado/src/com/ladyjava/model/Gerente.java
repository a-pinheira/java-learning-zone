package com.ladyjava.model;

import com.ladyjava.controller.FuncionarioAutenticavel;

//herança: usando o método <extends> 
//Gerente herda e é FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {

	// Metodo Bonificacao para gerente
	// Usa-se o <@Override> e <Super>, só se o método tiver na clase genérica/mãe 
	public double getBonificacao() {
		// TODO Auto-generated method stub
		// return super.getBonificacao();
		// Para o atributo privado em funcionario
		// return super.getBonificacao() + super.salario;
		// return (this.salario * 0.1)+super.salario;
		System.out.println("Chamando o método de bonificação do GERENTE");
		//salário simples
		//return super.getSalario() + super.getSalario();
		return this.getSalario();
	}

	// Metodo Autenticação precisa está descrito em cada tipo de funcionario
	// pois cada um tem as permissões diferentes 
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