4.- Implementación de Expresiones Lambda en Java

a) Defina una clase llamada Facultad que contenga en su interior una lista de alumnos, donde de estos últimos se guarda la siguiente información:

- nro de alumno
- nombres
- apellidos
- edad
- materia aprobada
- nota de aprobación

Sobre la clase Facultad implemente los métodos necesarios utilizando expresiones Lambda a fin de poder realizar las siguientes consultas:

1. Obtener el estudiante con mayor nota.
2. Imprimir dos estudiantes de la lista.
3. El que tomó el curso llamado "Laboratorio deSoftware".
4. Obtener los alumnos, cuyo nombre empiece con el carácter "P" y la longitud de su nombre sea menor o igual a 6.

Finalmente implemente una clase TestFacultad que permita probar las consultas anteriores.

b) Implemente el método **ordenarPorNota()** en la clase **Facultad** del ejercicio anterior. Dicho método ordena la lista de estudiantes por nota de aprobación de mayor a menor utilizando una clase interna que implementa la interface **java.util.Comparator**.

```
public List<Cursada> ordenarPorNota(){
	cursadas.sort(new Comparator<Cursada>() {
		@Override
		public int compare(Cursada c1, Cursada c2) {
			return c2.getNota() - c1.getNota();
		}
	});
	return cursadas;
}
```

1. Modifique el código para reemplazar la clase interna por una expresión lambda.

```
public List<Cursada> ordenarPorNota(){
		cursadas.sort((c1,c2) -> Integer.compare(c2.getNota(), c1.getNota()));
		return cursadas;
}
```

2. Modifique la implementación para que utilice el método estático Comparator.comparingInt(). ¿Qué recibe como parámetro?

```
public List<Cursada> ordenarPorNota(){
		cursadas.sort(Comparator.comparingInt(c -> ((Cursada) c).getNota()).reversed());
		return cursadas;
	}
```

__Recibe como parametro una funcion lambda, que retorna la nota del alumno.__


3. ¿Es posible utilizar una referencia a método? Utilícela en caso de ser posible.

__Si, es posible.__

```
public List<Cursada> ordenarPorNota(){
		cursadas.sort(Comparator.comparingInt(Cursada::getNota).reversed());
		return cursadas;
}
```

