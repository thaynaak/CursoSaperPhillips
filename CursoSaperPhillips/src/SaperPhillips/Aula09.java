package SaperPhillips;

import java.util.Scanner;

public class Aula09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o valor da compra");
		double valorCompra = input.nextDouble();
		
		System.out.println("Digite o código da forma de pagamento"); 
		System.out.print(
		"1 - Pagamento em dinheiro." + 
		" 2 - Pagamento em 1x no cartão"+ 
		" 3 - Pagamento em 2x no cartão" + 
		" 4 - Pagamento em 3x no cartão");
		
		int codigoPagamento = input.nextInt();
		
		switch (codigoPagamento) {
		case 1: valorCompra = valorCompra * 0.9;
			break;
		case 2: valorCompra = valorCompra * 0.95;
			break;
		case 3:
			break;
		case 4: valorCompra = valorCompra * 1.05;
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		System.out.print("O valor da sua compra foi: " 
		+ valorCompra + " A forma de pagamento foi: " + codigoPagamento);

	input.close();}

}
