package com.ladyjava.view;

import com.ladyjava.model.Diretores;
import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;
//Classe Método de Instancia
public class TesteDiretores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando um objeto da classe: dir1 do Tipo Gerente
		Diretores dir1 = new Diretores();
		
		// Invocando o método da classe
		dir1.setNome("Simoninha");
		dir1.setCpf("23425345/31");
		dir1.setTipo(2);
		dir1.setSalario(6800);
		
		System.out.println("Nome: " + dir1.getNome());
		System.out.println("CPF: " + dir1.getCpf());
		System.out.println("Salario: " + dir1.getSalario());
		System.out.println("Bonificação: " + dir1.getBonificacao());
		System.out.println("Tipo Funcionario: " + dir1.getTipo());
		
		dir1.setSenha(1234);
		boolean autenticou = dir1.autentica(1234);
		System.out.println("Sucess! " + autenticou);

		//Gerente g2 = new Gerente();

	}

}
