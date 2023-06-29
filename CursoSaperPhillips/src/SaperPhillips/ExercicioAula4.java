package SaperPhillips;

import java.util.Scanner;

public class ExercicioAula4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		int num1 = input.nextInt();
		
		if (num1%2 ==0) {
			System.out.println("O número é par!");
			
		} else {
			System.out.println("O número é impar!");
		}
	input.close();}

}
