package ejercicio4;

public abstract class FiguraGeometrica implements java.io.Serializable
{
	private static final long serialVersionUID = 7485560408432855366L;
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
	
	
}
	
