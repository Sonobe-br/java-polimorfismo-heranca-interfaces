//agora o gerente se tornou um FuncionarioAutenticavel do banco e herda os atributos da classe Funcionario Autenticavel

public class Gerente extends FuncionarioAutenticavel { 
	
	public double getBonificacao() {	
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario(); 	
	
	}
		
}
