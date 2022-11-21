package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante_pessoa;

public class Pessoa {

	private String nome;
	private int idade;
	private static float salario;
	private float desconto_escolar;
	private float ano_letivo;
	
	public Pessoa() {
		this.nome = Constante_pessoa.NOME_PADRAO;
		this.idade = Constante_pessoa.MAIOR_IDADE;
     	this.salario = Constante_pessoa.SALARIO_MINIMO;
     	this.ano_letivo = Constante_pessoa.ANO_MINIMO;
		this.desconto_escolar = Constante_pessoa.DESCONTO_MINIMO;
	}
	
	public Pessoa(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade, float salario) {
		this(nome, idade);
		this.salario = salario;
		
	}
	
	public Pessoa(String nome, int idade, float salario, float ano_letivo, float desconto_escolar) {
		this();
		this.salario = salario;
		this.ano_letivo = ano_letivo;
		this.desconto_escolar = desconto_escolar;
	}
	

	@Override
	public String toString() {
		return nome + 
				";"	+ idade + 
				";"	+ salario + 
				";"	+ ano_letivo + 
				";" + desconto_escolar
				
				;}
	
	public void imprimir(int indice){		
		//float salarioLiquido = calcularSalarioLiquido();
		System.out.println("<"+indice+"> ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Ano letivo: " + ano_letivo);
		System.out.println("Desconto Escolar (%): " + desconto_escolar + " %");
		System.out.println("Salário Líquido = R$ " + salario);
		//System.out.println("Situação = " + obterSituacao(salarioLiquido));
	}
	
	public static float calcularSalarioLiquido(){
		return salario;
	}
	
	//public static String obterSituacao(float salarioLiquido){		
	//	if(salarioLiquido >= Constante_pessoa.SALARIO_LIQUIDO_MAXIMO) {
	//		return Constante_pessoa.RICO;
	//	}		
	//	return Constante_pessoa.POBRE;
	//}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
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
}