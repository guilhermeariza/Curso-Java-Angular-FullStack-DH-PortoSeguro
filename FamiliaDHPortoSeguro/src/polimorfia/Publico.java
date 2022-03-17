package polimorfia;

public class Publico extends Telefone{
	
	public Publico() {
		super("Telefone p�blico");
	}
	
	
	@Override
	public void toca(int numToques) {
		
		for(int i = 0; i < numToques; i++) {
			System.out.println("\nTrimtrimtrim...trimtrimtrim");

		}
		
		
	}
	
	@Override
	public void disca(String numero) {
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("\nEsse n�mero n�o liga para celular!!!");
		}
		else {
			System.out.println("\nDiscando: "+numero);

		}
			
	}
	
}
