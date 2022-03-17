package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 3)Desenvolva um sistema em que:
		 *	 Leia 4 (quatro) números;
		 *	 Calcule o quadrado de cada um;
		 * 	 Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		 *	 Caso contrário, imprima os valores lidos e seus respectivos quadrados. 
		 */
		
		double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o primeiro número: ");
		n1 = leia.nextDouble();
		n1 = Math.pow(n1, 2);
		
		System.out.println("\nInforme o segundo número: ");
		n2 = leia.nextDouble();
		n2 = Math.pow(n2, 2);
		
		System.out.println("\nInforme o terceiro número: ");
		n3 = leia.nextDouble();
		n3 = Math.pow(n3, 2);
		
		System.out.println("\nInforme o quarto número: ");
		n4 = leia.nextDouble();
		n4 = Math.pow(n4, 2);
		
		if(n3 >= 1000) {
			System.out.println(+n3);
			
		}
		else {
			System.out.println("\nPrimeiro quadrado: " +n1+ "\nSegundo quadrado: " +n2+ "\nTerceiro quadrado: " +n3+ "\nQuarto quadrado: " +n4);

		}

	}

}
