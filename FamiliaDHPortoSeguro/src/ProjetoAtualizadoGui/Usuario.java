package ProjetoAtualizadoGui;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	List<Usuario> alunos = new ArrayList<>();
	List<Usuario> professores = new ArrayList<>();
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String serie;
	private String disciplina;
	private String disponibilidade;
	

	public Usuario(String nome, String cpf, String telefone, String email, String serie, String disciplina, String disponibilidade) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.serie = serie;
		this.disciplina = disciplina;
		this.disponibilidade = disponibilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Usuario) {

			return (getDisciplina() == ((Usuario) obj).getDisciplina());

		} else {
			return false;

		}
	}

	

}
