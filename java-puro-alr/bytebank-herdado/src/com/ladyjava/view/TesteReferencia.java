package com.ladyjava.view;

import com.ladyjava.controller.ControllerBonificacao;
import com.ladyjava.model.Funcionario;
import com.ladyjava.model.Gerente;
import com.ladyjava.model.VideoMaker;

public class TesteReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criango um obejto Gerente() declarando uma variável: g1 do tipo Gerente 
		//atribuindo a 'referencia' da variável - sendo G1 uma referencia do Tipo Gerente
		Gerente g1 = new Gerente();
		//Referencia do tipo mais generico
		// Funcionario g1 = new Gerente(); lado esquerdo do tipo mais generico e
		// lado direito do tipo gerente, tipo mais específico
		// Neste caso G1 uma referencia do Tipo Gerente
		// só pode chamar métodos definidos da classe de 'funcionario'
		g1.setCpf("123486");
		g1.setNome("Simone");
		g1.setSalario(5890);
		
		ControllerBonificacao controle = new ControllerBonificacao();
		controle.registra(g1);
		System.out.println(controle.getSoma());
		System.out.println(g1.getNome());
		
		/* String nome = g1.getNome();
	       Double sal = g1.getSalario();
		//só vai funcionar se ao chamar a referencia, a mesma seja do tipo gerente
		//se for no tipo funcionário não funciona
			g1.autentica(2222);
			System.out.println(nome);
			System.out.println(sal);*/
		Funcionario func = new Funcionario();
		func.setCpf("123486");
		func.setNome("Juju");
		func.setSalario(2500);
		controle.registra(func);
		System.out.println(func.getNome());
		System.out.println(func.getCpf());
		System.out.println(func.getSalario());
		System.out.println(controle.getSoma());
		
		//VideoMARKER Objeto
		
		VideoMaker vm = new VideoMaker();
		vm.setCpf("654321");
		vm.setNome("Ninjao"); 
		vm.setSalario(2000);
		System.out.println(vm.getNome());
		System.out.println(vm.getCpf());
		System.out.println(vm.getSalario());
		System.out.println(controle.getSoma());
	}

}
