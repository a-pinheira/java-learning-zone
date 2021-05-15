package com.ladyjava.model;

import com.ladyjava.controller.FuncionarioAutenticavel;

public class Adm extends FuncionarioAutenticavel {

	
	@Override
	public double getBonificacao() {
		return 50;
	}

	
}
