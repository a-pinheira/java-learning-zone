package com.ladyjava.view;

import com.ladyjava.model.Funcionario;

public class FuncionarioTeste {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primeira forma: passando cada paramentros
		Funcionario func = new Funcionario();
		func.setNome("Simonetti");
		func.setCpf("22200112300");
		func.setSalario(2800.00);
		
		System.out.println("Nome da(o) funcionaa(o): " + func.getNome());
		System.out.println("Sua bonificação: " + func.getBonificacai());
		
		//Segunda forma: deixando o usuário passar os dados (paramentros)
		/*Funcionario func = new Funcionario();
		System.out.println("Digite seu cpf: " + mony.setCpf());
		System.out.println("Digite seu nome: " + mony.setNome());
		System.out.println("Digite seu salario: " + mony.setSalario(salario));
		*/
		

	}

}
