package com.ladyjava.alr.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Arqivo
		// Construtor que representa um arquivo ou uma pasta sem o tratamento 
		// TRY CATCH para que o arquivo cai na pilha
		FileInputStream fis = new FileInputStream("lorem.txt");
		//passa o arquivo no construtor do isr de binaril para caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		
		//array de caracteres
		BufferedReader br = new BufferedReader(isr);
		// Devolve um string 
		String linha = br.readLine();
		System.out.println(linha);
		
		br.close();		
		
}

}

