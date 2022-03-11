package calculadora;

import erros.DivisaoPorZeroException;

public class TesteManual {

	public static void main(String[] args) {
		// instanciar todos os objetos que serão utilizados no teste.
		Calculadora calculadora = new Calculadora();

		// definir cenário de teste.
		// entradas
		double numeroEntrada1 = 100.0;
		double numeroEntrada2 = 0.0;
		// saídas
		double resultadoEsperado = Double.POSITIVE_INFINITY;

		// executar o teste
		double resultadoObtido;
		try {
			resultadoObtido = calculadora.dividir(10, 0);
			// comparar resultados
			if (resultadoObtido == resultadoEsperado) {
				System.out.println("Teste com sucesso");
			}else {
				System.out.println("Teste com insucesso");
			}
		}		
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
