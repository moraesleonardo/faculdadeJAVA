package br.edu.infnet.app.TP_ENTREGA;

import java.util.Scanner;

import br.edu.infnet.app.auxiliar.Constante_pessoa;
import br.edu.infnet.app.dominio.Aluno;
import br.edu.infnet.app.dominio.Pessoa;
import br.edu.infnet.app.dominio.Professor;

public class TP2_entrega {

	private static Pessoa[] pessoas;

	private static void imprimir() {		
		for (int i = 0; i < Constante_pessoa.TAMANHO; i++) {
			if(pessoas[i] != null) {
				pessoas[i].imprimir(i);
			}
		}
	}

	public static void main(String[] args) {

		pessoas = new Pessoa[Constante_pessoa.TAMANHO];
		
		Scanner in = new Scanner(System.in);
		
		String opcao;
		int pos = 0;

		do {
			System.out.println("[1] Cadastrar Aluno");
			System.out.println("[2] Cadastrar Professor");
			System.out.println("[3] Consultar Pessoa");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opção desejada: ");						
			opcao = in.next();
			
			switch (opcao) {
			case "1":
				if(pos < Constante_pessoa.TAMANHO) {
					
					Aluno adm = new Aluno();
					
					System.out.print("Informe o seu nome: ");	
					adm.setNome(in.next());
	
					System.out.print("Informe a sua idade: ");	
					adm.setIdade(in.nextInt());
	
					//System.out.print("Informe o seu salário: ");	
					//adm.setSalario(in.nextFloat());
					
					System.out.print("Informe o seu ano letivo: ");	
					adm.setAno_letivo(in.nextFloat());

					System.out.print("Informe o seu desconto escolar (%): ");	
					adm.setDesconto_escolar(in.nextFloat());
					
				
					
					pessoas[pos] = adm;

					pessoas[pos].imprimir(pos);

					pos++;
					
					
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}
				break;

			case "2":
				if(pos < Constante_pessoa.TAMANHO) {
										
					System.out.print("Informe o seu nome: ");
					String nome = in.next();
						
					System.out.print("Informe a sua idade: ");
					int idade = in.nextInt();
										
					Professor prog = new Professor(nome, idade);
					
					System.out.print("Informe o seu salário: ");	
					prog.setSalario(in.nextFloat());
					
					//System.out.print("Informe se é fullstack: ");	
					//prog.setDevFull(in.nextBoolean());

					System.out.print("Informe o sua linguagem principal: ");	
					prog.setLinguagem(in.next());
					
					pessoas[pos] = prog;

					
					pessoas[pos].imprimir(pos);

					pos++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!");
				}
				break;
				
			case "3":
				System.out.print("Informe o índice para impressão: ");						
				int id = in.nextInt();

				if(id >= 0 && id < pos) {
					pessoas[id].imprimir(pos);
				} else {
					System.out.println("O índice ["+id+"] é inválido!!!");
				}
				break;

			case "4":
				System.out.println("Saída");
				break;

			default:
				System.out.println("A opção ["+opcao+"] inválida");
				break;
			}
		} while (!"5".equalsIgnoreCase(opcao));
				
		System.out.println("Processamento finalizado!!!");
		
		in.close();
	}
}