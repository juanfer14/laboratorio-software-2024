package ejercicio2;
import java.util.Arrays;

public class PaintTest {

	public static void main(String[] args) {
		Paint paint=new Paint();
		paint.init();
		FiguraGeometrica[] figuras = paint.getPaleta();
		Arrays.sort(figuras);
		for(FiguraGeometrica figura: paint.getPaleta()) {
			System.out.println(figura.area());
			if(figura instanceof Circulo) {
				Circulo circulo=(Circulo)figura;
				System.out.println("imprimo radio: " + circulo.getRadio());
			}
		}
	}

}
