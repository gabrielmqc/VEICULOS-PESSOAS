package fag;

import java.util.List;
import java.util.Scanner;

import Pessoas.PessoaFisica;
import Pessoas.PessoaJuridica;
import Pessoas.TestarPessoa;
import Veiculos.Carro;
import Veiculos.Moto;
import Veiculos.TestarVeiculo;

public class TesteInterligado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<PessoaFisica> pessoasFisicas = TestarPessoa.pessoasFisicas;
		List<PessoaJuridica> pessoasJuridicas = TestarPessoa.pessoasJuridicas;
		List<Carro> carros = TestarVeiculo.carros;
		List<Moto> motos = TestarVeiculo.motos;

		while (true) {
			exibirMenuPrincipal();
			int opcaoPrincipal = scanner.nextInt();
			scanner.nextLine();

			switch (opcaoPrincipal) {
			case 1:
				alugarVeiculo(scanner, pessoasFisicas, pessoasJuridicas, carros, motos);
				break;
			case 2:
				adicionarNovoItem(scanner, carros, motos);
				break;
			case 3:
				System.out.println("Encerrando o programa...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

	private static void exibirMenuPrincipal() {
		System.out.println("===== MENU PRINCIPAL =====");
		System.out.println("1. Alugar veículo");
		System.out.println("2. Adicionar novo item");
		System.out.println("3. Encerrar programa");
		System.out.println("Selecione uma opção: ");
	}

	private static void alugarVeiculo(Scanner scanner, List<PessoaFisica> pessoasFisicas,
			List<PessoaJuridica> pessoasJuridicas, List<Carro> carros, List<Moto> motos) {
		System.out.println("Escolha o tipo de pessoa:");
		System.out.println("1. Pessoa Física");
		System.out.println("2. Pessoa Jurídica");
		int tipoPessoa = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Escolha o tipo de veículo:");
		System.out.println("1. Carro");
		System.out.println("2. Moto");
		int tipoVeiculo = scanner.nextInt();
		scanner.nextLine();

		if (tipoPessoa == 1) {
			System.out.println("Lista de pessoas físicas disponíveis:");
			for (int i = 0; i < pessoasFisicas.size(); i++) {
				System.out.println(i + 1 + ". " + pessoasFisicas.get(i).getNome());
			}
		} else if (tipoPessoa == 2) {
			System.out.println("Lista de pessoas jurídicas disponíveis:");
			for (int i = 0; i < pessoasJuridicas.size(); i++) {
				System.out.println(i + 1 + ". " + pessoasJuridicas.get(i).getNome());
			}
		} else {
			System.out.println("Opção inválida. Selecione 1 para Pessoa Física ou 2 para Pessoa Jurídica.");
			return;
		}

		if (tipoVeiculo == 1) {
			System.out.println("Lista de carros disponíveis:");
			for (int i = 0; i < carros.size(); i++) {
				System.out.println(i + 1 + ". " + carros.get(i).getPlaca());
				System.out.println(i + 1 + "Preco da diaria: " + carros.get(i).getPrecoDiaria());
				System.out.println(i + 1 + "Esta alugado?: " + carros.get(i).isAlugado());

			}
		} else if (tipoVeiculo == 2) {
			System.out.println("Lista de motos disponíveis:");
			for (int i = 0; i < motos.size(); i++) {
				System.out.println(i + 1 + ". " + motos.get(i).getPlaca());
				System.out.println(i + 1 + "Preco da diaria: " + motos.get(i).getPrecoDiaria());
				System.out.println(i + 1 + "Está Alugado? : " + motos.get(i).isAlugado());

			}
		} else {
			System.out.println("Opção inválida. Selecione 1 para Carro ou 2 para Moto.");
			return;
		}

		System.out.println("Selecione o número da pessoa que deseja alugar um veículo:");
		int pessoaIndex = scanner.nextInt() - 1;
		scanner.nextLine();

		System.out.println("Selecione o número do veículo que deseja alugar:");
		int veiculoIndex = scanner.nextInt() - 1;
		scanner.nextLine();

		if (tipoPessoa == 1 && pessoaIndex >= 0 && pessoaIndex < pessoasFisicas.size()) {
			PessoaFisica pessoa = pessoasFisicas.get(pessoaIndex);
			System.out.println("Informações da pessoa selecionada:");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("Endereco: " + pessoa.getEndereco());
			System.out.println("Telefone" + ": " + pessoa.getTelefone());

		} else if (tipoPessoa == 2 && pessoaIndex >= 0 && pessoaIndex < pessoasJuridicas.size()) {
			PessoaJuridica pessoa = pessoasJuridicas.get(pessoaIndex);
			System.out.println("Informações da pessoa selecionada:");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CNPJ: " + pessoa.getCnpj());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Endereco: " + pessoa.getEndereco());
		} else {
			System.out.println("Seleção inválida. Verifique o número da pessoa selecionada.");
			return;
		}

		if (tipoVeiculo == 1 && veiculoIndex >= 0 && veiculoIndex < carros.size()) {
			Carro carro = carros.get(veiculoIndex);
			System.out.println("Informações do veículo selecionado:");
			System.out.println("Placa: " + carro.getPlaca());
			System.out.println("Combustivel: " + carro.getCombustivelNoTanque());
			System.out.println("Potencia Motor" + carro.getPotenciaDoMotor());
			System.out.println("Quilometragem : " + carro.getQuilometragem());
			System.out.println("Alugado : " + carro.isAlugado());
			System.out.println("Preco Diaria: " + carro.getPrecoDiaria());
		} else if (tipoVeiculo == 2 && veiculoIndex >= 0 && veiculoIndex < motos.size()) {
			Moto moto = motos.get(veiculoIndex);
			System.out.println("Informações do veículo selecionado:");
			System.out.println("Placa: " + moto.getPlaca());
			System.out.println("Combustivel: " + moto.getCombustivelNoTanque());
			System.out.println("Cilindradas: " + moto.getCilindradas());
			System.out.println("Quilometragem: " + moto.getQuilometragem());
			System.out.println("Alugado : " + moto.isAlugado());
			System.out.println("Preco Diaria: " + moto.getPrecoDiaria());

		} else {
			System.out.println("Seleção inválida. Verifique o número do veículo selecionado.");
			return;
		}

		if (pessoaIndex >= 0 && pessoaIndex < (pessoasFisicas.size() + pessoasJuridicas.size()) && veiculoIndex >= 0
				&& veiculoIndex < (carros.size() + motos.size())) {
			if (pessoaIndex < pessoasFisicas.size()) {
				PessoaFisica pessoa = pessoasFisicas.get(pessoaIndex);
				if (veiculoIndex < carros.size()) {
					Carro carro = carros.get(veiculoIndex);
					if (!carro.isAlugado()) {
						carro.setAlugado(true);
						System.out.println(pessoa.getNome() + " alugou o carro de placa " + carro.getPlaca());
						System.out.println("Deseja abastecer o veículo? (S/N):");
						String abastecerOpcao = scanner.nextLine();
						if (abastecerOpcao.equalsIgnoreCase("S")) {
							System.out.println("Digite a quantidade de litros a abastecer:");
							double quantidadeLitros = scanner.nextDouble();
							scanner.nextLine();
							carro.abastecer(quantidadeLitros);
						}
						System.out.println("Deseja realizar uma viagem? (S/N):");
						String viajarOpcao = scanner.nextLine();
						if (viajarOpcao.equalsIgnoreCase("S")) {
							System.out.println("Digite a distância da viagem em quilômetros:");
							double distanciaViagem = scanner.nextDouble();
							scanner.nextLine();
							if (carro.viajar(distanciaViagem)) {
								System.out.println("Viagem realizada com sucesso!");
								System.out.println(
										"Restante de combustível no tanque: " + carro.getCombustivelNoTanque());
								System.out.println("Quilometragem atualizada: " + carro.getQuilometragem());
							} else {
								System.out.println("Não há combustível suficiente para a viagem.");
							}
						}
					} else {
						System.out.println("O carro de placa " + carro.getPlaca() + " já está alugado.");
					}
				} else {
					Moto moto = motos.get(veiculoIndex - carros.size());
					if (!moto.isAlugado()) {
						moto.setAlugado(true);
						System.out.println(pessoa.getNome() + " alugou a moto de placa " + moto.getPlaca());
						System.out.println("Deseja abastecer o veículo? (S/N):");
						String abastecerOpcao = scanner.nextLine();
						if (abastecerOpcao.equalsIgnoreCase("S")) {
							System.out.println("Digite a quantidade de litros a abastecer:");
							double quantidadeLitros = scanner.nextDouble();
							scanner.nextLine();
							moto.abastecer(quantidadeLitros);
						}
						System.out.println("Deseja realizar uma viagem? (S/N):");
						String viajarOpcao = scanner.nextLine();
						if (viajarOpcao.equalsIgnoreCase("S")) {
							System.out.println("Digite a distância da viagem em quilômetros:");
							double distanciaViagem = scanner.nextDouble();
							scanner.nextLine();
							if (moto.viajar(distanciaViagem)) {
								System.out.println("Viagem realizada com sucesso!");
								System.out
										.println("Restante de combustível no tanque: " + moto.getCombustivelNoTanque());
								System.out.println("Quilometragem atualizada: " + moto.getQuilometragem());
							} else {
								System.out.println("Não há combustível suficiente para a viagem.");
							}
						}
					} else {
						System.out.println("A moto de placa " + moto.getPlaca() + " já está alugada.");
					}
				}
			}
		} else {
			System.out.println("Seleção inválida. Verifique os números informados.");
		}

	}

	private static void adicionarNovoItem(Scanner scanner, List<Carro> carros, List<Moto> motos) {
		System.out.println("===== ADICIONAR NOVO ITEM =====");
		System.out.println("Selecione o tipo de item:");
		System.out.println("1. Pessoa Física");
		System.out.println("2. Pessoa Jurídica");
		System.out.println("3. Carro");
		System.out.println("4. Moto");
		System.out.println("5. Voltar para o menu principal");
		System.out.println("Selecione uma opção: ");
		int opcaoAdicionarItem = scanner.nextInt();
		scanner.nextLine();

		switch (opcaoAdicionarItem) {
		case 1:
			adicionarPessoaFisica(scanner);
			break;
		case 2:
			adicionarPessoaJuridica(scanner);
			break;
		case 3:
			adicionarCarro(scanner, carros);
			break;
		case 4:
			adicionarMoto(scanner);
			break;
		case 5:
			System.out.println("Voltando para o menu principal...");
			break;
		default:
			System.out.println("Opção inválida. Tente novamente.");
		}
	}

	private static void adicionarPessoaFisica(Scanner scanner) {
		System.out.println("===== ADICIONAR NOVA PESSOA FÍSICA =====");
		System.out.println("Digite o nome da pessoa física:");
		String nome = scanner.nextLine();
		System.out.println("Digite o CPF da pessoa física:");
		String cpf = scanner.nextLine();
		System.out.println("Digite o endereço da pessoa física:");
		String endereco = scanner.nextLine();
		System.out.println("Digite o telefone da pessoa física:");
		String telefone = scanner.nextLine();

		PessoaFisica pessoaFisica = new PessoaFisica(nome, telefone, endereco, cpf);
		TestarPessoa.pessoasFisicas.add(pessoaFisica);
		System.out.println("Pessoa física adicionada com sucesso!");
	}

	private static void adicionarPessoaJuridica(Scanner scanner) {
		System.out.println("===== ADICIONAR NOVA PESSOA JURÍDICA =====");
		System.out.println("Digite a razão social da pessoa jurídica:");
		String nome = scanner.nextLine();
		System.out.println("Digite o CNPJ da pessoa jurídica:");
		String cnpj = scanner.nextLine();
		System.out.println("Digite o endereço da pessoa jurídica:");
		String endereco = scanner.nextLine();
		System.out.println("Digite o telefone da pessoa jurídica:");
		String telefone = scanner.nextLine();

		PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, telefone, endereco, cnpj);
		TestarPessoa.pessoasJuridicas.add(pessoaJuridica);
		System.out.println("Pessoa jurídica adicionada com sucesso!");
	}

	private static void adicionarCarro(Scanner scanner, List<Carro> carros) {
		System.out.println("===== ADICIONAR NOVO CARRO =====");
		System.out.println("Digite a placa do carro:");
		String placa = scanner.nextLine();
		for (Carro carro : carros) {
			if (carro.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("A placa " + placa + " já está cadastrada.");
				return;
			}
		}
		System.out.println("Digite o combustivel do carro:");
		double combustivelNoTanque = scanner.nextDouble();
		System.out.println("Digite a quilometragem do carro:");
		int quilometragem = scanner.nextInt();
		System.out.println("Alugado?:");
		boolean alugado = scanner.nextBoolean();
		System.out.println("Digite o valor da diaria do carro:");
		double precoDiaria = scanner.nextDouble();
		System.out.println("Digite a potência do motor do carro:");
		int potenciaDoMotor = scanner.nextInt();
		scanner.nextLine();

		Carro carro = new Carro(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria, potenciaDoMotor);
		TestarVeiculo.carros.add(carro);
		System.out.println("Carro adicionado com sucesso!");
	}

	private static void adicionarMoto(Scanner scanner) {
		System.out.println("===== ADICIONAR NOVA MOTO =====");
		System.out.println("Digite a placa da moto:");
		String placa = scanner.nextLine();
		System.out.println("Digite o combustivel da moto:");
		double combustivelNoTanque = scanner.nextDouble();
		System.out.println("Digite a quilometragem da moto:");
		int quilometragem = scanner.nextInt();
		System.out.println("Alugado?:");
		boolean alugado = scanner.nextBoolean();
		System.out.println("Digite o valor da diaria da moto:");
		double precoDiaria = scanner.nextDouble();
		System.out.println("Digite as cilindradas da moto:");
		int cilindradas = scanner.nextInt();
		scanner.nextLine();

		Moto moto = new Moto(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria, cilindradas);
		TestarVeiculo.motos.add(moto);
		System.out.println("Moto adicionada com sucesso!");
	}
}
