package calculadora;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


/*@DisplayName("Classe para teste da calculadora")*/
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@Before
	public void inicializa() {
		calc = new Calculadora();
	}
	
	/*Testa a soma de dois n�meros")*/
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		assertEquals(9, soma);		
	}
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int divisao = calc.multiplicacao(8, 4);
		assertTrue(divisao == 32);
	}
        @Test
        public void testMultiplicacaoumNumeroNegativo() {
		int divisao = calc.multiplicacao(8, -4);
		assertTrue(divisao == -32);
	}
        @Test
        public void testMultiplicacaoDoisNumerosNegativos() {
		int divisao = calc.multiplicacao(-8, -4);
		assertTrue(divisao == 32);
	}
 /*Acho que seria interessante testar com numeros racionais.*/
      @Test
      public void testMultiplicacaocomRacionalnegativo() {
		int divisao = calc.multiplicacao(8, -1/2);
		assertTrue(divisao == 32);
	}
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
        @Test
	public void testDivisaoDoisNumeroscomumnumeroNegativo() {
		int divisao = calc.divisao(8, -4);
		assertTrue(divisao == -2);
	} 
       @Test
	public void testDivisaoDoisNumeroscomdoisnumeroNegativos() {
		int divisao = calc.divisao(-8, -4);
		assertTrue(divisao == 2);
	}
        @Test
         public void testDivisaocomRacionalNegativo() {
		int divisao = calc.divisao(8, -1/4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
       
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		Assert.fail();
	}
       @Test
	public void testSomatorio() {
		int somatorio = calc.somatoria(8);
		assertTrue(somatorio == 8+7+6+5+4+3+2+1);
	}
        @Test
       public void testSomatorionegativo() {
			int somatorio = calc.somatoria(-2);
			assertTrue(somatorio == 0);
		}
        @Test
                public void testSomatorioRacional() {
			int somatorio = calc.somatoria(1/2);
			assertTrue(somatorio == 1/2);
		}
        @Test
          public void testcomparaA() {
			int compara = calc.compara(1,2);
			assertTrue(compara == -1);
		}
          @Test
          public void testcomparaB() {
			int compara = calc.compara(2,1);
			assertTrue(compara == 1);
		}
           @Test
          public void testcomparaC() {
			int compara = calc.compara(3,3);
			assertTrue(compara == 0);
		}
	}

