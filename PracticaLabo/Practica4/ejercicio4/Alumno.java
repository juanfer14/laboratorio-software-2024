package ejercicio4;

public class Alumno {
	private String legajo;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Alumno(String legajo, String nombre, String apellido, int edad) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return legajo + " " + nombre + " " + apellido + " " + edad;
	}
	
}
