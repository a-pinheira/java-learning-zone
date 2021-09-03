package com.alr.ladyjava.ordenacao.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.alr.ladyjava.ordenacao.controller.ComparadorTamanho;

public class OrdenaStrings {

    public static void main(String[] args) {
    	//poderia usar tmb o Array.asList()
    	List<String> palavras = new ArrayList<String>();
    	palavras.add("Caelum Courses");
    	palavras.add("Java8");
    	palavras.add("Editora Casa do C�digo");
    	
    	Comparator<String> comparador = new ComparadorTamanho();
    	//Classes auxiliares do do Java Util, como: Collections, cheio de 
    	//m�todos est�ticos, como o m�todo: sort
    	//ao adc o objeto do tipo String da API collections - comparator 
    	//ele organizar por ordem de tam. e n�o mais por ordem alfabetica
    	//Collections.sort(palavras, comparador);
    	//m�todo sort na interface list
    	palavras.sort(comparador);
    	//Saem em ordem alfab�tica/lexogr�fica
    	//teste
    	System.out.println("Palavra: " + palavras);
    	
    	//    	for (String p : palavras) {
    	//    		System.out.println("Imprimir cada frase por linha: " + p);
    	//			}
    	
    	Consumer<String> consumidor = null;
    	palavras.forEach(consumidor);
        }
}