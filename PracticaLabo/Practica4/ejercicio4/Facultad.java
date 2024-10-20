package ejercicio4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Facultad {
	List<Cursada> cursadas;
	
	public Facultad() {
		this.cursadas = new ArrayList<Cursada>();
	}
	
	public void agregarCursada(Cursada c){
		cursadas.add(c);
	}
	
	public Alumno mayorNota() {
		cursadas.sort((c1, c2) -> Integer.compare(c1.getNota(), c2.getNota()));
		return cursadas.getLast().getAlumno();
	}
	
	public List<Alumno> dosAlumnos() {
		List<Cursada> copy = new ArrayList<Cursada>(cursadas);
		Collections.shuffle(copy);
		return copy.stream()
			.map(c -> c.getAlumno())
			.limit(2)
			.collect(Collectors.toList());

	}
	
	public Alumno hizoLaboratorio() {
		Cursada cursada =  cursadas.stream()
				.filter(c -> c.getMateria().getNombre().equals("Laboratorio de Software"))
				.findFirst()
				.orElse(null);		
		return cursada != null ? cursada.getAlumno() : null;

	}
	
	public List<Alumno> condicionNombre(){
		return cursadas.stream()
				.map(c -> c.getAlumno())
				.filter(a -> a.getNombre().startsWith("P") & a.getNombre().length() < 7)
				.collect(Collectors.toList());
	}
	
	public List<Cursada> ordenarPorNota(){
		cursadas.sort(Comparator.comparingInt(Cursada::getNota).reversed());
		return cursadas;
}
}
