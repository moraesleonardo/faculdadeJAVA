package br.edu.infnet.app.dominio;

import br.edu.infnet.app.auxiliar.Constante_pessoa;
import br.edu.infnet.app.exception.NomeIncompletoException;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected static float salario;
	private float desconto_escolar;
	private float ano_letivo;
	private String sobrenome;
	private String ultimoNome;
	
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
	
	public void setNome1(String nome) throws NomeIncompletoException {
		
		if(nome == null) {
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		if(posInicial < 0 || posFinal < 0) {
			throw new NomeIncompletoException ("O preenchimento do campo 'nome' está incorreto");
		}

		this.nome = nome.substring(0, posInicial);
		this.setSobrenome(nome.substring(posInicial, posFinal).trim());
		this.setUltimoNome(nome.substring(posFinal).trim());
	}	
	
		public String obterStringSalarioPorPessoa() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome()); 
		sb.append(";");
		sb.append(this.calcularSalarioLiquido());
		sb.append("\r\n");
		
		return sb.toString();
		}
		
	@Override
	public String toString() {
		return nome + 
				";"	+ idade 
				;}
	
	public void imprimir(int indice){		
	float salarioLiquido = calcularSalarioLiquido();
	System.out.println("<"+indice+"> ");
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.println("Ano letivo: " + ano_letivo);
	System.out.println("Desconto Escolar (%): " + desconto_escolar + " %");
	System.out.println("Salário Líquido = R$ " + salario);
	}
	
	public static float calcularSalarioLiquido(){
		return salario;
	}
	
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
}