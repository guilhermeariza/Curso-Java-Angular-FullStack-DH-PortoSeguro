package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2)Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo 
		 * 	 e n�mero de horas trabalhadas de um oper�rio. 
		 * 	 E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
		 * 	 Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
		 * 	 caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
		 * 	 No final do processamento imprimir o sal�rio total e o sal�rio excedente. 
		 */
		
		int C, N = 0, E = 0, S = 0, Stotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme a quantidade de horas trabalhadas: ");
		N = leia.nextInt();
		S = 10 * N;
		if(N > 50) {
			E = (N - 50) * 20;
			System.out.println("\nGanho em hora extra: \nR$:"+E+" reais");
			
		}
		
		Stotal = S + E;
		System.out.println("\nSal�rio sem os ganhos em hora extra: \nR$:" +S+" reais");
		System.out.println("\nSal�rio total: \nR$:" +Stotal+" reais");


	}
	
}
