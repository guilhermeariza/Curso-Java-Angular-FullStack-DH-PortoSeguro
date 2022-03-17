package aulaPlantao;

public class Preguica extends Animal{

	public Preguica() {
		super("Animal: Preguiça");
	}
	
	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("\nNome do preguiça: "+nomeAnimal);
	}
	
	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("\nIdade do preguiça: "+idadeAnimal);
	}
	
	@Override
	public void Som(String somAnimal) {
		System.out.println("\nSom do preguiça: "+somAnimal);
	}
	
	public void subirArvores() {
		System.out.println("\nUma das característacas da preguiça é subir em árvores ");
	}
	
}
