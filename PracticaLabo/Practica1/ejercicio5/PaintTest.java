package ejercicio5;

public class PaintTest {

	public static void main(String[] args) {
		Paint paint=new Paint();
		paint.init();
		for(FiguraGeometrica figura: paint.getPaleta()) {
			System.out.println(figura.area());
			if(figura instanceof Circulo) {
				Circulo circulo=(Circulo)figura;
				System.out.println("imprimo radio: " + circulo.getRadio());
			}
		}
	}

}
