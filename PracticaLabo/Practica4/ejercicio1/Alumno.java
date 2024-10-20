package ejercicio1;

public class Alumno implements Comparable<Alumno> {
	private String legajo;
	private  String apellido;
	private String nombre;
	private Integer dni;
	
	public Alumno(String legajo, String apellido, String nombre, int dni) {
		super();
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return legajo + " " + apellido + " " + nombre + " " + dni;
	}
	
	@Override
	public boolean equals(Object o) {
		Alumno a = (Alumno) o;
		return (legajo.equals(a.getLegajo()) | dni.equals(a.getDni()));
				
	}

	public String getLegajo() {
		return legajo;
	}


	public int getDni() {
		return dni;
	}

	@Override
	public int compareTo(Alumno otro) {
		return this.getLegajo().compareTo(otro.getLegajo());
	}
	
	
}
