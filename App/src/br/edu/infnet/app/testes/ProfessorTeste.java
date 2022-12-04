package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Aluno;
import br.edu.infnet.app.dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		Professor p1 = new Professor("Pedro", 50);
		p1.setNome("Pedro");
		p1.setIdade(50);
		p1.setLinguagem("Java");
		p1.setSalario(1000);
		p1.imprimir(0);
	}
}
