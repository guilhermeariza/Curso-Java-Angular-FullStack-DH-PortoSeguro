package repeticoes;

import java.util.Scanner;

public class ExercicioRepeticao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1) Informar todos os números de 1000 a 1999 que 
		 *    quando divididos por 11 obtemos resto = 5. (FOR)
		 */
	
		Scanner leia = new Scanner(System.in);
		
		for(int x = 1000; x <= 1999; x++) {
			if(x % 11 == 5) {
				System.out.println("\nO número "+x+" é divisível por 11 e tem resto 5");
			}
		}
		
	}

}
