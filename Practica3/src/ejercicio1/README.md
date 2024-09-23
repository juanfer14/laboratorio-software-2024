1.- Complete el código de la clase Stack en el paquete practica3, de manera que implemente una pila de String:

```
public class Stack {
	private java.util.ArrayList items;
	public Stack(){...}
	public void push(Object item){...}
	public Object pop(){...}
	public boolean isEmpty(){...}
}
```

a) Implemente un método main() para probar la pila. Agregue Strings a la pila y recórrala para imprimir sus valores. ¿Cuántas veces puede recorrerla?

```
public class Stack {
	private java.util.ArrayList items;
	public Stack(){
		items = new java.util.ArrayList();
	}
	public void push(Object item){
		items.add(item);
	}
	public Object pop(){
		return items.removeLast();
	}
	public boolean isEmpty(){
		return items.isEmpty();
	}
	
	public static void main(String [] args) {
		Stack s = new Stack();
		s.push("hola");
		s.push("como");
		s.push("andas");
		while(!s.isEmpty())
			System.out.println(s.pop());

	}
}
```

__Solamente una vez, ya que se itera la pila, sacando sus elementos.__

b) Agregue una clase anidada llamada StackIterator que provea un objeto de tipo Iterator para recorrer la pila.


c) Agregue en la clase Stack un método para que retorne una instancia de StackIterator. ¿Cuántas veces puede recorrer la pila ahora?

```
class Iterator {
	private int i = items.size()-1;
	public boolean fin() {
		return i < 0;
	}
	public void siguiente() {
		if(i > -1) 
			i--; 
	}
	public Object actual() {
		return items.get(i);
	}
}

public Iterator getIterator() {
	return new Iterator();
}
	
public static void main(String [] args) {
	Stack s = new Stack();
	s.push("hola");
	s.push("como");
	s.push("andas");
	Iterator i = s.getIterator();
	while(!i.fin()) {
		System.out.println(i.actual());
		i.siguiente();
	}
}
```

__Multiples veces, ya que ahora el recorrido depende de la clase iterador, que itera logicamente por los elementos de la pila de strings.__

d) ¿Es posible crear objetos StackIterator desde una clase diferente a la clase Stack con el operador new?, ¿cómo lo hace?

__Si es posible.__

```
public class Prueba {
	private Stack stack;
	private Stack.Iterator iterator;
	
	public Prueba() {
		stack = new Stack();
		stack.push("hola");
		stack.push("como");
		stack.push("andas");
		iterator = stack.new Iterator();
	}
	
	public Stack.Iterator getIterator(){
		return iterator;
	}
}
```

__Indicando el el objeto de la clase (stack) y new.__

e) ¿Cómo haría para evitar crear instancias de una clase anidada desde una clase que no sea la que la definió?

__Deberia declarar a la clase anidada como privada. Si esta clase implementa una interfaz, solamente se obtiene una referencia al tipo de la interfaz.__