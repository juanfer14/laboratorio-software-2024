2.- Ejecute el siguiente código. ¿Cuál es el resultado?. Elimine los comentarios y vuelva a ejecutarlo. ¿Cuál es el resultado?.

```
public class Test2 {
	public int unMetodo(){
		// try {
		System.out.println("Va a retornar 1");
		return 1;
		// } finally {
		System.out.println("Va a retornar 2");
		return 2;
		// }
	}
	public static void main(String[] args) {
		Test2 res = new Test2();
		System.out.println(res.unMetodo());
	}
}
```

El resultado es:

```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code

	at ejercicio2.Test2.unMetodo(Test2.java:9)
	at ejercicio2.Test2.main(Test2.java:15)
```

Eliminando los comentarios:

```
public class Test2 {
	public int unMetodo(){
		try {
			System.out.println("Va a retornar 1");
			return 1;
		} finally {
			System.out.println("Va a retornar 2");
			return 2;
		}
	}
	public static void main(String[] args) {
		Test2 res = new Test2();
		System.out.println(res.unMetodo());
	}
}
```

El resultado es:

```
Va a retornar 1
Va a retornar 2
2
```