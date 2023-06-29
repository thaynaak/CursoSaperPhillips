	
package SaperPhillips;

import java.util.Scanner;

public class VariaveisAula2 {


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Digite o primeiro número: ");
		int Numero1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int Numero2 = input.nextInt();
		int Sum = Numero1 + Numero2;
		System.out.printf("Soma: %d%n", Sum);
		
		input.close();

	}

}
