package Classe;

public class Usuarios {

	String nome;
	String email;
	
	Usuarios(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuarios) {
			Usuarios outro = (Usuarios) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual == emailIgual;
		} else {
			return false;
		}
	}
		
	@Override
	public int hashCode() {
		
		return 1;
	}
		
	
	
}
