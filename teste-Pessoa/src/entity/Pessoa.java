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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}	
}
