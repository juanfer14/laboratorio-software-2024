3.- Se desea implementar un tipo especial de HashSet con la característica de poder
consultar la cantidad total de elementos que se agregaron al mismo. Analice y
pruebe el siguiente código de manera de corroborar si realiza lo pedido.

```
public class HashSetAgregados<E> extends HashSet<E> {
	private int cantidadAgregados = 0;
	public HashSetAgregados() {
	}
	
	public HashSetAgregados(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}
	
	@Override public boolean add(E e) {
		cantidadAgregados++;
		return super.add(e);
	}
	
	@Override public boolean addAll(Collection<? extends E> c) {
		cantidadAgregados += c.size();
		return super.addAll(c);
	}
	
	public int getCantidadAgregados() {
		return cantidadAgregados;
	}
}
```
a) Agregue a una instancia de HashSetAgregados los elementos de otra colección (mediante el método addAll). Invoque luego al método
getCantidadAgregados. ¿La clase tiene el funcionamiento esperado? ¿Por qué? ¿Tiene relación con la herencia?

__No tiene el funcionamiento esperado. Esto se debe a que 'HashSetAgregados' hereda el metodo 'addAll()' de la clase 'AbstractCollection' ('HashSet' -> 'AbstractSet' -> 'AbstractCollection') y 'AbstractCollection' realiza lo siguiente:__

```
public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c)
            if (add(e))
                modified = true;
        return modified;
    }
```
__El metodo 'add()' que se invoca es el de 'HashSetAgregados' y este invoca al 'add()' de 'HashSet' que realiza lo siguiente:__

```
transient HashMap<E,Object> map;

// Dummy value to associate with an Object in the backing Map
static final Object PRESENT = new Object();

...

public boolean add(E e) {
        return map.put(e, PRESENT)==null;
}
```

__Donde 'map.put()' agrega 'e' si y solo si no esta en el HashMap; el valor de retorno es null si no hay un valor asociado previamente a 'e', caso contrario retorna el valor asociado (en este caso PRESENT)__

__Si, el problema esta relacionado con la herencia, y no contar bien la cantidad de elementos que en realidad de agregan.__



b) Diseñe e implemente una alternativa para HashSetAgregados. ¿Qué interface usaría? ¿Qué ventajas proporcionaría esta nueva implementación
respecto de la original?

__La misma interface que venia usando. La ventaja es que realiza lo que tiene que hacer.__


c) Se desea implementar otro tipo especial de Set con la característica de poder consultar la cantidad total de elementos que se removieron del mismo. Diseñe e implemente una solución que permita fácilmente definir nuevos tipos de Set con distintas características.