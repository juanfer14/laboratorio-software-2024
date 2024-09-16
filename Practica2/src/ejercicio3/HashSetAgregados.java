package ejercicio3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class HashSetAgregados<E> extends HashSet<E> {
    private int cantidadAgregados = 0;
    public HashSetAgregados() {
    }
    
    public HashSetAgregados(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }
    
    @Override public boolean add(E e) {
        //cantidadAgregados++;
        if(super.add(e)) {
        	cantidadAgregados++;
        	return true;
        } 
        return false;
    }
    
    @Override public boolean addAll(Collection<? extends E> c) {
        //cantidadAgregados += c.size();
        return super.addAll(c);
    }
    
    public int getCantidadAgregados() {
        return cantidadAgregados;
    }
}
