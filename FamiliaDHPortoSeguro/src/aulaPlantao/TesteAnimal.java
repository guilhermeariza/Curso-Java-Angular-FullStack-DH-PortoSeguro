package aulaPlantao;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int x = 0;
		
		do {
			System.out.println("\nQual o tipo do seu animal? "
					+ "\n(1) Cachorro"
					+ "\n(2) Cavalo"
					+ "\n(3) Preguiça");
			x = ler.nextInt();
			
			if(x == 1) {
				ler.nextLine();
				
				animal = cachorro;
				
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = ler.nextLine();
				
				System.out.println("\nQual a idade do seu cachorro?");
				int idade = ler.nextInt();
				
				ler.nextLine();
				
				System.out.println("\nQual o som do seu cachorro?");
				String som = ler.nextLine();
				
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Corre();
				
				
			}
			
			else if(x == 2) {
				ler.nextLine();

				animal = cavalo;

				System.out.println("\nQual o nome do seu cavalo");
				String nome = ler.nextLine();
				
				System.out.println("\nQual a idade do seu cavalo?");
				int idade = ler.nextInt();
				
				ler.nextLine();
				
				System.out.println("\nQual o som do seu cavalo?");
				String som = ler.nextLine();
				
				
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Corre();
				
				
				
			}
			
			else if(x == 3) {
				ler.nextLine();

				animal = preguica;

				System.out.println("\nQual o nome da sua preguiça?");
				String nome = ler.nextLine();
				
				System.out.println("\nQual a idade da sua preguiça?");
				int idade = ler.nextInt();
				
				ler.nextLine();
				
				System.out.println("\nQual o som da sua preguiça?");
				String som = ler.nextLine();
				
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.subirArvores();
				
			}
			
			else {
				System.out.println("\nInformação errada! ");

			}

			
		}while(x <=0 || x >= 4);
		

	}

}
