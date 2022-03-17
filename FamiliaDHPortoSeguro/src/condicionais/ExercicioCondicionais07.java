package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 7)Receber valores de base e altura de um triângulo e 
		 *   verificar se são valores válidos (positivos maiores que zero). 
		 *   Em caso afirmativo, calcular a área do triângulo. 
		 */
		
		float base=0, altura=0, area=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da base do triângulo: ");
		base = leia.nextFloat();
		System.out.println("\nEntre com o valor da altura do triângulo: ");
		altura = leia.nextFloat();
		
		if(base > 0 && altura >0) {
			area = (base * altura) /2;
			System.out.println("\nO valor da area do triângulo é de: " +area);
		}
		else {
			System.out.println("\nNão é possível calcular área de triãngulo com medidas negativas.");
		}
		
	}

}
