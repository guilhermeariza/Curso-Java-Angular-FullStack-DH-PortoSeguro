package validaCPF;

import java.util.Scanner;

public class Cpf {

	private Scanner ler = new Scanner(System.in);
	private String cpfDigitado = "";
	private String cpfCorreto = "";

	private int soma = 0;

	private int primeiroDigito =0;
	private int segundoDigito = 0;
	
	private boolean cpfValido;

	public void recebeCpf() {
		System.out.println("Digite seu CPF (apenas os números): ");
		cpfDigitado = ler.nextLine();
	}

	public void calcPrimeiroDigito() {
		// Zera a váziavel que receberá a soma da multiplicação dos valores
		soma = 0;
			                                         
	    /* Faz a soma dos valores do cpf, multiplicados pelo cpf,
		   na ordem digitada até chegar a 2 com o ultimo digito,
		  que será o nono digito do cpf */
		int i = 0, j = 10;
		while (i < 9) {
			
			/* Quebra a String do cpf calcula separadamente
			cada numero até chegar ao nono número*/
			soma += (Integer.parseInt((cpfDigitado.charAt(i) + "")) *j);
			i++;
			j--;

		}
		
		soma = soma * 10;
		
		primeiroDigito = (soma % 11);

		if(primeiroDigito > 9) {
			primeiroDigito = 0;
		}
		
		cpfCorreto = cpfDigitado.substring(0,9) + primeiroDigito;
	}
	
	public void calcSegundoDigito() {
		soma = 0;
			                                         
	    /* Faz a soma dos valores do cpf, multiplicados pelo cpf,
		   na ordem digitada até chegar a 2 com o ultimo digito,
		  que será o décimo digito do cpf */
		int i = 0, j = 11;
		while (i < 10) {
			
			/* Quebra a String do cpf calcula separadamente
			cada numero até chegar ao nono número*/
			soma += (Integer.parseInt((cpfCorreto.charAt(i) + "")) *j);
			i++;
			j--;

		}
		
		segundoDigito = (soma % 11);
		
		segundoDigito = (11 - segundoDigito);
		
		if(segundoDigito > 9) {
			segundoDigito = 0;
		}
		
		cpfCorreto += segundoDigito;
	}
	
	
	public void validaCpf () { // faz a validação do CPF literalmente		
		
		cpfValido = false;
		while(cpfValido == false) {
		
			if(cpfDigitado.equals("00000000000") || 
					cpfDigitado.equals("11111111111") ||
					cpfDigitado.equals("22222222222") ||
					cpfDigitado.equals("33333333333") ||
					cpfDigitado.equals("44444444444") ||
					cpfDigitado.equals("55555555555") ||
					cpfDigitado.equals("66666666666") ||
					cpfDigitado.equals("77777777777") ||
					cpfDigitado.equals("88888888888") ||
					cpfDigitado.equals("99999999999")) {
						
				System.out.println("\nO cpf digitado: "+ cpfDigitado.substring (0, 9)
	    				+ cpfDigitado.substring (9, 11) + " é INVÁLIDO!!!");
				cpfValido = false;
				recebeCpf();
			}
			
			else if(cpfDigitado.equals (cpfCorreto)) {
				System.out.println("\nO CPF: " + cpfCorreto.substring (0, 9)
	            		+ cpfCorreto.substring (9, 11) + " está CORRETO!!");
				cpfValido = true;
			}
			
		    else {
		    	System.out.println("\nO cpf digitado: "+ cpfDigitado.substring (0, 9)
		        		+ cpfDigitado.substring (9, 11) + " é INVÁLIDO!!");
		    	cpfValido = false;
				recebeCpf();
	
		    }
			
		}
    
    }
	
}
