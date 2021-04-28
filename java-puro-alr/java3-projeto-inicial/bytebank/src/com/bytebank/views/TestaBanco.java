package com.bytebank.views;

import com.bytebank.model.Cliente;
import com.bytebank.model.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("Paulo Silveira");
		cli.setCpf("222.222.222.-22");
		cli.setProfissao("programador");

		Conta contaDoCli = new Conta(6646,969060);
		contaDoCli.deposita(100);

		contaDoCli.setTitular(cli);
		System.out.println(contaDoCli.getTitular().getNome());
		System.out.println(contaDoCli.getTitular());

	}
}