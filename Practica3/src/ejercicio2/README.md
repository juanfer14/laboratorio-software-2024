2.- Analice el código que figura debajo.

```
class InnerStatic {
    static double PI = 3.1416;

    static class Circulo {
        static double radio = 2;

        static double getArea() {
            double a = PI * Math.pow(radio, 2);
            System.out.println("El área es: " + a);
            return a;
        }

        static double getLongitudCircunsferencia() {
            double l = 2 * PI * radio;
            System.out.println("La longitud es: " + l);
            return l;
        }
    }
}
```

a) Modifique el código de la clase interna estática para que el valor inicial del radio sea ingresado por el usuario en el momento de la ejecución.

```
import java.util.Scanner;

public class InnerStatic {
	static double PI = 3.1416;

    static class Circulo {
    	static Scanner sc = new Scanner(System.in);
        static double radio;

        static double getArea() {
            double a = PI * Math.pow(radio, 2);
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
```

b) Defina una clase llamada InnerTest en el paquete practica3 con un método main() que imprime en la pantalla el área y la longitud de la circunferencia. Ejecútela varias veces ingresando distintos radios.

```
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
```

c) Remplazar PI x Math.pow(radio,2) por PI x pow(radio,2), siendo pow() el método de la clase java.lang.Math

```
import static java.lang.Math.pow;
...
static double getArea() {
	double a = PI * pow(radio, 2);
	System.out.println("El área es: " + a);
	return a;
}
```