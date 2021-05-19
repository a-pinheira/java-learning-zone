package com.ladyjava.banco.model;

import com.ladyjava.banco.controller.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
