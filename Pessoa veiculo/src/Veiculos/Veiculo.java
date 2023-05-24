package Veiculos;

public abstract class Veiculo {

	private String placa;
	private double combustivelNoTanque;
	private int quilometragem;
	private boolean alugado;
	private double precoDiaria;

	public Veiculo(String placa, double combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria) {
		this.placa = placa;
		this.combustivelNoTanque = combustivelNoTanque;
		this.quilometragem = quilometragem;
		this.alugado = alugado;
		this.precoDiaria = precoDiaria;
	}
	// get e set

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getCombustivelNoTanque() {
		return combustivelNoTanque;
	}

	public void setCombustivelNoTanque(double combustivelNoTanque) {
		this.combustivelNoTanque = combustivelNoTanque;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public void abastecer(double quantidade) {
		combustivelNoTanque += quantidade;
	}

	public boolean viajar(double distancia) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Veiculo other = (Veiculo) obj;
		return placa.equals(other.placa);
	}

}
