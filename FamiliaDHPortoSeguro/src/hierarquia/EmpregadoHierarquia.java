package hierarquia;

public class EmpregadoHierarquia extends PessoaHierarquia{

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public EmpregadoHierarquia(String nome, String endereco, String cpf, int telefone, 
			int idade, int codigoSetor, float salarioBase, float imposto) {
		
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: " +getCpf()+"\nTelefone: " +getTelefone()+ 
				"\nIdade: "+getIdade()+ "\nEndere�o: "+getEndereco()+ "\nC�digo do setor: " +getCodigoSetor()+ 
				"\nValor em porcentagem (sem o %) de imposto a ser retido do sal�rio: " +getSalarioBase());
	}
	
	public void calcularSalario() {
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO sal�rio total a ser recebido pelo empregado: " +getNome()+" � igual a " +salarioLiquido);
	}
	
}
