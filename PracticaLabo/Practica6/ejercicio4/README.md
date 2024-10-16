4.- Analice el siguiente código y determine si es correcto. Si hay errores, escriba el motivo de cada uno y proponga una solución.

```
class FutbolException extends Exception{}

class Falta extends FutbolException{}

class EquipoIncompleto extends FutbolException{}

class ClimaException extends Exception{}

class Lluvia extends ClimaException{}

class Mano extends Falta{}

class Partido {
	Partido() throws FutbolException{}
	void evento() throws FutbolException{}
	void jugada() throws EquipoIncompleto, Falta{}
	void penal() {}	
}

inteface Tormenta {
	void evento() throws Lluvia;
	void diluvio() throws Lluvia;
}

public class Encuentro extends Partido implements Tormenta {
	
	Encuentro() throws Lluvia, FutbolException{..}
	Encuentro (String fecha) throws Falta, FutbolException{..}
	void penal() throws Mano{..}
	public void evento() throws Lluvia{..}
	public void diluvio() throws Lluvia{..}
	public void evento(){..}
	void jugada() throws Mano{..}

	public static void main (String[] args) {
		try {
			Encuentro enc = new Encuentro();
			enc.jugada();
		} catch(Mano e) {
		} catch(Lluvia e) {
		} catchclass FutbolException extends Exception{}

class Falta extends FutbolException{}

class EquipoIncompleto extends FutbolException{}

class ClimaException extends Exception{}

class Lluvia extends ClimaException{}

class Mano extends Falta{}

class Partido {
	Partido() throws FutbolException{}
	void evento() throws FutbolException{}
	void jugada() throws EquipoIncompleto, Falta{}
	void penal {}	
}

inteface Tormenta {
	void evento() throws Lluvia;
	void diluvio() throws Lluvia;
}

public class Encuentro extends Partido implements Tormenta {
	
	Encuentro() throws Lluvia, FutbolException{..}
	Encuentro (String fecha) throws Falta, FutbolException{..}
	void penal() throws Mano{..}
	public void evento() throws Lluvia{..}
	public void diluvio() throws Lluvia{..}
	public void evento(){..}
	void jugada() throws Mano{..}

	public static void main (String[] args) {
		try {
			Encuentro enc = new Encuentro();
			enc.jugada();
		} catch(Mano e) {
		} catch(Lluvia e) {
		} catch(FutbolException e) {
			try {
				Partido par = new Encuentro();
				par.jugada();
			} catch(EquipoIncompleto e) {
			} catch(Falta e) {
			} catch(Lluvia e) {
			} catch(FutbolException e) {}
		}
	}
}(FutbolException e) {
			try {
				Partido par = new Encuentro();
				par.jugada();
			} catch(EquipoIncompleto e) {
			} catch(Falta e) {
			} catch(Lluvia e) {
			} catch(FutbolException e) {}
		}
	}
}
```

Errores:

1. Se sobrecarga el metodo 'evento' en la clase 'Encuentro' de forma incorrecta. Uno lanza una excepcion y otro no, pero contienen la misma firma.
<ul>
	<li>**Se deberia dejaria dejar un metodo evento.**</li>
</ul>

2. Si se deja el metodo 'evento' de la clase 'Encuentro' que levanta una excepcion, este sera incorrecto, ya que deberia lanzar una excepcion que sea de la misma jerarquia que la del metodo que sobrescribe.
<ul>
	<li>Lo mismo pasa con el contructor de la clase 'Encuentro' y el metodo 'penal'.</li>
	<li>**Lo metodos que realizan sobrescritura, deben lanzar excepciones que sean subtipos del metodo sobrescrito.**</li>
</ul>
3. No es un error, pero como buena practica, todas las clases que hereden directa o indirectamente de 'Exception' deben tener el sufijo 'Exception'.