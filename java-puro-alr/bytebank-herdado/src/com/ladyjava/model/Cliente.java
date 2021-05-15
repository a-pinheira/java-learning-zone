package com.ladyjava.model;

import com.ladyjava.controller.FuncionarioAutenticavel;

public class Cliente extends FuncionarioAutenticavel{

	@Override
	public double getBonificacao() {
		return 0;
	}

}
