package test.calculadora;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import calculadora.Calculadora;
import erros.DivisaoPorZeroException;

public class CalculadoraTest {
	
	@Test
	public void testaSomaDoisNumeros() {
		// instanciar objetos
		Calculadora calculadora = new Calculadora();
		
		// cenário de teste
		double numero1 = 10;
		double numero2 = 20;
		double resultadoEsperado = 30;
		
		// execução		
		double resultadoObtido = calculadora.somar(numero1, numero2);
		
		// comparação		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	public void testaSomaDoisNumerosPositivoNegativo() {
		// instanciar objetos
		Calculadora calculadora = new Calculadora();
		
		// cenário de teste
		double numero1 = -10;
		double numero2 = 20;
		double resultadoEsperado = 10;
		
		// execução		
		double resultadoObtido = calculadora.somar(numero1, numero2);
		
		// comparação
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testaSubtrairDoisNumerosPositivoNegativo() {
		// instanciar objetos
		Calculadora calculadora = new Calculadora();
		
		// cenário de teste
		double numero1 = 10;
		double numero2 = 20;
		double resultadoEsperado = -10;
		
		// execução		
		double resultadoObtido = calculadora.subtrair(numero1, numero2);
		
		// comparação
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testaDividirPorZero() {
		// instanciar objetos
		Calculadora calculadora = new Calculadora();
		
		// cenário de teste
		double numero1 = 10;
		double numero2 = 0;
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		
		// comparação
		Assertions.assertEquals(resultadoEsperado, calculadora.dividir(numero1, numero2));
	}
	
	
}
