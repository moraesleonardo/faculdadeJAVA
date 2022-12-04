package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Jogador;
import br.edu.infnet.app.exception.JogadorInvalidoException;

public class JogadorTeste {

	public static void main(String[]args) throws Exception {
		
		try {
			Jogador j1 = new Jogador();
			j1.setAnoNascimento(1985);
			j1.setNome("Diego");
			j1.setQtdeTituloInternacional(3);
			j1.setQtdeTituloNacional(8);
			j1.imprimir();
		} catch (JogadorInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		try {
			Jogador j1 = new Jogador();
			j1.setAnoNascimento(1985);
			j1.setNome("Diego");
			j1.setQtdeTituloInternacional(3);
			j1.setQtdeTituloNacional(15);
			j1.imprimir();
		} catch (JogadorInvalidoException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		
	}
}
