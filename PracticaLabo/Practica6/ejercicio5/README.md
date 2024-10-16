5.- Analice el siguiente código:

```
public class Suma {
	public static void main(String[] args){
		int suma=0;
		for(int i=0;i<args.length;i++)
			suma+= Integer.parseInt(args[i]);
		System.out.print("La suma es:"+suma);
	}
}
```
a) Ejecútelo ingresando al menos 2 valores.

__Ejecutandolo con 2 valores numericos, imprime la suma de estos valores__

b) Ahora ejecútelo ingresando: '2 3 four'. ¿Qué pasó?. Solucione el problema de manera que los datos no numéricos sean impresos en la consola con un mensaje y descartados antes de ser sumados.

__Se lanzo la excepcion 'NumberFormatException':__

```
Exception in thread "main" java.lang.NumberFormatException: For input string: "four"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:588)
	at java.base/java.lang.Integer.parseInt(Integer.java:685)
	at ejercicio5.Suma.main(Suma.java:7)
```

__El programa arreglado, es el siguiente:__

```
public class Suma {
	public static void main(String[] args){
		int suma=0;
		for(int i=0;i<args.length;i++)
			try {
			suma+= Integer.parseInt(args[i]);
			} catch(NumberFormatException e) {
				System.out.println("Introdujo un valor que no es numerico: " + args[i]);
			}
		System.out.print("La suma es:"+suma);
	}
}
```

c) ¿Por qué no fue necesario capturar la excepción en el inciso a) ?

__Por que el valor que se iba a sumar era numerico.__
