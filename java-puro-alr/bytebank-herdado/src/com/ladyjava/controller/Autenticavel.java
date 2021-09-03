package com.ladyjava.controller;

import com.ladyjava.model.Funcionario;

//uma interface � uma classe abstrata com tds os m�todos abstrados, ou seja,
//dentro de uma interface "n�o tem nada concreto"
//Outra definil��o de internet, chama-se autenc�vel
//Interface - Contrato Autentic�vel
	//quem assinar esse contrato, precisa implementar
	//m�todo setLogin e setSenha
	//m�todo autentica

public abstract interface Autenticavel {
	// public abstract void setLogin(String login);
	// s� deixa as assinatura dos m�todos abstract da interface
	public abstract void setLogin(String login);

// s� deixa as assinatura dos m�todos abstract da interface
	public abstract void setSenha(int senha);

	// private String login;
	// private int senha;
	public abstract boolean autentica(String login, int senha);
	// Classes asbtratadas n�o s�o obrigada a ter m�todos abstrados

	// novo m�todo, recebendo dois params
	// public boolean autentica(String login, int senha) {
	// if (this.login == login && this.senha == senha) {
	// return true;
	// } else {
	// return false;
	// }
	// }
//
//	public String getLogin() {
//		return login;
//	}
//
//	public void setLogin(String login) {
//		this.login = login;
//	}
//
//	public int getSenha() {
//		return senha;
//	}
//
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}

}
