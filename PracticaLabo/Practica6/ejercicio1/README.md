1.- Determine si el siguiente código es correcto. Si produce un error, observe de qué tipo es y soluciónelo.

```
class Excepcion1 extends Exception{}
class Excepcion2 extends Exception1{}
public class Test1 {
	public static void main(String[] args) {
		try {
			throw new Exception2();
		} catch(Excepcion1 e1) {
			System.out.println(“Se capturó la Excepción1”);
		} catch( Excepcion2 e2) {
			System.out.println(“Se capturó la Excepción2”);
		}
	}
}
```

__No es correcto, ya que el compilador informa que se definio un catch para Excepcion2, la cual es Excepcion1.__

__Una posible solucion, es invertir el orden de los catch, para que verifique primero el mas especifico y luego el mas general.__

```
class Excepcion1 extends Exception{}
class Excepcion2 extends Exception1{}
public class Test1 {
	public static void main(String[] args) {
		try {
			throw new Exception2();
		} catch(Excepcion2 e2) {
			System.out.println(“Se capturó la Excepción2”);
		} catch( Excepcion1 e1) {
			System.out.println(“Se capturó la Excepción1”);
		}
	}
}
```

__Otra solucion, es dejar la excepcion mas general o especifica (Excepcion1 o Excepcion2).__

```
class Excepcion1 extends Exception{}
class Excepcion2 extends Exception1{}
public class Test1 {
	public static void main(String[] args) {
		try {
			throw new Exception2();
		} catch(Excepcion2 e2) {
			System.out.println(“Se capturó la Excepción2”);
		}
	}
}
```