package com.ladyjava.io.alura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public abstract class TesteLeitura {

	public static void main(String[] args) throws IOException {
	//public static void main(String[] args) throws FileNotFoundException {
		// Construtor que representa um arquivo ou uma pasta sem o tratamento 
		// TRY CATCH para que o arquivo cai na pilha
		// Fluxo de Entrada com Arqivo
		//FileInputStream fis = new FileInputStream("lorem.txt");
		InputStream fis = new FileInputStream("lorem.txt");
		//passa o arquivo no construtor do isr de binaril para caracteres
		//InputStreamReader isr = new InputStreamReader(fis);
		Reader isr = new InputStreamReader(fis);
		//array de caracteres
		BufferedReader br = new BufferedReader(isr);
		// Devolve um string 
		String linha = br.readLine();
		//ler o arquivo inteiro
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		//System.out.println(linha);
		
		br.close();		
		
	}
}

