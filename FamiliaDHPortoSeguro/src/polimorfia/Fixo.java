package polimorfia;

public class Fixo extends Telefone{
	
	public Fixo() {
		super("Telefone fixo");
	}
	
	public void toca(int numToques) {
		for(int i = 0; i < numToques; i++) {
			System.out.println("\nTrimmmmm...trimmmmmm");

		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: "+numero);

	}
	
}
