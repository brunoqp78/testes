package test.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.Pessoa;

public class PessoaTest {
	private Pessoa pessoa;
	
	@BeforeAll
	public static void inicializarTeste() {
		System.out.println("Inicia Testes");
	}
	
	@BeforeEach
	public void inicializaMetodosTeste() 
	{
		// instanciar objetos
		pessoa = new Pessoa();
		System.out.println("Método que executa antes de cada teste");
	}

	@AfterEach
	private void finalizaMetodosTeste() {
		pessoa = null;
		System.out.println("Método que executa após cada teste");
	}
	
	@AfterAll
	public static void finalizaTestes() {
		System.out.println("Finaliza testes");		
	}
	
	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarConstrutorNomeValido() {
		// cenário de teste
		String nome = "João";
		String resultadoEsperado = "João";
		// execução
		pessoa = new Pessoa(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
		System.out.println("Metodo teste 1");
		
	}

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarConstrutorNomeInvalidoMenosCaracteres() {
		// cenário de teste
		String nome = "Jo";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa = new Pessoa(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
		System.out.println("Metodo teste 2");
	}
	
	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarConstrutorNomeInvalidoMaisCaracteres() {
		// cenário de teste
		String nome = "jdasklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçks";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa = new Pessoa(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
		System.out.println("Metodo teste 3");
		
	}

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarSetNomeNomeValido() {
		// cenário de teste
		String nome = "João";
		String resultadoEsperado = "João";
		// execução
		pessoa.setNome(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
		System.out.println("Metodo teste 4");
	}

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarSetNomeNomeInvalidoMenosCaracteres() {
		// cenário de teste
		String nome = "Jo";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa.setNome(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
		System.out.println("Metodo teste 5");
	}
	
	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarSetNomeNomeInvalidoMaisCaracteres() {
		// cenário de teste
		String nome = "jdasklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçks";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa.setNome(nome);;
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
		System.out.println("Metodo teste 6");
	}	

	@Test
	/**
	 * salario precisa ser um valor entre 1100 e 1000000
	 */
	public void testarSalarioValido() {
		// cenário de teste
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
		System.out.println("Metodo teste 7");
	}

	@Test
	/**
	 * salario precisa ser um valor entre 1100 e 1000000
	 */
	public void testarSalarioMenorLimite() {
		// cenário de teste
		double salario = 800;
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		// execução
		pessoa.setSalario(salario);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
		System.out.println("Metodo teste 8");
	}	

	@Test
	/**
	 * salario precisa ser um valor entre 1100 e 1000000
	 */
	public void testarSalarioMaiorLimite() {
		// cenário de teste
		double salario = 8000000;
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		// execução
		pessoa.setSalario(salario);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
		System.out.println("Metodo teste 9");
	}	
	
	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarPorcentagemValido() {
		// cenário de teste
		double porcentagem = 20;
		double salario = 2000;
		double resultadoEsperado = 2400;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
		System.out.println("Metodo teste 10");
	}
	
	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarPorcentagemInvalidoMenorLimite() {
		// cenário de teste
		double porcentagem = -1;
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
		System.out.println("Metodo teste 11");
	}

	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarPorcentagemInvalidoMaiorLimite() {
		// cenário de teste
		double porcentagem = 200;
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
		System.out.println("Metodo teste 12");
	}
}
