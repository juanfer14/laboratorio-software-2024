package ejercicio7;

public enum Fito {
	PIANO;
	Piano p;
	Fito(){
		p = new Piano();
	}
	public void tocar(Object [][] notasTiempo) {
		for(Object[] notaTiempo: notasTiempo)
			p.hacerSonar((Notas) notaTiempo[0], (Integer) notaTiempo[1]);
	}
}
