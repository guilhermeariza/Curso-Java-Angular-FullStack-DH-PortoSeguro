package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Fa�a um sistema que leia um n�mero inteiro e 
		 * mostre uma mensagem indicando se este n�mero 
		 * � par ou �mpar, e se � positivo ou negativo 
		 */
		
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com um n�mero inteiro: ");
			numero = leia.nextInt();
		}
		
		if(numero % 2 == 0) {
			if(numero>=0) {
				System.out.println("\nEsse n�mero � par e positivo");
			}
			else {
				System.out.println("\nEsse n�mero � par e negativo");
			}
		}
		else {
			if(numero>=0) {
				System.out.println("\nEsse n�mero � �mpar e positivo");
			}
			else {
				System.out.println("\nEsse n�mero � �mpar e negativo");
			}
		}
	}

}
