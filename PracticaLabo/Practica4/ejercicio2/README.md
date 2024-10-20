2.- Considere la siguiente clase:

```
public class Veterinaria<E> {
	private E animal;
	
	public void setAnimal(E x) {
		animal = x;
	}
	
	public E getAnimal() {
		return animal;
	}
}

public class Animal{
}

public class Gato extends Animal {
}

public class Perro extends Animal {
}
```
a) Indicar cual es el resultado de las siguientes operaciones:

i) Veterinaria < Animal > vet = new Veterinaria < Gato >();

__Error en compilacion, no se puede convertir Veterianaria a Veterinaria (los tipos parametrizados son invariantes)__

__Un tipo parametrizado es una instanciacion de un tipo generico, con parametros reales.__

__Los tipos parametrizados son invariantes, esto quiere decir que no tienen relacion de supertipo ni subtipo.__

ii) Veterinaria < Gato > vet = new Veterinaria < Animal >();

__Idem que i)__

iii)
<ul>
	<li>Veterinaria <?> vet = new Veterinaria< Gato >();</li>
	<li>vet.setAnimal(new Gato());</li>
</ul> 

__El error es 'incompatible types: Gato cannot be converted to CAP#1', esto se debe a que java, no puede inferir el tipo que se puede agregar en la clase 'Veterinaria <?>'.__

	 
iv)
<ul>
	<li>Veterinaria vet = new Veterinaria ();</li>
	<li>vet.setAnimal(new Perro());</li>
</ul>

__No hay errores. Esto se debe a que 'vet' es un raw type, el cual esta permitido en java. Se permite asignar un tipo parametrizado a un raw type, pero puede producir 'ClassCastException' si se inserta un tipo equivocado.__
 
v) Veterinaria vet = new Veterinaria <?>();

__Error: 'required: clas or interface without bounds' no se sabe el tipo parametrizado que se esta instanciando.__

vi) Veterinaria <? extends Animal> vet = new Veterinaria< Gato >();

__No ha error, ya que el tipo parametrizado instanciado 'Gato' (lado derecho) es subclase de 'Animal' (lado izquierdo).__