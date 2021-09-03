package com.ladyjava.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;


public class RuleTest {

	// Simula o poder da Rule de criar algo antes da execução no teste, como também
	// neste caso o poder do JUnit de simulas uma operação de IO e 
	// garante que um arquivo foi criado
	
		@Rule
		public TemporaryFolder tempFolder = new TemporaryFolder();
		
		@Test
		public void shouldCreateNewFileInTemporaryFolder() throws IOException {
			File created = tempFolder.newFile("file.txt");
			
			assertTrue(created.isFile());
			assertEquals(tempFolder.getRoot(), created.getParentFile());
		}
}


