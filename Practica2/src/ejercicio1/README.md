1.- Declaración e implementación de Interfaces.

a) ¿Son correctas las siguientes declaraciones?

```
interface ColPrimarios {
	int ROJO=1, VERDE=2, AZUL=4;
}

interface ColArcoIris extends ColPrimarios {
	int AMARILLO=3, NARANJA=5, INDIGO=6, VIOLETA=7;
}

interface ColImpresion extends ColPrimarios {
	int AMARILLO=8, CYAN=16, MAGENTA=32;
}

interface TodosLosColores extends ColImpresion, ColArcoIris {
	int FUCSIA=17, BORDO=ROJO+90;
}

class MisColores implements ColImpresion, ColArcoIris {
	public MisColores() {
		int unColor=AMARILLO;
	}
}
```

__No, ya que hay una referencia ambiguedad para la variable estatica 'AMARILLO' en 'ColArcoIris' y 'ColImpresion'__

__Luego las variables que no tienen sobreescritura se heredan una unica vez__

b) Analice el código de la interface y las clases que la implementan. Determine si son legales o no. En caso de ser necesario, realice las correcciones que correspondan. ¿Cómo podría modificar el método afinar() para evitar realizar cambios en las clases que implementan InstrumentoMusical ?

```
public interface InstrumentoMusical {
	void hacerSonar();
	String queEs();
	void afinar(){}
}

class abstract InstrumentoDeViento implements InstrumentoMusical {
	void hacerSonar(){
		System.out.println("Sonar Vientos");
	}
	
	public String queEs() {
		return "Instrumento de Viento";
	}
}

class InstrumentoDeCuerda implements InstrumentoMusical {
	void hacerSonar(){
		System.out.println("Sonar Cuerdas");
	}
	
	public String queEs() {
		return "Instrumento de Cuerda";
	}
}
```

__No son legales en las clases 'InstrumentoDeViento' y 'IntrumentoDeCuerda', ya que:__
* El especificador de acceso del metodo 'hacerSonar' es package, tanto en 'InstrumentoDeViento' como en 'InstrumentoDeCuerda' cuando deberia se public o uno mas permisivo.
* No es posible implementar un metodo en una interfaz (a partir de JAVA 8 si, con 'default').
* La palabra clave 'abstract' en InstrumentoDeViento esta mal colocada.
* La clase 'InstrumentoDeCuerda' deberia implementar 'afinar()' (la clase 'InstrumentoDeViento' al ser abstracta, no necesita implementarlo).

__Modificaciones:__

```
public interface InstrumentoMusical {
	void hacerSonar();
	String queEs();
	default void afinar(){}
}

class abstract InstrumentoDeViento implements InstrumentoMusical {
	public void hacerSonar(){
		System.out.println("Sonar Vientos");
	}
	
	public String queEs() {
		return "Instrumento de Viento";
	}
}

class InstrumentoDeCuerda implements InstrumentoMusical {
	public void hacerSonar(){
		System.out.println("Sonar Cuerdas");
	}
	
	public String queEs() {
		return "Instrumento de Cuerda";
	}
}
```

__Para evitar realizar cambios en las clases que implementan la interfaz 'InstrumentoMusical', se deberia implementar al metodo 'afinar()' como default para que las clases (no abstractas) que extienden de la misma y no poseen una implementacion, no tengan que ser modificadas__


 
