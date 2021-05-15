package com.ladyjava.view;

import com.ladyjava.controller.FuncionarioAutenticavel;
import com.ladyjava.integration.SistemaInterno;
import com.ladyjava.model.Adm;
import com.ladyjava.model.Cliente;e
import com.ladyjava.model.Designer;
import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;


public class TesteSistema {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setSalario(3000.00);
		// Funcionario cliente = new Cliente();
		// FuncionarioAutenticavel cliente = new Cliente();
		
		Gerente g = new Gerente();
		g.setLogin("mony");
		g.setSenha(222);
		
		Adm adm = new Adm();
		//adm.setLogin("Anna");
		adm.setSenha(123);
		
		//		Designer d = new Designer();
		 //		d.setSenha(555);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		//si.autentica(d);
		

	}

}
