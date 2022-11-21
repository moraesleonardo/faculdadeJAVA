package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.setIdade(44);
		a1.setSalario(1000);
		a1.setAno_letivo(2);
		a1.setDesconto_escolar(300);
		a1.imprimir(0);

		Aluno a2 = new Aluno(null, 44);
		a2.setSalario(1000);
		a2.setAno_letivo(1);
		a2.setDesconto_escolar(200);
		a2.imprimir(0);

		Aluno a3 = new Aluno("Elberth", 44, 1000, 200, 300);
		a3.imprimir(0);
	}
}
