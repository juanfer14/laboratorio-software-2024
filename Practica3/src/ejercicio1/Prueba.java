package ejercicio1;

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
