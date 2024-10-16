package ejercicio3;

import ejercicio1.Vacuna;

public class VacunaSubunidadAntigenica extends Vacuna{
	private int antigenos;
	private String tipo;
	
	public VacunaSubunidadAntigenica(int antigenos, String tipo) {
		super();
		this.antigenos = antigenos;
		this.tipo = tipo;
	}

	public int getAntigenos() {
		return antigenos;
	}

	public void setAntigenos(int antigenos) {
		this.antigenos = antigenos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
