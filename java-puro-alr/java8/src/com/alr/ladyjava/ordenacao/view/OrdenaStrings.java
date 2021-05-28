package com.alr.ladyjava.ordenacao.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.alr.ladyjava.ordenacao.controller.ComparadorTamanho;

public class OrdenaStrings {

    public static void main(String[] args) {
    	//poderia usar tmb o Array.asList()
    	List<String> palavras = new ArrayList<String>();
    	palavras.add("Caelum Courses");
    	palavras.add("Java8");
    	palavras.add("Editora Casa do Código");
    	
    	Comparator<String> comparador = new ComparadorTamanho();
    	//Classes auxiliares do do Java Util, como: Collections, cheio de 
    	//métodos estáticos, como o método: sort
    	//ao adc o objeto do tipo String da API collections - comparator 
    	//ele organizar por ordem de tam. e não mais por ordem alfabetica
    	Collections.sort(palavras, comparador);
    	//Saem em ordem alfabética/lexográfica
    	//teste
    	System.out.println("Palavra: " + palavras);
    	
        }
}