package ProjetoAtualizadoGui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleAluno implements Interface{
	Scanner leitor = new Scanner(System.in);
	List<Usuario> alunos = new ArrayList<>();
	
	
	@Override
	public void cadastrarUsuario() {
		Usuario aluno = new Usuario(null, null, null, null, null, null, null);
		leitor.nextLine();
		aluno.setNome(textInput("Nome: "));
		aluno.setCpf(textInput("CPF: "));
		aluno.setTelefone(textInput("Telefone: "));
		aluno.setEmail(textInput("Email: "));
		//aluno.setSenha(textInput("Senha: "));
		aluno.setDisciplina(textInput("Disciplina: "));
		aluno.setDisponibilidade(textInput("Disponibilidade: "));

		String op;
		System.out.println("Deseja concluir o cadastro? (s/n)");
		op = leitor.next();

		switch (op) {
		case "s":
			alunos.add(aluno);
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
		if (alunos.size() == 0) {
			System.out.println("Não existem cadastros no sistema.");
		} else {
			for (int i = 0; i < alunos.size(); i++) {
				Usuario aluno = alunos.get(i);
				System.out.println("\nCadastro " + i);
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("CPF: " + aluno.getCpf());
				System.out.println("Telefone: " + aluno.getTelefone());
				System.out.println("Email: " + aluno.getEmail());
				//System.out.println("Senha: " + aluno.getSenha());
				System.out.println("Disciplina: " + aluno.getDisciplina());
				System.out.println("Disponibilidade: " + aluno.getDisponibilidade());
			}
		}
		System.out.println("\nFim da lista");
	}

	public String textInput(String label) {
		System.out.println(label);
		return leitor.nextLine();
	}
}
