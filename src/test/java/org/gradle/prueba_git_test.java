package org.gradle;
import static org.junit.Assert.*;
import org.junit.Test;

public class prueba_git_test {
	
	@Test
	public void setNombre(){
		
		prueba_git prueba = new prueba_git("Juan");		
		assertEquals("Juan", prueba.getNombre());
		
	}

}
