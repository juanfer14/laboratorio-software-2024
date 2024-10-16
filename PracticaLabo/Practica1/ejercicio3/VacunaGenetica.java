package ejercicio3;

import ejercicio1.Vacuna;

public class VacunaGenetica extends Vacuna {
	private double minima;
	private double maxima;
	
	public VacunaGenetica(double minima, double maxima) {
		super();
		this.minima = minima;
		this.maxima = maxima;
	}

	public double getMinima() {
		return minima;
	}

	public void setMinima(double minima) {
		this.minima = minima;
	}

	public double getMaxima() {
		return maxima;
	}

	public void setMaxima(double maxima) {
		this.maxima = maxima;
	}
	
	
}
