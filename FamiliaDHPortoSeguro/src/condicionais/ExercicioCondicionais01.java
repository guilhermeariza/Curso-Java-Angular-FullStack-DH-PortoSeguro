package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	1)Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
		 *    o rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior
		 *    que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar
		 *    um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema
		 *    que leia a vari�vel P (peso de tomates) e verifique se h� excesso. 
		 *    Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar.
		 *    Caso contr�rio mostrar tais vari�veis com o conte�do ZERO. 
		 */
			
		float P, E, M;
		int limitePeso = 50;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o peso dos tomates, Sr. Jo�o: ");
		P = leia.nextFloat();
		if(P > limitePeso) {
			E = P - limitePeso;
			M = E * 4;
			System.out.println("\nJo�o, voc� tem uma multa de "+M+" a pagar.");
			
		}else {
			System.out.println("\nJo�o, o peso dos seus tomates est� dentro da quantidade regulamentada.");
		}
		
	}

}
