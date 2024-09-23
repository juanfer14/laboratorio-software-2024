package ejercicio3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class StringConverterSet<E> extends AbstractSet<E> {
	private Set<E> s = new HashSet<E>();

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new IteratorStringAdapter<E>(s.iterator());
	}
	
	
	public void agregar(E e) {
		s.add(e);
	}
	
	private class IteratorStringAdapter<E> implements Iterator<E> {
		private Iterator<E> it;
		public IteratorStringAdapter(Iterator<E> it) {
			this.it = it;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return it.hasNext();
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E e = it.next();
			return e == null ? null : (E) e.toString();  
		}
		
	}

}
