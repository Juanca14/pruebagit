package org.gradle;
import static org.junit.Assert.*;
import org.junit.Test;

public class prueba_git_test {
	
	@Test
	public void setNombre(){
		
		Prueba_git prueba = new Prueba_git("Juan");		
		assertEquals("Juan", prueba.getNombre());
		
	}

}
