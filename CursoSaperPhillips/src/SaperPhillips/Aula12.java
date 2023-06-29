package SaperPhillips;

//Fazer um programa que recebe a nota de cada aluno de uma
//turma. O programa deve mostrar a média geral da turma e a
//quantidade de alunos com média maior ou igual a média da turma.

import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] notasAlunos = new int[3];
		double mediaTurma = 0;
		int somaNotas = 0;
		int contador = 0;

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.printf("Digite a nota dos alunos:", i+1);
			notasAlunos[i] = scan.nextInt();
			somaNotas += notasAlunos[i];

		}
		mediaTurma = somaNotas / (double) notasAlunos.length;
		System.out.println("A media da turma é: " + mediaTurma);
		
		for (int i = 0; i < notasAlunos.length; i++) {
			if (notasAlunos[i] >= mediaTurma) {
				contador++;
			}
		}
		
		System.out.println("Quantidade de alunos com nota maior ou igual a média: " + contador);

		scan.close();
	}

}
