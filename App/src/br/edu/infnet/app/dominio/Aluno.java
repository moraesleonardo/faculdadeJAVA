package br.edu.infnet.app.dominio;

public class Aluno extends Pessoa {

	private float ano_letivo;
	private float desconto_escolar;

	public Aluno() {
	}
	
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}
	
	public Aluno(String nome, int idade, float ano_letivo, float desconto_escolar) {
		super(nome, idade);
		this.ano_letivo = ano_letivo;
		this.desconto_escolar = desconto_escolar;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + ano_letivo + ";" + desconto_escolar;
	}

	public float getAno_letivo() {
		return ano_letivo;
	}
	
	public void setAno_letivo(float ano_letivo) {
		this.ano_letivo = ano_letivo;
	}
	
	public float getDesconto_escolar() {
		return desconto_escolar;
	}
	
	public void setDesconto_escolar(float desconto_escolar) {
		this.desconto_escolar = desconto_escolar;
	}

	public void imprimir(int indice) {
		System.out.println("<"+indice+"> ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Ano letivo: " + ano_letivo);
		System.out.println("Desconto Escolar (%): " + desconto_escolar + " %");
		}
	}
