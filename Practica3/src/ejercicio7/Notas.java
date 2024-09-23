package ejercicio7;

public enum Notas {
	A("LA"),
	B("SI"),
	C("DO"),
	D("RE"),
	E("MI"),
	F("FA"),
	G("SOL");
	
	private String nota; 
	Notas(String nota){
		this.nota=nota;
	}
	public String nota() {return nota;}
	
	public static void main(String [] args) {
		for(Notas n: Notas.values())
			System.out.println(n + ":" + n.nota);
	}
}
