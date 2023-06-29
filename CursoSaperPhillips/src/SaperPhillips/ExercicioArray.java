package SaperPhillips;

import java.util.Scanner;

public class ExercicioArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] A = new int[6];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um numero: ");
			A[i] = input.nextInt();
			// System.out.println(A[i]);
			if (A[i] % 2 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println("Elementos do vetor A: " + A[i]);
		}

		input.close();
	}

}
