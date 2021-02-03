package by.ladyjava;

import java.util.ArrayList;
import java.util.Collections;

public class Listas {
 public static void main(String[] args) {
	String nome1 = "Conhecendo mais Listas";
	String nome2 = "Modelando Classes de Listas";
	String nome3 = "Trabalhando com Cursos e Sets";

    ArrayList<String> nomes = new ArrayList<>();
    nomes.add(nome1);
    nomes.add(nome2);
    nomes.add(nome3);        

    System.out.println(nomes);
    
    nomes.remove(0);
    System.out.println(nomes);
    //para cada nome dentro de nomes, fa�a
    //esse for pode ser usado em qualquer cole��o(collection), inclusive em ArrayLists
    for (String nome : nomes) {
    	System.out.println("Nome: " + nome);
	}
    
    String primeiroNome = nomes.get(0);
    System.out.println("A primeiro nome �: " + primeiroNome);
    
    //usando indice
    for (int i = 0; i < nomes.size(); i++) {
        System.out.println("Nome usando o <FOR> : " + nomes.get(i));
    }
    
    //percorrendo string com o m�todo foreach
    //ele vai performa cada a��o / cada elemento dentro desta cole��o 
    nomes.forEach(nome -> {
    	System.out.println("Percorrendo(ForEach): ");
    	System.out.println("Nome: " + nome);
     });
    System.out.println(nomes.size());
    
    Collections.sort(nomes);
    System.out.println("Depois de ordenado: " + nomes);
    //System.out.println(nomes);
    
 }
}
