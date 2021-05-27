package com.alr.ladyjava.ordenacao.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {
    	//poderia usar tmb o Array.asList()
    	List<String> palavras = new ArrayList<String>();
    	palavras.add("Caelum Courses");
    	palavras.add("Java8");
    	palavras.add("Editora Casa do Código");
    	
    	//Classes auxiliares do do Java Util, como: Collections, cheio de 
    	//métodos estáticos, como o método: sort
    	Collections.sort(palavras);
    	//Saem em ordem alfabética/lexográfica
    	System.out.println("Palavra: " + palavras);
    	
        }
}