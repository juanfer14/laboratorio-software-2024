3.- Ejecute el siguiente código. ¿Cuál es la salida del programa?

```
public class Test3 {
	public static void main(String[] args) {
		System.out.println("Test3");
		try {
			System.out.println("Primer try");
			try {
			throw new Exception();
			} finally {
			System.out.println("Finally del 2º try");
			}
		} catch (Exception e) {
			System.out.println("Se capturó la Excepción ex del 1º Primer try");
		} finally {
			System.out.println("Finally del 1º try");
		}
	}
}
```

__La salida es:__

```
Test3
Primer try
Finally del 2º try
Se capturó la Excepción ex del 1º Primer try
Finally del 1º try
```

__Nota: todo bloque try-catch que contiene un bloque finally, ejecuta siempre el bloque finally al final (se haya manejado o no una excepcion).__

__Sabiendo esto, el try mas anidado levanta la excepcion, y como no contiene un catch para ese tipo de excepcion 'Exception', ejecuta el bloque finally y la propaga.__

__Una vez propagada, se atrapa en el primer try, y luego se ejecuta el bloque finally.__
