package com.ladyjava.model;

import com.ladyjava.controller.Autenticavel;

public class Cliente implements Autenticavel{
	private String login;
	private int senha;

	@Override
	public void setLogin(String login) {
		this.login = login;
		
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(String login, int senha) {
		if ((this.login == login) && (this.senha == senha)) {
			return true;			
		} else {
			return false;			
		}
		
	}

//	@Override
//	public String getLogin() {
//		// TODO Auto-generated method stub
//		return null;
//	}
 
	

}
 