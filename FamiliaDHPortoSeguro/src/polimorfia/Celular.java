package polimorfia;

public class Celular extends Telefone{

	
	public Celular() {
		super("Telefone Celular");
	}
	
	@Override
	public void toca(int codigoToque) {
		switch(codigoToque) {
		
		case 1:
			System.out.println("\nShalamar.shamalar");
			break;
		case 2:
			System.out.println("\nTananinana");
			break;
		default:
			System.out.println("\nTa...tanana...tanana");
			break;

		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: " +numero+ " é um celular");
	}
	
}
