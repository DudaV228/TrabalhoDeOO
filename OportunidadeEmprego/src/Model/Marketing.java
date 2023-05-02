package Model;

public class Marketing extends VagaEmprego {
	private String especializacaoSetorial;

	public Marketing(String f, double sal, int hr, String ne, int qtd, String e) {
		funcao = f;
		salario = sal;
		hrs = hr;
		nivelescolar = ne;
		especializacaoSetorial = e;
		this.qtd = qtd;
	}

	public Marketing() {
		super();
	}

	@Override
	public String toString() {
		return "\nFuncao: " + funcao + "\nEspecializacao: " + especializacaoSetorial + "\nSalario: R$" + salario
				+ "\nCarga horaria: " + hrs + "h" + "\nQuantidade de vagas: " + qtd;
	}

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

	public String getespecializacaoSetorial() {
		return especializacaoSetorial;
	}

	public void setespecializacaoSetorial(String especializacaoSetorial) {
		this.especializacaoSetorial = especializacaoSetorial;
	}

}
