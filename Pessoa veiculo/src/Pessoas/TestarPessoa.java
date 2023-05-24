package Pessoas;

import java.util.ArrayList;
import java.util.List;

public class TestarPessoa {
	public static List<PessoaFisica> pessoasFisicas = new ArrayList<>();
    public static List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();

    public static void cadastrarPessoaFisica(String nome, String telefone, String endereco, String cpf) {
        PessoaFisica pessoaFisica = new PessoaFisica(nome, telefone, endereco, cpf);
        pessoasFisicas.add(pessoaFisica);
    }

    public static void cadastrarPessoaJuridica(String nome, String telefone, String endereco, String cnpj) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, telefone, endereco, cnpj);
        pessoasJuridicas.add(pessoaJuridica);
    }
    static {
        pessoasFisicas.add(new PessoaFisica("João", "123456789", "Rua A", "123456789"));
        pessoasFisicas.add(new PessoaFisica("Maria", "987654321", "Rua B", "987654321"));
        pessoasFisicas.add(new PessoaFisica("Pedro", "111222333", "Rua C", "111222333"));
        pessoasFisicas.add(new PessoaFisica("Ana", "444555666", "Rua D", "444555666"));
        pessoasFisicas.add(new PessoaFisica("Lucas", "777888999", "Rua E", "777888999"));
        
        pessoasJuridicas.add(new PessoaJuridica("Empresa A", "9876543210", "Rua X, 456", "12.345.678/0001-01"));
        pessoasJuridicas.add(new PessoaJuridica("Empresa B", "0123456789", "Rua Y, 789", "23.456.789/0001-02"));
        pessoasJuridicas.add(new PessoaJuridica("Empresa C", "4567890123", "Rua Z, 012", "34.567.890/0001-03"));
        pessoasJuridicas.add(new PessoaJuridica("Empresa D", "9012345678", "Av. Principal, 345", "45.678.901/0001-04"));
        pessoasJuridicas.add(new PessoaJuridica("Empresa E", "3456789012", "Av. Secundária, 678", "56.789.012/0001-05"));
    }

		
}
