package com.ladyjava.model;

public class Funcionario {
	private String nome;
	private String cpf;
	// privite � s� vis�vil dentro desta classe
	// private double salario;
	protected double salario;
	private int tipo = 0;
	

	// Metodo de adcional de 10% no salario do funcionario
	public double getBonificacao() {
//		if (this.tipo == 0) {
			return this.salario * 0.1;
		} 
//		else if (this.tipo == 1) {
//			return this.salario * 0.3;
//		} else {
//			return this.salario + 1000;
//		}
//		}

	// Construtor
	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Get's & Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
