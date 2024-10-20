package ejercicio4;

public class Cursada {
	private Alumno alumno;
	private Materia materia;
	private int nota;
	
	public Cursada(Alumno alumno, Materia materia, int nota) {
		super();
		this.alumno = alumno;
		this.materia = materia;
		this.nota = nota;
	}
	
	public Alumno getAlumno() {
		return alumno;
	}
	
	public Materia getMateria() {
		return materia;
	}
	
	public int getNota() {
		return nota;
	}
	
	@Override
	public String toString() {
		return alumno + " " + materia.getNombre() + " " + nota;
	}
	
	
}
