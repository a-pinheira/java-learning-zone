package com.ladyjava.integration;

import com.ladyjava.controller.FuncionarioAutenticavel;
import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;

public class SistemaInterno {
	private String login = "mony";
	private int senha = 222;

	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.login, this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema");			
		}else {
			System.out.println("Não pode entrar no sistema");
		}
	}

	

}
