package Model;


public class Main {
	static Marketing j1;
	static Marketing j2;
	static RecursosHumanos j3;
	static RecursosHumanos j4;
	static TI j5;
	static TI j6;
	
	static Empresa e1;
	static Empresa e2;
	
	static Telefone tel;
	static Telefone tel1;

	public static void main(String[] args) {
		j1 = new Marketing("Publicidade", 2400.0, 8, "Ensino medio", 4, "Redes sociais");
		j2 = new Marketing("Consultoria", 3000.0, 8, "Ensino superior", 6, "Boa oratoria");
		
		j3 = new RecursosHumanos("Recursos humanos", 8000.0 ,8, "Ensino superior",  7, "Conhecimento basico em administracao e economia");
		j4 = new RecursosHumanos("Porteiro", 3600.0, 8, "Ensino medio",  2, "Seguranca");
		
		j5 = new TI("Desenvolvedor FrontEnd", 7500.0, 4, "Ensino superior", 4, "Conhecimento aprofundado em Html e css");
		j6 = new TI("Administrador de banco de dados",  5700.0, 6, "Ensino superior",  5, "Conhecimento aprofundado em MySQL");
		
		tel = new Telefone(61, 912345678);
		tel1 = new Telefone(62, 98765432);
	
		e1 = new Empresa("Solution Systems", "Brasilia", tel);
		e2 = new Empresa("Brasbel", "Luziania", tel1);
		
		e1.setVagas(j1);
		e1.setVagas(j3);
		e1.setVagas(j5);
		
		e2.setVagas(j2);
		e2.setVagas(j4);
		e2.setVagas(j6);
				
		System.out.println(e1.toString());
		e1.listarVagas();
		System.out.println(e2.toString());
		e2.listarVagas();
		System.out.println();

	}
}
