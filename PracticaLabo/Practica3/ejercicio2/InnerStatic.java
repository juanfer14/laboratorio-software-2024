package ejercicio2;
import java.util.Scanner;
import static java.lang.Math.pow;

public class InnerStatic {
	static double PI = 3.1416;

    static class Circulo {
    	static Scanner sc = new Scanner(System.in);
        static double radio;

        static double getArea() {
            double a = PI * pow(radio, 2);
            System.out.println("El área es: " + a);
            return a;
        }

        static double getLongitudCircunsferencia() {
            double l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }
        
        static void ingresarValor() {
        	double r = sc.nextInt();
        	radio=r;
        }
    }
}
