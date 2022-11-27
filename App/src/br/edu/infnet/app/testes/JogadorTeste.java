package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Jogador;

public class JogadorTeste {

	public static void main(String[]args) {
		Jogador j1 = new Jogador();
		j1.setAnoNascimento(1985);
		j1.setNome("Diego");
		j1.setQtdeTituloInternacional(8);
		j1.setQtdeTituloNacional(12);
		j1.imprimir();
		
	}
}
