
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		gerente.setNome("Daniel");
		
		String nome = gerente.getNome();
		
		System.out.println(nome);
		
	}
	
}