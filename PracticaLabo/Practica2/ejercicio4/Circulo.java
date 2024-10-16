package ejercicio4;
import java.lang.Math;
public class Circulo extends FiguraGeometrica {
	private static final long serialVersionUID = 2609891062315928781L;
	private int radio;
	public Circulo() {}
	
	@Override
	public void dibujar() {
		StringBuffer str = new StringBuffer();
		str.append("se dibuja un circulo de radio ");
		str.append(radio);
		str.append(" y de color ");
		str.append(this.getColor());
		System.out.println(str.toString());
	}
	@Override
	public int area() {
		return (int) (Math.PI * radio * radio);
	}
	
	public void setRadio(int radio) {
		this.radio=radio;
	}
	
	public int getRadio() {
		return radio;
	}
	
	
}
