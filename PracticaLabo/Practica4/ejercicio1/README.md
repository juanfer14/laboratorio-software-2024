1.- Se quiere mantener un conjunto de alumnos ordenados por número de legajo, correspondientes a una materia en una Facultad. Defina una clase Alumno en el paquete practica4, que contenga información del alumno, entre otras cosas el legajo, apellido y nombre y DNI.

a) Defina una clase llamada Materia en el mismo paquete que mantenga información sobre la materia y la nómina de alumnos.Use colecciones genéricas.

b) Defina en la clase Materia 2 métodos: agregaAlumno(Alumno a) que agregue a alumnos a la nómina de alumnos existentes y getAlumnos() que retorne el conjunto de alumnos inscriptos en la materia.

c) Pruebe las clases definidas creando agregando al menos 10 alumnos en una Materia. Recorra la colección e imprima sus elementos.

d) Su colección está ordenada, ¿qué requisito tuvo que cumplir para poder mantenerla ordenada?

__No esta ordenada, ya que utilice ArrayList. Para mantener la nomina ordenada, lo que hice fue utilizar un 'TreeSet' que implementa un 'SortedSet'. Luego en la clase 'Alumno' sobrescribi el metodo 'equals()' para evaluar cuando un alumno es igual a otro y 'compareTo()' para definir con que orden se agrega un alumon al set.__

e) Si quisiera que el criterio de orden se mantenga sobre el apellido y nombre ¿cómo lo haría?

__Modificando el metodo 'compareTo()' de alumno, para que el criterio de orden sea el apellido y nombre.__

f) Analice una solución que permita mantener una nómina no sólo de alumnos sino también de empleados, clientes, etc. ¿Cómo definiría la colección?

__Tendria que definir una coleccion, en donde todas estas entidades (alumnos, empleados, clientes) hereden de Persona (por ejemplo), para que pueda agregar a cualquier tipo de persona.__

__Collection<? extends Persona> nomina;__ 