package com.ladyjava.model;

import com.ladyjava.controller.Autenticavel;

//heran�a: usando o m�todo <extends> 
//Gerente herda e � Funcionario, assina o contrato << autenticavel >>
//n�o existe heran�a multipla, mas pode extender 1 class e assinar v�rios contratos, quantos 
//necess�rios (implements) no caso de interface (assina contrato)
public class Gerente extends Funcionario implements Autenticavel{

	private String login = "gerente";
	private int senha = 1100;
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
	public boolean autentica(int senha) { 
		if ((this.login == login) && (this.senha == senha)) { 
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

	@Override
	public void setLogin(String login) {
		this.login = login;
		
	}
	
	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		//super.setSenha(senha);
		this.senha = senha;
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