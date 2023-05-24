package Pessoas;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa Física - Nome: " + getNome() + ", CPF: " + cpf + ", Telefone: " + getTelefone() + ", Endereço: "
				+ getEndereco();
	}
}
