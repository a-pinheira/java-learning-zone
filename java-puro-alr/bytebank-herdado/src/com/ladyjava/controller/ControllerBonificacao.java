package com.ladyjava.controller;

import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;
import com.ladyjava.model.VideoMaker;

public class ControllerBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		double bonus = f.getBonificacao();
		this.soma = this.soma + bonus;
	}

	/*
	 * public void registra(Gerente g) { double bonus = g.getBonificacao();
	 * this.soma = this.soma + bonus; }
	 * 
	 * public void registra(VideoMaker vm) { double bonus = vm.getBonificacao();
	 * this.soma = this.soma + bonus; }
	 */
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

}
