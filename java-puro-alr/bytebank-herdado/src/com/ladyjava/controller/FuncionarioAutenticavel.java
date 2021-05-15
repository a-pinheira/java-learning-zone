package com.ladyjava.controller;

import com.ladyjava.model.Funcionario;

public abstract class FuncionarioAutenticavel {
	private String login;
	private int senha;

	// Classes asbtratadas n�o s�o obrigada a ter m�todos abstrados

	// novo m�todo, recebendo dois params
	public boolean autentica(String login, int senha) {
		if (this.login == login && this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
