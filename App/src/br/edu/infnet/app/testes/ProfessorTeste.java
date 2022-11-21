package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {

		Professor p1 = new Professor("Huguinho", 20);
//		p1.setDevFull(false);
		p1.setLinguagem("Java");
		p1.setSalario(1000);
		p1.imprimir(0);

		Professor p2 = new Professor("Aninha", 40, 2000, "Delphi", true);
		p2.imprimir(0);
		
		System.out.println("Processo finalizado!!!");
	}
}
