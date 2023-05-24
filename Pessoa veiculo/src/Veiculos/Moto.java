package Veiculos;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(String placa, double combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria, int cilindradas) {
		super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public boolean viajar(double distancia) {
		double consumo = distancia / 30.0;
		if (getCombustivelNoTanque() >= consumo) {
			setCombustivelNoTanque(getCombustivelNoTanque() - consumo);
			setQuilometragem(getQuilometragem() + (int) distancia);
			return true;
		} else {
			return false;
		}
	}

}
