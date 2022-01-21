
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario daniel = new Gerente();
		daniel.setNome("Daniel");
		daniel.setCpf("2222222-22");
		daniel.setSalario(2500.00);
		
		System.out.println(daniel.getNome());
		System.out.println(daniel.getBonificacao());
	}

}