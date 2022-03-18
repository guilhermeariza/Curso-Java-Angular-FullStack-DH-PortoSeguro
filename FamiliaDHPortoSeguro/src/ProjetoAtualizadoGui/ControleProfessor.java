package ProjetoAtualizadoGui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleProfessor implements Interface{

	private static final String String = null;
	Scanner leitor = new Scanner(System.in);
	List<Usuario> professores = new ArrayList<>();
	
	@Override
	public void cadastrarUsuario() {
		Usuario professor = new Usuario(null, null, null, null, null, null, null);
		leitor.nextLine();
		professor.setNome(textInput("Nome: "));
		professor.setCpf(textInput("CPF: "));
		professor.setTelefone(textInput("Telefone: "));
		professor.setEmail(textInput("Email: "));
		//professor.setSenha(textInput("Senha: "));
		professor.setDisciplina(textInput("Disciplina: "));
		professor.setDisponibilidade(textInput("Disponibilidade: "));

		String op;
		System.out.println("Deseja concluir o cadastro? (s/n)");
		op = leitor.next();

		switch (op) {
		case "s":
			professores.add(professor);
			System.out.println("Cadastro adicionado com sucesso!");
			break;
		case "n":
			System.out.println("Cadastro não finalizado. Retornando ao menu anterior......");
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}
	
	@Override
	public void exibirCadastro() {
		if (professores.size() == 0) {
			System.out.println("Não existem cadastros no sistema.");
		} else {
			for (int i = 0; i < professores.size(); i++) {
				Usuario professor = professores.get(i);
				System.out.println("\nCadastro " + i);
				System.out.println("Nome: " + professor.getNome());
				System.out.println("CPF: " + professor.getCpf());
				System.out.println("Telefone: " + professor.getTelefone());
				System.out.println("Email: " + professor.getEmail());
				//System.out.println("Senha: " + professor.getSenha());
				System.out.println("Disciplina: " + professor.getDisciplina());
				System.out.println("Disponibilidade: " + professor.getDisponibilidade());
			}
		}
		System.out.println("\nFim da lista");
	}
	
	public String textInput(String label) {
		System.out.println(label);
		return leitor.nextLine();
	}

}
