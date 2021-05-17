package com.ladyjava.view;

import com.ladyjava.controller.Autenticavel;
import com.ladyjava.integration.SistemaInterno;
import com.ladyjava.model.Adm;
import com.ladyjava.model.Cliente;
import com.ladyjava.model.Designer;
import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;


public class TesteSistema {

	public static void main(String[] args) {
		//Cliente c = new Cliente();
		Autenticavel c = new Cliente();
		c.setLogin("Cliente");
		c.setSenha(0011);

		//Gerente g = new Gerente();
		Autenticavel g =new Gerente();
		g.setLogin("gerente");
		g.setSenha(1100);
		
		//Adm adm = new Adm();
		Autenticavel adm = new Adm();
		adm.setLogin("Adm");
		adm.setSenha(123);
		
		Designer d = new Designer();
		d.setLogin("Desginer");
		d.setSenha(555);
		
		//Instancia do Objeto << Sistema Internet >>
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		//si.autentica(fa);
		//si.autentica(d);
		si.autentica(c);
		

	}

}
