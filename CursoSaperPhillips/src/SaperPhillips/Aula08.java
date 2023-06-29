package SaperPhillips;

import java.util.Scanner;
public class Aula08 {

				public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        double a, b, c, delta, x1, x2;

		        System.out.println("Digite os coeficientes da equação do segundo grau (ax² + bx + c):");
		        System.out.print("a: ");
		        a = input.nextDouble();
		        System.out.print("b: ");
		        b = input.nextDouble();
		        System.out.print("c: ");
		        c = input.nextDouble();

		        delta = Math.pow(b, 2) - 4 * a * c;

		        if (delta > 0) {x1 = (-b + Math.sqrt(delta)) / (2 * a);
		            x2 = (-b - Math.sqrt(delta)) / (2 * a);
		            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f", x1, x2);
		        } else if (delta == 0) {
		            x1 = (-b) / (2 * a);
		            System.out.printf("A equação possui apenas uma raiz real: %.2f", x1);
		        } else{
		            System.out.println("A equação não possui raízes reais.");
		        }

		        input.close();
		    }
		

	}


