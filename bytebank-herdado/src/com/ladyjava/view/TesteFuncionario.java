package com.ladyjava.view;

import com.ladyjava.model.Funcionario;

public class TesteFuncionario {
	private static void main() {
		// TODO Auto-generated method stub
		//Primeira forma: passando cada paramentros
		Funcionario mony = new Funcionario();
		mony.setNome("Simonetti");
		mony.setCpf("22200112300");
		mony.setSalario(2800.00);
		
		System.out.println("Nome da(o) funcionaria(o): " + mony.getNome());
		System.out.println("Sua bonifica��o: " + mony.getBonificacai());
		
		//Segunda forma: deixando o usu�rio passar os dados (paramentros)
		Funcionario func = new Funcionario();
		

	}

}
