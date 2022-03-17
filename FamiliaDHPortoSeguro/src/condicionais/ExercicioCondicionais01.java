package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	1)João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
		 *    o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior
		 *    que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar
		 *    um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema
		 *    que leia a variável P (peso de tomates) e verifique se há excesso. 
		 *    Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
		 *    Caso contrário mostrar tais variáveis com o conteúdo ZERO. 
		 */
			
		float P, E, M;
		int limitePeso = 50;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o peso dos tomates, Sr. João: ");
		P = leia.nextFloat();
		if(P > limitePeso) {
			E = P - limitePeso;
			M = E * 4;
			System.out.println("\nJoão, você tem uma multa de "+M+" a pagar.");
			
		}else {
			System.out.println("\nJoão, o peso dos seus tomates está dentro da quantidade regulamentada.");
		}
		
	}

}
