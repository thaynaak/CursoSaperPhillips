package SaperPhillips;

import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {
		Scanner inputStrings = new Scanner(System.in);
		Scanner input = new Scanner(System.in);


		System.out.print("-- Criando cadastro funcionario 1 --\n");
		System.out.print("Digite o nome do funcionario 1: ");
		Employee funcionario1 = new Employee(inputStrings.nextLine(), inputStrings.nextLine(), 10000.00);
		
		System.out.print("-- Criando cadastro funcionario 2 --\n");
		System.out.print("Digite o nome do funcionario 2: ");
		Employee funcionario2 = new Employee(inputStrings.nextLine(), inputStrings.nextLine(), 5000.00);
	
		System.out.print(" -- Informações primeiro funcionario --\n");

		System.out.printf("Primeiro Nome do funcionario 1: %s%n", funcionario1.getPrimeiro());
		System.out.printf("Ultimo Nome do funcionario 1: %s%n", funcionario1.getUltimo());
		System.out.printf("Salario funcionario 1 anual: %.2f%n", funcionario1.getSalario()*12);
		
		System.out.print(" -- Informações segundo funcionario --\n");

		System.out.printf("Primeiro Nome do funcionario 2: %s%n", funcionario2.getPrimeiro());
		System.out.printf("Ultimo Nome do funcionario 2: %s%n", funcionario2.getUltimo());
		System.out.printf("Salario do funcionario 2 anual: %.2f%n", funcionario2.getSalario()*12);
	
	input.close();
	inputStrings.close();
	}

}
