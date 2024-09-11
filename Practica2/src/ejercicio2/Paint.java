package ejercicio2;

public class Paint {
	private FiguraGeometrica[] paleta;
	
	public Paint() {}
	public void setPaleta(FiguraGeometrica[] paleta) {
		this.paleta=paleta;
	}
	public FiguraGeometrica[] getPaleta() {
		return paleta;
	}
	public void init() {
		paleta=new FiguraGeometrica[4];
		Circulo c1=new Circulo();
		c1.setRadio(2);
		c1.setColor("azul");
		paleta[0]=c1;
		Circulo c2=new Circulo();
		c2.setRadio(3);
		c2.setColor("amarillo");
		paleta[1]=c2;
		Rectangulo r1=new Rectangulo(2,3);
		r1.setColor("verde");
		paleta[2]=r1;
		Rectangulo r2=new Rectangulo(4,10);
		r2.setColor("rojo");
		paleta[3]=r2;
	}
}
