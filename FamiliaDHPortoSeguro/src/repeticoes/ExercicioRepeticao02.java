package repeticoes;

import java.util.Scanner;

public class ExercicioRepeticao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2) Ler 10 n�meros e imprimir quantos 
		 *    s�o pares e quantos s�o �mpares. (FOR)
		 */
	
		int numero, qtdPares = 0, qtdImpares = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++) {
			System.out.println("\nDigite seu n�mero: ");
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				qtdPares++;
			}
			else {
				qtdImpares++;
			}
		}
			
		System.out.println("\nForam citados " +qtdPares+" n�meros pares e " +qtdImpares+" n�meros �mpares");
		
	}
	
}
