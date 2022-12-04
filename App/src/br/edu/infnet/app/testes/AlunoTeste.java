package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Aluno;


public class AlunoTeste {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		a1.setNome("Carlos");
		a1.setIdade(44);
		a1.setAno_letivo(2);
		a1.setDesconto_escolar(30);
		a1.imprimir(0);
	}
}
