//Defini um contrato que se chama autenticação e quem assinar por esse contrato, precisará implementar:
// métodos setSenha e autentica

public abstract interface Autenticavel {
		
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}