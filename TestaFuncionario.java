
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario daniel = new Funcionario();
		daniel.setNome("Daniel");
		daniel.setCpf("2222222-22");
		daniel.setSalario(2500.00);
		
		System.out.println(daniel.getNome());
		System.out.println(daniel.getCpf());
		System.out.println(daniel.getSalario());
		System.out.println(daniel.getBonificacao());
	}

}