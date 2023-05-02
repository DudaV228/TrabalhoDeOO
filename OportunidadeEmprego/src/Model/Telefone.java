package Model;

public class Telefone {
	private int DDD;
	private long tel;

	public Telefone(int dDD, int tel) {
		DDD = dDD;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Telefone: (" + DDD + ") " + tel;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

}
