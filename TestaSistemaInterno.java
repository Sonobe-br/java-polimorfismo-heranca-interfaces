
public class TesteSistemaInterno {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSenha(3333);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
						
		SistemaInterno sysInter = new SistemaInterno();
		sysInter.autentica(gerente);
		sysInter.autentica(adm);
		
	}

}