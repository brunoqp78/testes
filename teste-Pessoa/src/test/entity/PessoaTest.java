package test.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entity.Pessoa;

public class PessoaTest {

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarConstrutorNomeValido() {
		// instanciar objetos
		Pessoa pessoa;
		// cenário de teste
		String nome = "João";
		String resultadoEsperado = "João";
		// execução
		pessoa = new Pessoa(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
	}

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarConstrutorNomeInvalidoMenosCaracteres() {
		// instanciar objetos
		Pessoa pessoa;
		// cenário de teste
		String nome = "Jo";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa = new Pessoa(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
	}
	
	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarConstrutorNomeInvalidoMaisCaracteres() {
		// instanciar objetos
		Pessoa pessoa;
		// cenário de teste
		String nome = "jdasklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçks";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa = new Pessoa(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
	}

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarSetNomeNomeValido() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		String nome = "João";
		String resultadoEsperado = "João";
		// execução
		pessoa.setNome(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
	}

	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarSetNomeNomeInvalidoMenosCaracteres() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		String nome = "Jo";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa.setNome(nome);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
	}
	
	@Test
	/**
	 * nome precisa ter entre 3 e 100 caracteres
	 */
	public void testarSetNomeNomeInvalidoMaisCaracteres() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		String nome = "jdasklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçksklfjdasklçfjlsakçfjlkdsaçfjlksdçfjlkçsadfjlçks";
		String resultadoEsperado = "nomeInvalido";
		// execução
		pessoa.setNome(nome);;
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getNome());
	}	

	@Test
	/**
	 * salario precisa ser um valor entre 1100 e 1000000
	 */
	public void testarSalarioValido() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
	}

	@Test
	/**
	 * salario precisa ser um valor entre 1100 e 1000000
	 */
	public void testarSalarioMenorLimite() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double salario = 800;
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		// execução
		pessoa.setSalario(salario);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
	}	

	@Test
	/**
	 * salario precisa ser um valor entre 1100 e 1000000
	 */
	public void testarSalarioMaiorLimite() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double salario = 8000000;
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		// execução
		pessoa.setSalario(salario);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
	}	
	
	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarPorcentagemValido() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double porcentagem = 20;
		double salario = 2000;
		double resultadoEsperado = 2400;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
	}
	
	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarPorcentagemInvalidoMenorLimite() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double porcentagem = -1;
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
	}

	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarPorcentagemInvalidoMaiorLimite() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double porcentagem = 200;
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());
	}
	
	@Test
	/**
	 * porcentagem precisa ser um valor entre 1 e 100.
	 */
	public void testarAlgo() {
		// instanciar objetos
		Pessoa pessoa = new Pessoa();
		// cenário de teste
		double porcentagem = 200;
		double salario = 2000;
		double resultadoEsperado = 2000;
		// execução
		pessoa.setSalario(salario);
		pessoa.reajustarSalario(porcentagem);
		// comparação
		Assertions.assertEquals(resultadoEsperado, pessoa.getSalario());		
	}
	
}
