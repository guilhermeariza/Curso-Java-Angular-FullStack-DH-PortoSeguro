package repeticoes;

import java.util.Scanner;

public class ExercicioRepeticao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 3) Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 *    Total de pessoas com mais de 50 anos. 
		 *    O programa termina quando for inserida uma idade maior que 90. (WHILE)
		 */
		
		int idade = 0, qtdMenoresDe21 = 0, qtdMaioresDe50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		idade = leia.nextInt();
		while(idade <= 90) {
			if(idade < 21) {
				qtdMenoresDe21++;
			}
			else if(idade > 50){
				qtdMaioresDe50++;
			}
		}
		
		System.out.println("\nForam inseridas " +qtdMenoresDe21+ " de pessoas menores de 21 anos e " +qtdMaioresDe50+" de pessoas maiores de 50 anos");
		
	}

}
