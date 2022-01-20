
public class AberturaDeContas extends Funcionario {
	
    public double getBonificacao() {	
    
        System.out.println("Este é o método de bonificação do setor de abertura de contas");
    
    return super.getBonificacao() + 100; 	

}
    
}