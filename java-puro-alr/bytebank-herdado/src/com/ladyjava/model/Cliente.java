package com.ladyjava.model;

import com.ladyjava.controller.AutenticacaoUtil;
import com.ladyjava.controller.Autenticavel;

public class Cliente implements Autenticavel{
	/*private String login;
	private int senha; */
	private AutenticacaoUtil autenticador;

	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setLogin(String login) {
		this.autenticador.setLogin(login);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(String login, int senha) {
		//boolean auth  = this.util.autentica(login);
		boolean autenticou = this.autentica(login, senha);
		return autenticou;
		/*if ((this.login == login) && (this.senha == senha)) {
			return true;			
		} else {
			return false;			
		} */		
	}

//	@Override
//	public String getLogin() {
//		// TODO Auto-generated method stub
//		return null;
//	}
 

}
 