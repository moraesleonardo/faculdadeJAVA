package br.edu.infnet.app.dominio;

import java.util.List;

public class Equipe {
	private String nome;
	private int anoFundacao;
	private Contato contato;
	private List<Profissional> profissionais;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public List<Profissional> getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s- %d - %s - %d",
				nome,
				anoFundacao,
				contato,
				profissionais.size()
			);
	}
	
	public void imprimir() {
		System.out.println("Equipe: " + toString());
		
		System.out.println("Profissionais: ");
		
		for(Profissional profissional : this.getProfissionais()) {
			System.out.println(profissional);	
		}
		
	}
	
	
	
}
