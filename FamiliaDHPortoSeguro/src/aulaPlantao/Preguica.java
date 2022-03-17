package aulaPlantao;

public class Preguica extends Animal{

	public Preguica() {
		super("Animal: Pregui�a");
	}
	
	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("\nNome do pregui�a: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("\nIdade do pregui�a: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nSom do pregui�a: "+somAnimal);
	}
	
	public void subirArvores() {
		System.out.println("\nUma das caracter�stacas da pregui�a � subir em �rvores ");
	}
	
}
