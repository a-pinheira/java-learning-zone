package com.ladyjava.controller;

import com.ladyjava.model.Funcionario;

//uma interface é uma classe abstrata com tds os métodos abstrados, ou seja,
//dentro de uma interface "não tem nada concreto"
//Outra definilção de internet, chama-se autencável
//Interface - Contrato Autenticável
	//quem assinar esse contrato, precisa implementar
	//método setLogin e setSenha
	//método autentica

public abstract interface Autenticavel {
	// public abstract void setLogin(String login);
	// só deixa as assinatura dos métodos abstract da interface
	public abstract void setLogin(String login);

// só deixa as assinatura dos métodos abstract da interface
	public abstract void setSenha(int senha);

	// private String login;
	// private int senha;
	public abstract boolean autentica(String login, int senha);
	// Classes asbtratadas não são obrigada a ter métodos abstrados

	// novo método, recebendo dois params
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
