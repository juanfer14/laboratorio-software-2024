package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetAgregados<Integer> hs = new HashSetAgregados<Integer>();
		List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		hs.add(1);
		hs.addAll(numeros);
		System.out.println(hs.getCantidadAgregados());
	}

}
