
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Daniel");
		gerente.setSalario(6000.0);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);
		
		AtendentePF contas = new AtendentePF();
		contas.setSalario(2500.0);

		Designer designer = new Designer();
		designer.setSalario(2800.0);
		
				
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(contas);
		controle.registra(designer);
		
		System.out.println(controle.getPremio());
		
	}
	
}