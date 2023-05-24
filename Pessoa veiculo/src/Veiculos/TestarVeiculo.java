package Veiculos;

import java.util.ArrayList;
import java.util.List;

public class TestarVeiculo {
	public static List<Carro> carros = new ArrayList<>();
	public static List<Moto> motos = new ArrayList<>();

	static {
		carros.add(new Carro("ADD223", 50, 10000, false, 100, 150));
		carros.add(new Carro("DEF456", 40, 20000, true, 120, 200));
		carros.add(new Carro("GII789", 60, 30000, false, 90, 180));
		carros.add(new Carro("JLK012", 30, 40000, true, 110, 160));
		carros.add(new Carro("ZNN556", 70, 50000, false, 80, 140));

		motos.add(new Moto("LCP896", 20, 15000, true, 80, 500));
		motos.add(new Moto("TUS152", 15, 25000, false, 70, 600));
		motos.add(new Moto("PRL663", 25, 35000, true, 90, 400));
		motos.add(new Moto("YZA567", 10, 45000, false, 60, 550));
		motos.add(new Moto("BCD890", 30, 55000, true, 100, 450));
	}

}
