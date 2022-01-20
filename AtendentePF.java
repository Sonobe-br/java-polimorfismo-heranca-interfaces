
public class AtendentePF extends Funcionario {
	
    public double getBonificacao() {	
    System.out.println("Este é o método de bonificação do AtendentePF");
    return super.getBonificacao() + 100; 	

}
    
}