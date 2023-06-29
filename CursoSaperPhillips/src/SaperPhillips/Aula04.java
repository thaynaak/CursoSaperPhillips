package SaperPhillips;

import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {
		
		//modulo |2|
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		double n1 = input.nextDouble();
		
		if (n1>=0){
			System.out.printf("O modulo de %.2f é: %.2f", n1, n1);
			}
		else {
			System.out.printf("O modulo de %.2f é: %.2f", n1, n1*-1);

					} input.close();
}
}