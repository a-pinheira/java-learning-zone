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
    	palavras.add("Editora Casa do C�digo");
    	
    	//Classes auxiliares do do Java Util, como: Collections, cheio de 
    	//m�todos est�ticos, como o m�todo: sort
    	Collections.sort(palavras);
    	//Saem em ordem alfab�tica/lexogr�fica
    	System.out.println("Palavra: " + palavras);
    	
        }
}