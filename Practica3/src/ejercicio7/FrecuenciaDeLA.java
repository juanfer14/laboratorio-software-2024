package ejercicio7;

public enum FrecuenciaDeLA {
	ISO16(440),
	AFI_CAMARA(444),
	RENACIMIENTO(446),
	BACH(480);
	
	private int frecuencia;
	FrecuenciaDeLA(int frecuencia) {
		this.frecuencia=frecuencia;
	}
	public int frecuencia() {
		return frecuencia;
	}
}
