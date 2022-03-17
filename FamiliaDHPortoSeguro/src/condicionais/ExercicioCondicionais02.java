package condicionais;

import java.util.Scanner;

public class ExercicioCondicionais02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2)Elabore um sistema que leia as variáveis C e N, respectivamente código 
		 * 	 e número de horas trabalhadas de um operário. 
		 * 	 E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 * 	 Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
		 * 	 caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		 * 	 No final do processamento imprimir o salário total e o salário excedente. 
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
		System.out.println("\nSalário sem os ganhos em hora extra: \nR$:" +S+" reais");
		System.out.println("\nSalário total: \nR$:" +Stotal+" reais");


	}
	
}
