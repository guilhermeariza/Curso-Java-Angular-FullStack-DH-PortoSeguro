package repeticoes;

import java.util.Scanner;

public class ExercicioRepeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2) Ler 10 números e imprimir quantos 
		 *    são pares e quantos são ímpares. (FOR)
		 */
	
		int numero, qtdPares = 0, qtdImpares = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++) {
			System.out.println("\nDigite seu número: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				qtdPares++;
			}
			else {
				qtdImpares++;
			}
		}
			
		System.out.println("\nForam citados " +qtdPares+" números pares e " +qtdImpares+" números ímpares");
		
	}
	
}
