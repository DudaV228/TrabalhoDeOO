package Model;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String endereco;
	private Telefone telefone;
	private ArrayList<VagaEmprego> vagas = new ArrayList<VagaEmprego>();

	public Empresa(String n, String e, Telefone tel) {
		nome = n;
		endereco = e;
		telefone = tel;
	}

	@Override
	public String toString() {
		return "Nome da empresa: " + nome + "\nEndereco: " + endereco + "\n" + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public ArrayList<VagaEmprego> getVagas() {
		return vagas;
	}

	public void setVagas(VagaEmprego nvagas) {
		vagas.add(nvagas);
	}

	public void listarVagas() {
		System.out.println("\n--- Vagas de emprego ---");
		for (int i = 0; i < vagas.size(); i++) {
			System.out.println(vagas.get(i));
		}
		System.out.println("\n------------------------");
	}
}
