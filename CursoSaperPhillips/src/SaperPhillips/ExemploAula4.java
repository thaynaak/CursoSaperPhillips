package SaperPhillips;

import java.util.Scanner;

public class ExemploAula4 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salario do vendedor:");
		double salarioVendedor = input.nextDouble();
		System.out.println("Digite o valor das vendas:");
		double valorVendas = input.nextDouble();
		
		if (salarioVendedor < 1500 && valorVendas > 2000) {
			double aumento = (salarioVendedor * 0.1);
			double novoSalario = (aumento + salarioVendedor);
			System.out.printf("Você recebeu um aumento, seu salario é: %f", novoSalario);
			
		} else {
			System.out.println("Você não recebeu aumento!");
		}
	input.close();

	}

}
