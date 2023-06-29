package SaperPhillips;

import java.util.Scanner;

public class ExercicioCondicionais {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double num1 = input.nextDouble();
		
		System.out.println("Digite o segundo numero");
		double num2 = input.nextDouble();
		
		double multiplicacao = num1 * num2;
		System.out.printf("O resultado da multiplicação é: %.2f%n", multiplicacao);
			
		if (multiplicacao <25 || multiplicacao >50) {
			System.out.printf("Metade do valor da multiplicação: %.2f%n", multiplicacao/2.0);
		}
		input.close();

	}

}
