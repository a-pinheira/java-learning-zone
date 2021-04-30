package com.ladyjava.view;

import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;

public class TesteGerente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primeira forma: passando cada paramentros
		Gerente g1 = new Gerente();
		g1.setNome("Simone");
		g1.setCpf("23425345");
		g1.setTipo(1);
		g1.setSalario(6800);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salario: " + g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao() + g1.getTipo());
		System.out.println("Bonificação: " + g1.getTipo());
		
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
		System.out.println("Sucess! " + autenticou);

		//Gerente g2 = new Gerente();

	}

}
