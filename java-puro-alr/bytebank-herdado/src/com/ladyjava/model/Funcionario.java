package com.ladyjava.model;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

	// Metodo de adcional de 10% no salario do funcionario
	public double getBonificacai() {
		return this.salario * 0.1;

	}

	// Constru tor
	

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

}