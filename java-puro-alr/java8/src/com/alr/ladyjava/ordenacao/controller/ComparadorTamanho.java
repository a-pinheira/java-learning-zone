package com.alr.ladyjava.ordenacao.controller;

import java.util.Comparator;

public class ComparadorTamanho implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
		return -1;
		} else 
			if (s1.length() > s2.length()) {
				return 1;
				}
		return 0;
		}

}
