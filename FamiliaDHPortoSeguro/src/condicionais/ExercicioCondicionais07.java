package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 7)Receber valores de base e altura de um tri�ngulo e 
		 *   verificar se s�o valores v�lidos (positivos maiores que zero). 
		 *   Em caso afirmativo, calcular a �rea do tri�ngulo. 
		 */
		
		float base=0, altura=0, area=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da base do tri�ngulo: ");
		base = leia.nextFloat();
		System.out.println("\nEntre com o valor da altura do tri�ngulo: ");
		altura = leia.nextFloat();
		
		if(base > 0 && altura >0) {
			area = (base * altura) /2;
			System.out.println("\nO valor da area do tri�ngulo � de: " +area);
		}
		else {
			System.out.println("\nN�o � poss�vel calcular �rea de tri�ngulo com medidas negativas.");
		}
		
	}

}
