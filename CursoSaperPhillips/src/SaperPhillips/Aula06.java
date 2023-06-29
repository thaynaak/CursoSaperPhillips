package SaperPhillips;

import java.util.Scanner;

public class Aula06 {

	public static void main(String[] args) {
		Account cliente = new Account(null, 0);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome do cliente 1: ");
				cliente.setName(input.nextLine());
		System.out.print("Digite o saldo do cliente 1: ");
		cliente.deposito(input.nextDouble());
		System.out.printf("Nome do cliente 1: %s%n", cliente.getName());
		System.out.printf("Saldo do cliente 1: %.2f%n", cliente.getSaldo());
		
		Scanner input2 = new Scanner(System.in);
	
		System.out.print("Digite o nome do cliente 2: ");
		cliente.setName(input2.nextLine());
		System.out.print("Digite o saldo do cliente 2: ");
		cliente.saque(input2.nextDouble());
		
		System.out.printf("Nome do cliente 2: %s%n", cliente.getName());
		System.out.printf("Saldo do cliente 2: %.2f%n", cliente.getSaldo());
		
		
	input.close();
	input2.close();}

}
