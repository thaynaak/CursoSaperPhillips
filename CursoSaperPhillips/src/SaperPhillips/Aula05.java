package SaperPhillips;

import java.util.Scanner;

public class Aula05 {
	
	//Em conjunto com a classe criada com nome de Account ele executa o medoto da classe e retorna neste programa:

	public static void main(String[] args) {
		Account cliente = new Account(null, 0);
		Scanner input = new Scanner (System.in);
		System.out.println("Digite o nome do cliente");
		String nomeCliente = input.nextLine();
		System.out.println("Digite o saldo do cliente:");
		
		
		
		cliente.setName(nomeCliente);
		System.out.printf("Nome cliente: %s%n",cliente.getName());
		
		
	input.close();}

}