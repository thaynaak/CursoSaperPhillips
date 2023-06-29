package SaperPhillips;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		  
		double salario, aumento, novoSalario;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		salario = input.nextDouble();
		
		aumento=(salario*0.10);
		novoSalario = (aumento + salario);
		System.out.println("Aumento foi:" + aumento);
		System.out.println("Novo salario é: " + novoSalario);
		
		input.close();
	}

}
