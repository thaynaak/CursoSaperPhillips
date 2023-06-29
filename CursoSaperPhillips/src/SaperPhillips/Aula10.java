package SaperPhillips;

import java.util.Scanner;
//while e do while
public class Aula10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		double nota1;
		double nota2;
	
		int conter = 1;
		while (conter<=100);{
		System.out.println("Digite a nota 1:");
		nota1 = input.nextDouble();
		System.out.println("Digite a nota 2:");
		nota2 = input.nextDouble();
		System.out.printf("A média do aluno é: %.2f%n"+(nota1+nota2)/2.0);
		conter++;
		}
	
	input.close();}

}
