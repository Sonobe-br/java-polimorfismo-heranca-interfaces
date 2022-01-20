
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Daniel");
		gerente.setSalario(6000.0);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);
		
		AberturaDeContas contas = new AberturaDeContas();
		contas.setSalario(2500.0);
		
				
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(contas);
		
		System.out.println(controle.getPremio());
		
	}
	
}