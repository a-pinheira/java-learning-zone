package com.ladyjava.model;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Funcionario {
	private String nome;
	private String cpf;
	// privite é só visívil dentro desta classe
	private double salario;
	// VISIBILIDADES: protected double salario;
	private int tipo = 0;
	private String login;
	private int senha;

	// Metodo de adcional de 10% no salario do funcionario
	public double getBonificacao() {
//		if (this.tipo == 0) {
		//outra forma de chamar o tipo de funcionario
		System.out.println("Chamando o método de bonificação do " + this.getTipo());
		return this.salario * 0.1;
	}

	// else if (this.tipo == 1) {
	// return this.salario * 0.3;
	// } else {
	// return this.salario + 1000;
	// }
	// }
	// Metodo Autenticação

	//	public boolean autentica(int senha) {
	//		if (this.senha == senha) {
	//			return true;
	//
	//		} else {
	//			return false;
	//		}
	//	}

	// novo método, recebendo dois params
	public boolean autentica(String login, int senha) {
		if (this.login == login && this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
