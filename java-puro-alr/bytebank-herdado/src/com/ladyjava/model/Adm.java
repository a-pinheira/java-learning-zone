package com.ladyjava.model;

import com.ladyjava.controller.AutenticacaoUtil;
import com.ladyjava.controller.Autenticavel;

public class Adm extends Funcionario implements Autenticavel{
	//private String login = "Adm";
	//private int senha = 123;
	//Construtor
	private AutenticacaoUtil autenticador;
	
	
	
	public Adm() {
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

	
	/*public boolean autentica(int senha) {
	if ((this.login == login) && (this.senha == senha)) {
		return true;			
	} else {
		return false;			
		}
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
	}*/

	@Override
	public double getBonificacao() {
		return 50;
	}
}
