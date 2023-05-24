package Veiculos;

public class Carro extends Veiculo {

	private int potenciaDoMotor;

	public Carro(String placa, double combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria, int potenciaDoMotor) {
		super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
		this.potenciaDoMotor = potenciaDoMotor;
	}

	public int getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setPotenciaDoMotor(int potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}

	@Override
	public boolean viajar(double distancia) {
		double consumo = distancia / 10.0;
		if (getCombustivelNoTanque() >= consumo) {
			setCombustivelNoTanque(getCombustivelNoTanque() - consumo);
			setQuilometragem(getQuilometragem() + (int) distancia);
			return true;
		} else {
			return false;
		}
	}
}
