package SaperPhillips;

import java.util.Scanner;

public class ExercicioAula2 {

	public static void main(String[] args) {
	double TamanhoBarra, SobraBarra;
	
	Scanner input = new Scanner (System.in);
	System.out.println("Digite o tamanho desejado: ");
	TamanhoBarra = input.nextDouble();
	SobraBarra = TamanhoBarra%5;
	
	System.out.printf("Sobrou %.2f metros", SobraBarra);
	
	input.close();	

	}

}
