package com.ladyjava.view;

import com.ladyjava.model.Funcionario;

public class TesteFuncionario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primeira forma: passando cada paramentros
		Funcionario func1 = new Funcionario();
		func1.setNome("Simonetti");
		func1.setCpf("22200112300");
		func1.setSalario(2800.00);
		
		
		System.out.println("Sua bonificação: " + func1.getCpf());
		System.out.println("Nome da(o) funcionaa(o): " + func1.getNome());
		System.out.println("Sua bonificação: " + func1.getSalario());
		System.out.println("Sua bonificação: " + func1.getBonificacao());
		
		func1.setLogin("Mony");
		func1.setSenha(1234);
		boolean autentic = func1.autentica("Mony", 1234);
		System.out.println("Sucess passw! " + autentic);

		
		//Segunda forma: deixando o usuário passar os dados (paramentros)
		/*Funcionario func = new Funcionario();
		System.out.println("Digite seu cpf: " + mony.setCpf());
		System.out.println("Digite seu nome: " + mony.setNome());
		System.out.println("Digite seu salario: " + mony.setSalario(salario));
		*/
		

	}

}
