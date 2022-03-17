package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*6)Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		 *	Infantil A = 5 a 7 anos
		 *	Infantil B = 8 a 11 anos
		 *	Juvenil A = 12 a 13 anos
		 *	Juvenil B = 14 a 17 anos 
		 *	Adultos = Maiores de 18 anos
		 */
		
		int idadeNadador;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nDigite a idade do nadador para categoriza-lo: ");
		idadeNadador = read.nextInt();
		if(idadeNadador >=5 && idadeNadador <=7) {
			System.out.println("\nEste nadador se categoriza como Infantil A ");

		}
		else if(idadeNadador >=8 && idadeNadador <=11){
			System.out.println("\nEste nadador se categoriza como Infantil B");

		}
		else if(idadeNadador >=12 && idadeNadador <=13){
			System.out.println("\nEste nadador se categoriza como Juvenil A");
			
		}		
		else if(idadeNadador >=14 && idadeNadador <=17){
			System.out.println("\nEste nadador se categoriza como Juvenil B");

		}
		else if(idadeNadador >=18){
			System.out.println("\nEste nadador se categoriza como Adulto");

		}

		
	}

}
