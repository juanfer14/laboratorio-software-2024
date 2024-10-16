package ejercicio7;

public class TestPiano {
	public static void main(String [] args) {
		Piano p = new Piano();
		p.afinar(FrecuenciaDeLA.AFI_CAMARA);
		p.hacerSonar(Notas.A, 2);
		p.hacerSonar(Notas.C, 4);
	}
}
