package interfacesEHerancaMultipla;

public class Triangulo extends BaseFigura implements Figuras{

	Triangulo(double base, double altura, String nome){
		super(base, altura, nome);
		nomeClasse = "Triangulo";
	}
	
	@Override
	public double getArea() {
		return (lado1 * lado2)/2;
	}	
	
}
