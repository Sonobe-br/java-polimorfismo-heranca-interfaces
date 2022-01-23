
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero)  {
		
		super(agencia, numero);
		
	}
	
	@Override
	public boolean sacar(double valor) {
	
		double valorDoSaque = valor + 0.2;
		
		return super.sacar(valorDoSaque);
	
	}

	@Override
	public void depositar(double valor) {
		
		super.saldo += valor;
	
	}
	
}