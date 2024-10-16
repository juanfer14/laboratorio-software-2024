package ejercicio7;

public class Piano implements InstrumentoMusical{

	@Override
	public void hacerSonar() {
		// TODO Auto-generated method stub
		System.out.println("Suena Piano");
	}

	@Override
	public void hacerSonar(Notas n, int duracion) {
		// TODO Auto-generated method stub
		System.out.println("Sonando " + n.nota() + ": " + duracion);
	}

	@Override
	public String queEs() {
		// TODO Auto-generated method stub
		return "Piano";
	}

	

	@Override
	public void afinar(FrecuenciaDeLA f) {
		// TODO Auto-generated method stub
		System.out.println("Afinando Piano a " + f.frecuencia());
	}

}
