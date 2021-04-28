package com.ladyjava.view;

import com.ladyjava.model.FuncionarioHerancaTeste;

public class FuncHerancaTeste {
	public static void main(String[] args) {
		FuncionarioHerancaTeste f1 = new FuncionarioHerancaTeste();
		f1.setSalario(3000.0);
		System.out.println("O Tipo de Fucnionario eh: " + f1.getTipo());
		System.out.println("Com o respectivo bonus: " + f1.getBonificacao());

		FuncionarioHerancaTeste f2 = new FuncionarioHerancaTeste();
		f2.setTipo(2);
		f2.setSalario(5000.0);
		System.out.println("\rO Tipo de Fucnionario eh: " + f2.getTipo());
		System.out.println("Com o respectivo bonus: " + f2.getBonificacao());
		
		//mas o ideal é ter um classe com as regras de negócio para fazer o 
		//mapeamento de cada tipo do funcionario, para fazer os tratamento, 
		//consistencias e persitencias do dados
	}
}
