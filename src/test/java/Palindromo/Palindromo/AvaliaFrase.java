package Palindromo.Palindromo;

import org.junit.Assert;
import org.junit.Test;


public class AvaliaFrase {
	@Test
		public void Avaliador(){
			
			Palindromo palindromo = new Palindromo();
			
	
			
			boolean resultado = true;
			
			Assert.assertEquals(resultado, palindromo.ehPalindromo("amor roma"));
			Assert.assertEquals(resultado, palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
			Assert.assertEquals(resultado, palindromo.ehPalindromo("Anotaram a data da maratona"));
		
			
			
		}
		
	}


