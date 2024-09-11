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

__No tiene el funcionamiento esperado, ya que al ser un HashSet, solo agrega elementos que no estan en el conjunto.__

__Si, esta relacionado con la herencia, ya que HashSet extiende de AbstractCollection e implementa Set. El resultado de add() es true, solo si el conjunto no posee elementos,__


b) Diseñe e implemente una alternativa para HashSetAgregados. ¿Qué interface usaría? ¿Qué ventajas proporcionaría esta nueva implementación
respecto de la original?

c) Se desea implementar otro tipo especial de Set con la característica de poder consultar la cantidad total de elementos que se removieron del mismo. Diseñe e implemente una solución que permita fácilmente definir nuevos tipos de Set con distintas características.