package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	5)A Secretaria de Meio Ambiente que controla o índice de poluição mantém
		 *    3 grupos de indústrias que são altamente poluentes do meio ambiente. 
		 *    O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 
		 *    0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o 
		 *    índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas 
		 *    atividades, se o índice atingir 0,5 todos os grupos devem ser 
		 *    notificados a paralisarem suas atividades.
		 *    Faça um sistema que leia o índice de poluição medido e emita a 
		 *    notificação adequada aos diferentes grupos de empresas. 
		 */

		float indice;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite o índice de poluição: ");
		indice = read.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("\nIndústrias do grupo 1, suspendam suas atividades imediatamente! O índice está maior ou igual a 0,3");
		}
		else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("\nIndústrias do grupo 1 e grupo 2, suspendam suas atividades imediatamente! O índice está maior ou igual a 0,4");
		}
		else if(indice >= 0.5) {
			System.out.println("\nIndústrias do grupo 1, grupo 2 e grupo 3, suspendam suas atividades imediatamente! O índice está maior ou igual a 0,5");
		}
		
		
	}

}
