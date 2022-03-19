package validaCPF;

public class ValidarCPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cpf cpf = new Cpf();
		
		try {
			cpf.recebeCpf();
			cpf.calcPrimeiroDigito();
			cpf.calcSegundoDigito();
			cpf.validaCpf();

		}
		catch(Error e) {
			System.out.println(e);
		}

	}

}
