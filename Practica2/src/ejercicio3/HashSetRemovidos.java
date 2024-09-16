package ejercicio3;

import java.util.HashSet;

public class HashSetRemovidos<E> extends HashSetAgregados<E> {
	int removidos;
	public HashSetRemovidos() {
		removidos=0;
	}
	public HashSetRemovidos(int initCap, float loadFactor) {
        super(initCap, loadFactor);
        removidos=0;
    }
	
	@Override public boolean remove(Object o){
		if (super.remove(o)) {
			removidos++;
			return true;
		}
		return false;
	}
	
	public int getCantidadRemovidos() {
		return removidos;
	}
}
