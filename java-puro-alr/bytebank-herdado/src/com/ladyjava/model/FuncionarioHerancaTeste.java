package com.ladyjava.model;

public class FuncionarioHerancaTeste {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - funcionario comum, 1 - Gerente, 2 - Diretor

	// Metodo de adcional de 10% no salario do funcionario
	public double getBonificacao() {
		if (tipo == 0) { // funcinario comum
			return this.salario * 0.1;
		} else if (this.tipo == 1) { // gerente
			return this.salario;
		} else { // diretor
			return this.salario + 1000.0;
		}
	}
	// Construtor
	/*
	 * public FuncionarioHerancaTeste() { super(); // TODO Auto-generated
	 * constructor stub }
	 */

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
