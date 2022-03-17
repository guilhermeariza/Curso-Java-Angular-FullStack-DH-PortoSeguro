package interfacesEHerancaMultipla;

import java.util.Scanner;

public class TesteFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner leia = new Scanner(System.in);
		
		Quadrado fig1 = new Quadrado(10, "Quadrado");
		Retangulo fig2 = new Retangulo(3,4,"Retangulo");
		Triangulo fig3 = new Triangulo(2, 2, "Triangulo");
		
		System.out.println("Diagonal do "+fig1.getNome()+" : " + fig1.getDiagonal());
		System.out.println("Área do "+fig1.getNome()+" : " + fig1.getArea());
		System.out.println("Peímetro do "+fig1.getNome()+" : " + fig1.getPerimetro());

		System.out.println("\nDiagonal do "+fig2.getNome()+" : " + fig2.getDiagonal());
		System.out.println("Área do "+fig2.getNome()+" : " + fig2.getArea());
		System.out.println("Peímetro do "+fig2.getNome()+" : " + fig2.getPerimetro());
		
		System.out.println("Área do "+fig3.getNome()+" : " + fig3.getArea());		
		
	}

}
