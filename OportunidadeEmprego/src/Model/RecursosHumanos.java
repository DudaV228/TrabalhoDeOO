package Model;

public class RecursosHumanos extends VagaEmprego {
	private String departamentoGestao;

	public RecursosHumanos(String f, double sal, int hr, String ne, int qtd, String d) {
		funcao = f;
		departamentoGestao = d;
		salario = sal;
		hrs = hr;
		nivelescolar = ne;
		this.qtd = qtd;

	}

	public RecursosHumanos() {
		super();
	}

	@Override
	public String toString() {
		return "\nFuncao: " + funcao + "\nDepartamento: " + departamentoGestao + "\nSalario: R$" + salario
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

	public String getdepartamentoGestao() {
		return departamentoGestao;
	}

	public void setdepartamentoGestao(String departamentoGestao) {
		this.departamentoGestao = departamentoGestao;
	}

}
