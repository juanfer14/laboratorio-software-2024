package ejercicio1;

import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class Materia {
	private String nombre;
	private SortedSet<Alumno> alumnos;
	
	public Materia(String nombre) {
		this.nombre = nombre;
		this.alumnos = new TreeSet<Alumno>();
	}
	
	public void agregarAlumno(Alumno a) {
		this.alumnos.add(a);
	}
	
	public Set<Alumno> getAlumnos(){
		return this.alumnos;
	}
}
