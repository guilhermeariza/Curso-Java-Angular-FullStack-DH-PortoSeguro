package arrays;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [] media = new float[5];
		float n1, n2, n3, somaMedia=0, mediaGeral;
		int x, aprovados=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x<5; x++) {
			System.out.println("\nNotas do aluno "+(x+1));
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1 < 0 || n1 > 10) {
				System.out.println("Intervalo de notas errado...\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2 < 0 || n2 > 10) {
				System.out.println("Intervalo de notas errado...\nEntre com a primeira nota: ");
				n2 = leia.nextFloat();
			}
			
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3 < 0 || n3 > 10) {
				System.out.println("Intervalo de notas errado...\nEntre com a primeira nota: ");
				n3 = leia.nextFloat();
			}
			
			media[x] = (n1+n2+n3) / 3;
			
			if(media[x] >= 7 && media[x] <= 10) {
				System.out.println("\nAluno aprovado!!!");
				aprovados++;
			}
			
			else if(media[x] >= 5 && media[x] < 7) {
				System.out.println("\nAluno de exame!!!");
			}
			else {
				System.out.println("\nAluno reprovado!!!");
			}
			
			System.out.println("\nMédia:"+media[x]);
			
			somaMedia += media[x]; // somaMedia = somaMedia + media[x];
		}
		mediaGeral = somaMedia / x;
		
		System.out.println("\nMédia geral: " +mediaGeral);
		System.out.println("\nTivemos: " +aprovados+ " aluno(s) aprovado(s)!!!");

		
	}

}
