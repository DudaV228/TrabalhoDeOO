package Model;

public abstract class VagaEmprego {
	protected String funcao;
	protected double salario;
	protected int hrs; // carga horaria
	protected String nivelescolar;
	protected int qtd;

	public String getfuncao() {
		return funcao;
	}

	public void setfuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public String getNivelescolar() {
		return nivelescolar;
	}

	public void setNivelescolar(String nivelescolar) {
		this.nivelescolar = nivelescolar;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
