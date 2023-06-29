package SaperPhillips;

import java.util.Scanner;

public class ExemploCondicionais {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = input.nextDouble();
		
		double media1 = (nota1 + nota2) / 2.0;
		
		System.out.printf("Média aluno: %.2f%n", media1);
		
		if (media1 >=7) {
			System.out.println("Aluno aprovado!");
		}else if (media1 >5) {
			System.out.println("Aluno em recuperação!");
		}
		
		else {
			System.out.println("Aluno reprovado!");
		}
		input.close();
	}

}
