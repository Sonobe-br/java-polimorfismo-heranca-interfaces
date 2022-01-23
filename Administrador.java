// o administrador também herda os atributos da classe Funcionario Autenticavel
public class Administrador extends FuncionarioAutenticavel {
		
	@Override
	public double getBonificacao() {
	
		return 50;
		
	}
	
}
