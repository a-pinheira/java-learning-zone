package com.ladyjava.view;

import com.ladyjava.controller.Autenticavel;
import com.ladyjava.model.Funcionario;

//import com.ladyjava.model.Funcionario;

import com.ladyjava.model.Gerente;
//Classe Método de Instancia
public class TesteGerente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando um objeto da classe: g1 do Tipo Gerente
		Funcionario g1 = new Gerente();
		//Autenticavel g1 = new Gerente();
		
		// Invocando o método da classe
		g1.setNome("Antonietta");
		g1.setCpf("23425345");
		g1.setTipo(1);
		g1.setSalario(5000);

		g1.setLogin("Gerente");
		g1.setSenha(1100);
		boolean autenticou = g1.autentica("gerente", 1100);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salario: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao());
		System.out.println("Tipo Funcionario: " + g1.getTipo());
		
		System.out.println("Sucess! " + autenticou);
		

		//Gerente g2 = new Gerente();

	}

}
