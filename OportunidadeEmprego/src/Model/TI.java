package Model;

public class TI extends VagaEmprego {
	private String linguagemProgramacao;

	public TI(String f, double sal, int hr, String ne, int qtd, String r) {
		funcao = f;
		linguagemProgramacao = r;
		salario = sal;
		hrs = hr;
		nivelescolar = ne;
		this.qtd = qtd;
	}

	public TI() {
		super();
	}

	@Override
	public String toString() {
		return "\nFuncao: " + funcao + "\nRequisitos: " + linguagemProgramacao + "\nSalario: R$" + salario
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

	public String getLinguagemProgramacao() {
		return linguagemProgramacao;
	}

	public void setLinguagemProgramacao(String linguagemProgramacao) {
		this.linguagemProgramacao = linguagemProgramacao;
	}

}
