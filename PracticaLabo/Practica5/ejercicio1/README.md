1.- Analice qué ocurre con la siguiente clase cuando se compila:

```
public class TestSobreescritura {
	@Override
	public String tostring() {
		return super.toString() + " Testeando: 'Override'";
	}
```
}

a) ¿Qué ocurre cuando se ejecuta TestAnotaciones?

__No ocurre ningun problema.__

b) ¿Qué ocurre si se elimina @SuppressWarnings({"deprecation"})? ¿el resultado de la ejecución es el mismo?

__Sigue siendo el mismo. El IDE Eclipse genera un warning al utilizar el metodo.__

c) ¿Cuál es la diferencia entre anotar el método testarYa() y anotar la clase TestAnotaciones?

__Que si se anota 'testearYa()', la advertencia solo sera descartada dentro del metodo, mientras que si se anota en la clase 'TestAnotaciones' la advertencia sera descartada en cualquier metodo o clase utilizada dentro de 'TestAnotaciones', que este anotada como @Deprecated__

```
public class TestDeprecated {
	@Deprecated
	public void hacer() {
		System.out.println("Testeando: 'Deprecated'");
	}
}

public class TestAnotaciones {
	public static void main(String arg[]) throws Exception {
		new TestAnotaciones().testearYa();
	}
	@SuppressWarnings({"deprecation"})
	public void testearYa() {
		TestDeprecated t2 = new TestDeprecated();
		t2.hacer();
	}
}
```