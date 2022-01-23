
//o gerente é um Funcionario do banco e herda os atributos da classe Funcionario. Assina o contrato 
//de Autenticação.

public class Gerente extends Funcionario implements Autenticavel { 
	
	private int senha;
	
	public double getBonificacao() {	
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario(); 	
	
	}
	
	@Override
	public void setSenha(int senha) {
		
		this.senha = senha;
		
	}
	
	@Override
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			
			return true;
			
		}  else {
			
			return false;
		}	
			
	}
		
}

