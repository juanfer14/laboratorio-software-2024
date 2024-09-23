package ejercicio2;

public class InnerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			InnerStatic.Circulo.ingresarValor();
			System.out.println(InnerStatic.Circulo.getArea());
			System.out.println(InnerStatic.Circulo.getLongitudCircunsferencia());
		}
	}
}
