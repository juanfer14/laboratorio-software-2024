package ejercicio5;

import java.util.Iterator;

public class Stack<E> {
	private java.util.ArrayList<E> items;
	public Stack(){
		items = new java.util.ArrayList<E>();
	}
	public void push(E item){
		items.add(item);
	}
	public Object pop(){
		return items.removeLast();
	}
	public boolean isEmpty(){
		return items.isEmpty();
	}
	
	public Iterator<E> getIterator() {
		return new Iterator<E>() {
			private int i = items.size()-1;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i > -1;
			}
			@Override
			public E next() {
				// TODO Auto-generated method stub
				if(i > -1) { 
					return items.get(i--);
				}
				return null;
			}
		};
	}
	
	public static void main(String [] args) {
		Stack<String> s = new Stack<>();
		s.push("hola");
		s.push("como");
		s.push("andas");
		Iterator<String> it = s.getIterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
