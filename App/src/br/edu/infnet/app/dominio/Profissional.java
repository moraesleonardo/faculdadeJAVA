package br.edu.infnet.app.dominio;

public abstract class Profissional {
	
	private String nome;

	public abstract float calcularSalario();
	
	@Override
	public String toString() {
		return String.format("%s - %.2f", nome, calcularSalario());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
