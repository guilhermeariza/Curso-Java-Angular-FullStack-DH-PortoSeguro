package ProjetoAtualizadoGui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executar {
	static Usuario aluno = new Usuario(null, null, null, null, null, null, null);
	static Usuario professor = new Usuario(null, null, null, null, null, null, null);
	
	static Scanner leitor = new Scanner(System.in);
	
	static List<Usuario> alunos = new ArrayList<>();
	static List<Usuario> professores = new ArrayList<>();
	static List<String> alunosAgenda = new ArrayList<>();
	
	static String _nome;
	static String _email;
	static String _telefone;
	
	static boolean telefoneValido;
	static boolean emailValido;
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int op;
		do {
			System.out.println("\nMENU PRINCIPAL");
			System.out.println("1 - ALUNO");
			System.out.println("2 - PROFESSOR");
			System.out.println("3 - EXIBIR ALUNOS E AGENDAMENTOS");
			System.out.println("0 - Sair");
			
			op = leitor.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("\n----> Logando como aluno.....");
				cadastrarUsuarioAluno();
			
				
				break;
			case 2:
				System.out.println("\n----> Logando como professor.....");
				cadastrarUsuarioProfessor();
				
				break;
			case 3:
				Agendar();
				break;
				default: 
					if(op == 0)
					{
						System.out.println("Saindo do sistema. Obrigado(a) por utilizar!");
						leitor.close();
					}
					else
					{
						System.out.println("Opção inválida!");
					}
			}
		}while(op != 0);
		
	}
	
	public static void cadastrarUsuarioAluno() {
		
		Usuario aluno = new Usuario(null, null, null, null, null, null, null);
		leitor.nextLine();
		aluno.setNome(textInput("Nome: "));
		aluno.setCpf(textInput("CPF: "));
		
		aluno.setTelefone(textInput("Telefone: "));
		
		//Validação do telefone do professor
		telefoneValido = false; 
		while(telefoneValido == false) {
			if(aluno.getTelefone().length() >= 8 && aluno.getTelefone().length() <= 11) { 
				System.out.println("Telefone válido!");
				telefoneValido = true;
			}
			else {
				System.out.println("Telefone inválido!");
				telefoneValido = false;
				aluno.setTelefone(textInput("Telefone: "));
	
			}
		}
		
		aluno.setEmail(textInput("Email: "));
		
		//Validação do E-mail do professor
		emailValido = false;
		while(emailValido == false) {
			if(aluno.getEmail().contains("@")) { 
				System.out.println("E-mail válido!");
				emailValido = true;
			}
			else {
				System.out.println("E-mail inválido!");
				emailValido = false;
				aluno.setEmail(textInput("Email: "));
	
			}
		}
		
		
		aluno.setDisciplina(textInput("Disciplina: "));
		aluno.setDisponibilidade(textInput("Disponibilidade: "));

		String op;
		System.out.println("Deseja concluir o cadastro? (s/n)");
		op = leitor.next();

		switch (op) {
		case "s":
			alunos.add(aluno);
			System.out.println("Cadastro adicionado com sucesso!");
			System.out.println("\nEm caso de disponibilidade o(a) professor(a) entrará em contato! Mantenha seus dados atualizados.");
			break;
		case "n":
			System.out.println("Cadastro não finalizado. Retornando ao menu anterior......");
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}
	
	public static void cadastrarUsuarioProfessor() {
		Usuario professor = new Usuario(null, null, null, null, null, null, null);
		leitor.nextLine();
		professor.setNome(textInput("Nome: "));
		professor.setCpf(textInput("CPF: "));
		professor.setTelefone(textInput("Telefone: "));
		
		
		telefoneValido = false;
		
		//Validação do telefone do aluno
		while(telefoneValido == false) {
			if(professor.getTelefone().length() >= 8 && professor.getTelefone().length() <= 11) { 
				System.out.println("Telefone válido!");
				telefoneValido = true;
			}
			else {
				System.out.println("Telefone inválido!");
				telefoneValido = false;
				professor.setTelefone(textInput("Telefone: "));
	
			}
		}
				
		
		professor.setEmail(textInput("Email: "));
		
		//Validação do E-mail do aluno
		emailValido = false;
		while(emailValido == false) {
			if(professor.getEmail().contains("@")) { 
				System.out.println("E-mail válido!");
				emailValido = true;
			}
			else {
				System.out.println("E-mail inválido!");
				emailValido = false;
				professor.setEmail(textInput("Email: "));
	
			}
		}
		
		
		
		
		professor.setDisciplina(textInput("Disciplina: "));
		professor.setDisponibilidade(textInput("Disponibilidade: "));

		String op1;
		System.out.println("Deseja concluir o cadastro? (s/n)");
		op1 = leitor.next();

		switch (op1) {
		case "s":
			professores.add(professor);
			System.out.println("\nCadastro adicionado com sucesso! ");
			break;
		case "n":
			System.out.println("Cadastro não finalizado. Retornando ao menu anterior......");
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}
	
	public static void Agendar() {
		System.out.println("\nAlunos com disponibilidade para o mesmo dia que o(a) professor(a)");
		for(Usuario a: alunos) {
			for(Usuario p: professores) {
				if(a.getDisciplina().equals(p.getDisciplina()) && a.getDisponibilidade().equals(p.getDisponibilidade())) {
					_nome = a.getNome();
					_email = a.getEmail();
					_telefone = a.getTelefone();

					alunosAgenda.add(a.getNome());
				}
			}
	}
		System.out.println("cleaoihsdbfhjsdbfahbdsfojsd");
		System.out.println(alunosAgenda);
		System.out.println("Nome: "+_nome+" Email: "+_email+" Telefone: "+_telefone);
}
	
	public static void ExibirInfoAluno() {
		String nomeAluno;
		System.out.println("\nContato dos alunos");
			for(Usuario a: alunos) {
					System.out.println("Nome: "+a.getNome()+" Email: "+a.getEmail());			
			}
		}
	
	public static String textInput(String label) {
		System.out.println(label);
		return leitor.nextLine();
	}

	
	
}	
	