package org.gradle;
import static org.junit.Assert.*;
import org.junit.Test;

public class prueba_git_test {
	
	@Test
	public void setNombre(){
		
		PruebaGit prueba = new PruebaGit("Juan");		
		assertEquals("Juan", prueba.getNombre());
		
	}

}
