package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 8)Construa um sistema para ler uma 
		 *   vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100,
		 *   caso contr�rio imprimi-la com o valor zero. 
		 */
		
		int N;
		
		Scanner read = new Scanner(System.in);
		System.out.println("\nDigite seu n�mero: ");
		N = read.nextInt();
		
		if(N > 100) {
			System.out.println(+N);
		}
		else {
			System.out.println("\n"+0);
		}

		
	}

}
