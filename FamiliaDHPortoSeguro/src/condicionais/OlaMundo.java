package condicionais;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		String nome;
		int idade, x, y;
		double altura, nota1, nota2, nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá Mundo!!!");
		
		/*System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine(); //Estou pegando a entrada do meu usuário em string
		System.out.println("\n\t\tEntre com a sua altura: ");
		altura = leia.nextFloat(); //Estou pegando a entrada do meu usuário em float 
		System.out.println("\n\t\tEntre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nMeu nome é: "+nome+" eu tenho: "+idade+" ano(s) e a minha altura é "+altura);*/
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media>=7 && media<=10) {
			System.out.println("\nAluno Aprovado!!!"); 
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAluno de exame!!!");
		}
		else if(media>=0 && media<5) {
			System.out.println("\nAluno reprovado!!!");
		}
		else {
			System.out.println("\nMédia invalida!!!");
		}
		
		System.out.printf("\nMédia aritmética: %2.2f", media);
		
		/*
		nota1 = Math.sqrt(nota2); //raiz quadrada
		nota2 = Math.pow(nota3, 3); //potência
		
		System.out.println("\nEntre com o valor de x: ");
		x = leia.nextInt();
		System.out.println("\nEntre com o valor de y: ");
		y = leia.nextInt();

		x = x % y; //calcula o resto da divisão de dois números inteiros
		*/
		
	}
	
}
