package ejercicio2;

public class Rectangulo extends FiguraGeometrica {
	int alto;
	int ancho;
	
	public Rectangulo() {}
	public Rectangulo(int alto, int ancho) {
		this.alto=alto;
		this.ancho=ancho;
	}
	
	@Override
	public void dibujar() {
		StringBuffer str = new StringBuffer();
		str.append("se dibuja un rectangulo con alto ");
		str.append(alto);
		str.append(" y ancho ");
		str.append(ancho);
		str.append(" y de color ");
		str.append(this.getColor());
		System.out.println(str.toString());
	}

	@Override
	public int area() {
		return alto * ancho;
	}

}
