package ejercicio2;

import ejercicio2.FiguraGeometrica;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{
	private String color;
	public FiguraGeometrica() {}
	public abstract void dibujar();
	public abstract int area();
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public int compareTo(FiguraGeometrica f) {
		return this.area() - f.area();
	}
}
	
