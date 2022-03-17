package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	5)A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m
		 *    3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
		 *    O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 
		 *    0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o 
		 *    �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas 
		 *    atividades, se o �ndice atingir 0,5 todos os grupos devem ser 
		 *    notificados a paralisarem suas atividades.
		 *    Fa�a um sistema que leia o �ndice de polui��o medido e emita a 
		 *    notifica��o adequada aos diferentes grupos de empresas. 
		 */

		float indice;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o �ndice de polui��o: ");
		indice = read.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("\nInd�strias do grupo 1, suspendam suas atividades imediatamente! O �ndice est� maior ou igual a 0,3");
		}
		else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("\nInd�strias do grupo 1 e grupo 2, suspendam suas atividades imediatamente! O �ndice est� maior ou igual a 0,4");
		}
		else if(indice >= 0.5) {
			System.out.println("\nInd�strias do grupo 1, grupo 2 e grupo 3, suspendam suas atividades imediatamente! O �ndice est� maior ou igual a 0,5");
		}
		
		
	}

}
