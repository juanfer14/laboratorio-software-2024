package ejercicio3;

import java.util.Iterator;

public class PruebaStack {
	public static void main(String [] args) {
		StringConverterSet<Integer> scs = new StringConverterSet<Integer>();
		scs.agregar(1);
		scs.agregar(2);
		scs.agregar(3);
		scs.agregar(3);
		Iterator<Integer> it = scs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
