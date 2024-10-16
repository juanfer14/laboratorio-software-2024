package ejercicio1;


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
		Prueba p = new Prueba();
		Iterator i = p.getIterator();
		while(!i.fin()) {
			System.out.println(i.actual());
			i.siguiente();
		}
	}
}
