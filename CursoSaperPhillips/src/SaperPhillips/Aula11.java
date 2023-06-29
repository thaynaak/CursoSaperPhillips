package SaperPhillips;

import java.util.Scanner;

public class Aula11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num;
		double numSoma = 0;
		int i = 0;
		
		do{
			System.out.println("Digite um numero inteiro ou -1 para sair");
			num = input.nextInt();
				if (num>0 && num%2==0) {
					System.out.println("O numero entrará na média dos pares positivos");
					numSoma = numSoma + num;
					 i++;
					
				} else System.out.println("Numero digitado não entrará na média dos pares positivos"); 
			
		} while(num!=-1);
		
		System.out.println("A soma dos numeros pares digitados é: " + numSoma);
		System.out.println("A media dos numeros pares digitados é: " +numSoma/i);
		
	input.close();}

}
