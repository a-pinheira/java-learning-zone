package com.ladyjava.controller;

public class AutenticacaoUtil {

	private String login = "Adm";
	private int senha = 123;

	public boolean autentica(int senha) {
	if ((this.login == login) && (this.senha == senha)) {
		return true;			
	} else {
		return false;			
		}
	}
	
	//@Override
	public void setLogin(String login) {
		this.login = login;
		
	}
	
	//@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		//super.setSenha(senha);
		this.senha = senha;
	}

}
