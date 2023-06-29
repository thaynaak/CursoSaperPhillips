package SaperPhillips;
import java.util.Scanner;

public class ExercicioCondicionais2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite 3 números para descobrir qual o menor entre eles");
		
		System.out.println("Digite o primeiro número: ");
		int num1 = input.nextInt();
		System.out.println("Digite o primeiro número: ");
		int num2 = input.nextInt();
		System.out.println("Digite o primeiro número: ");
		int num3 = input.nextInt();
		
			
		//encontrar menor
		if (num1<num2 && num1<num3){
			System.out.println("O menor numero é: "+ num1);
					if (num2<num1 && num2<num3)
				System.out.println("O menor numero é: "+ num2);
					if (num3<num1 && num3<num2)
						System.out.println("O menor numero é: "+ num3);
					
	

		//encontrar maior
			
} input.close();
	}	
}

