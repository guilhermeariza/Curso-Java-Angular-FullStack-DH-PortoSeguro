package aulaPlantao;

public abstract class Animal {

	private String tipoAnimalString;
	
	public Animal(String tipoAnimal) {
		this.tipoAnimalString = tipoAnimal;
	
	}
	
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);
	abstract public void Som(String somAnimal);

	public String getTipoAnimalString() {
		return tipoAnimalString;
	}

	public void setTipoAnimalString(String tipoAnimalString) {
		this.tipoAnimalString = tipoAnimalString;
	}
	
	

	
}
