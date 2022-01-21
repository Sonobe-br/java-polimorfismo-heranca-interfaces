
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente contacorrente = new ContaCorrente(273, 1099);
		contacorrente.depositar(150.0);
		//System.out.println("Saldo Conta Corrente: " + contacorrente.getSaldo());
		
		ContaPoupanca contapoupanca = new ContaPoupanca(341, 1077);
		contapoupanca.depositar(150.0);	
	
		contacorrente.transfere(10.0, contapoupanca);
		
		System.out.println("Saldo Conta Poupança: " + contapoupanca.getSaldo());
		System.out.println("Saldo Conta Corrente: " + contacorrente.getSaldo());	
		
	}

}
