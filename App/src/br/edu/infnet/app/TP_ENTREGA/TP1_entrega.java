package br.edu.infnet.app.TP_ENTREGA;

import java.util.Arrays;
import java.util.Scanner;

public class TP1_entrega {
	private static String[] nomes;
	private static float[] notasAV1;
	private static float[] notasAV2;
	
	private static final int tamanho = 100;
	
	private static void imprimir() {
		for (int i = 0; i < tamanho; i++) {
				if(nomes[i] != null) {
					imprimir(i);
				}
		}
}

	private static void imprimir(int indice) {
		float mediaFinal = calcularmediaFinal(indice);
		System.out.println("<"+indice+"> " +
				nomes[indice] + " * " +
				notasAV1[indice] + " * " +
				notasAV2[indice] + " * " +
				mediaFinal + " * " +
				obterSituacao(mediaFinal)
				);
}

	private static float calcularmediaFinal(int indice){
		return (notasAV1[indice] + notasAV2[indice])/2;
}

		private static String obterSituacao(float sit) {
			if(sit >= 7) {
				return "Aprovado";
			}else if(sit < 7 && sit >= 4){
				return "Prova Final";}
			else{
				return "Reprovado";}
		}

			public static void main(String[] args) {
				nomes = new String[tamanho];
				notasAV1 = new float[tamanho];
				notasAV2 = new float[tamanho];
				
				Scanner in = new Scanner(System.in);
				String opcao;
				int pos = 0;
				
				do {
					System.out.println("[1] Registrar as notas de um novo aluno");
					System.out.println("[2] Consultar boletim de um aluno");
					System.out.println("[3] Consultar notas da turma");
					System.out.println("[4] Sair");
					System.out.print("Informe a opção desejada: ");
					
					opcao = in.next();
					
					switch (opcao) {
				
						case "1":
							if(pos < tamanho){
								System.out.print("Informe o seu nome: ");
								nomes[pos] = in.next();
								System.out.print("Informe a sua nota da AV1: ");
								notasAV1[pos] = in.nextInt();
								System.out.print("Informe a sua nota da AV2: ");
								notasAV2[pos] = in.nextFloat();
								imprimir(pos);
								pos++;
							} else {
								System.out.println("Impossível realizar um novo cadastramento!");
								}
								break;
								
						case "2":
								System.out.print("Informe o código de registro: ");
								int id = in.nextInt();
								imprimir(id);
								break;
						
						case "3":
								imprimir();
								break;
						
						case "4":
								System.out.println("Saída");
								break;
								default:
								break;
						}
						} while (!"4".equalsIgnoreCase(opcao));
								System.out.println("Processamento finalizado!!");
								in.close();
						}
				}
		