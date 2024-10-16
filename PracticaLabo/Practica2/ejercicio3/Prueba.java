package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetRemovidos<Integer> hs = new HashSetRemovidos<Integer>();
		List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		hs.add(5);
		hs.addAll(numeros);
		hs.remove(1);
		hs.remove(0);
		System.out.println(hs.getCantidadAgregados());
		System.out.println(hs.getCantidadRemovidos());
	}

}
