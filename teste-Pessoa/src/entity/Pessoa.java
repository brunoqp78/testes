package entity;

public class Pessoa {
	private static final int LIMITEINFERIORNOME = 3;
	private static final int LIMITESUPERIORNOME = 100;
	private static final String VALORINVALIDONOME = "nomeInvalido";
	private static final double LIMITEINFERIORSALARIO = 1100;
	private static final double LIMITESUPERIORSALARIO = 1000000;
	private static final double VALORINVALIDOSALARIO = Double.POSITIVE_INFINITY;
	private static final double LIMITEINFERIORPORCENTAGEM = 1;
	private static final double LIMITESUPERIORPORCENTAGEM = 100;
	private String nome;
	private double salario;

	public Pessoa(String nome) {
		validaNome(nome);
	}

	public Pessoa() {	}

	public String getNome() {		
		return this.nome;
	}

	public void setNome(String nome) {
		validaNome(nome);
	}

	private void validaNome(String nome){
		if (nome.length() >= LIMITEINFERIORNOME && nome.length() <= LIMITESUPERIORNOME)
			this.nome = nome;
		else
			this.nome = VALORINVALIDONOME;		
	}

	public void setSalario(double salario) {
		if (salario >= LIMITEINFERIORSALARIO && salario <= LIMITESUPERIORSALARIO) {
			this.salario = salario;
		}else {
			this.salario = VALORINVALIDOSALARIO;
		}
		
	}

	public double getSalario() {		
		return this.salario;
	}

	public void reajustarSalario(double porcentagem) {
		if (porcentagem >= LIMITEINFERIORPORCENTAGEM && porcentagem <= LIMITESUPERIORPORCENTAGEM) {
			this.salario = salario * (1+porcentagem/100);
		}
		
	}
}
