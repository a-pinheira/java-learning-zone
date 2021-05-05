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
		//Gerente g1 = new Gerente();
		Funcionario g1 = new Gerente();
		//Referencia do tipo mais generico
		// Funcionario g1 = new Gerente(); lado esquerdo do tipo mais generico e
		// lado direito do tipo gerente, tipo mais específico
		// Neste caso G1 uma referencia do Tipo Gerente
		// só pode chamar métodos definidos da classe de 'funcionario'
		g1.setNome("Simone Gerente");
		g1.setCpf("123486");
		g1.setSalario(5890);
		g1.setTipo(1);
		g1.setLogin("mony");
		g1.setSenha(1234);
		boolean autenticou = g1.autentica("mony", 1234);
		System.out.println("Sucess! " + autenticou);

		
		ControllerBonificacao controle = new ControllerBonificacao();
		//registra funcionario através do método regista (ControllerBonificação.java)
		controle.registra(g1);
		System.out.println(controle.getSoma());
		System.out.println(g1.getNome());
		System.out.println(g1.getTipo());
			
		
		/* String nome =  m.out.println(nome);
			System.out.println(sal);*/
		Funcionario func = new Funcionario();
		func.setCpf("123486");
		func.setNome("Juju Funcionaria");
		func.setSalario(2500);
		func.setTipo(0);
		//registra funcionario através do método regista (ControllerBonificação.java)
		controle.registra(func);
		System.out.println(func.getNome());
		System.out.println(func.getCpf());
		System.out.println(func.getSalario());
		System.out.println(controle.getSoma());
		System.out.println(func.getTipo());
		
		//VideoMARKER Objeto
		//VideoMaker vm = new VideoMaker();
		Funcionario vm = new VideoMaker();
		vm.setCpf("654321");
		vm.setNome("Ninjao VM"); 
		vm.setSalario(2000);
		vm.setTipo(3);
		//registra funcionario através do método regista (ControllerBonificação.java)
		controle.registra(vm);
		System.out.println(vm.getNome());
		System.out.println(vm.getCpf());
		System.out.println(vm.getSalario());
		System.out.println(controle.getSoma());
		System.out.println(vm.getTipo());
	}
	
	//testar diretores

}
