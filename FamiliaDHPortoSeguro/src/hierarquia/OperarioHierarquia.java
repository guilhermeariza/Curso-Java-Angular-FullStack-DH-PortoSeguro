package hierarquia;

public class OperarioHierarquia extends PessoaHierarquia {
	
	private double valorProducao;
	private double comissao;
	
	public OperarioHierarquia(String nome, String endereco, String cpf, int telefone, 
			int idade, double valorproducao, double comissao) {
		
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
		
	public void imprimirInfo() {
		System.out.println("\n Nome do oper�rio: "+getNome()+"\nCPF: " +getCpf()+"\n Telefone: " +getTelefone()+ 
				"\nIdade: "+getIdade()+ "\nEndere�o: "+getEndereco()+"\nValor monet�rio dos artidos produzidos: "+valorProducao+
				"\nPorcentagem (sem o %) da comiss�o deste artigo:" +comissao);
	}
		
	public void calcularProducao() {
		double valorTotal = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("\nO valor total a ser recebido pelo oper�rio:  "+getNome()+" ser� de :"+valorTotal);
	}
	
}
