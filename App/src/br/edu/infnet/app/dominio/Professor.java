package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante_pessoa;

public class Professor extends Pessoa {

	private String linguagem;

	
	public Professor(String nome, int idade) {
		super(nome, idade);
	}
	
	public Professor(String nome, int idade, float salario, String linguagem, boolean devFull) {
		super(nome, idade, salario);
		this.linguagem = linguagem;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + linguagem;
	}
		
	public void imprimir(int indice) {
		
		System.out.println("<"+indice+"> ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Linguagem: " + linguagem);
		System.out.println("Salário Líquido = R$ " + salario);
	}
	
	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


}