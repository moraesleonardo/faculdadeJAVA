package br.edu.infnet.app.dominio;

public class Jogador extends Profissional {
	private int anoNascimento;
	private int qtdeTituloNacional;
	private int qtdeTituloInternacional;
	
	@Override
	public float calcularSalario() {
		return qtdeTituloNacional * 1000 + qtdeTituloInternacional * 5000;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getQtdeTituloNacional() {
		return qtdeTituloNacional;
	}
	public void setQtdeTituloNacional(int qtdeTituloNacional) {
		this.qtdeTituloNacional = qtdeTituloNacional;
	}
	public int getQtdeTituloInternacional() {
		return qtdeTituloInternacional;
	}
	public void setQtdeTituloInternacional(int qtdeTituloInternacional) {
		this.qtdeTituloInternacional = qtdeTituloInternacional;
	}

	@Override
	public String toString() {
		return String.format("%d - %d - %d - %s", 
				anoNascimento, 
				qtdeTituloNacional, 
				qtdeTituloInternacional,
				super.toString()
				);
	}
	public void imprimir() {
		//System.out.println("Nome: " + this.getNome());
		System.out.println("Jogador: " + toString());
	}
	
}
