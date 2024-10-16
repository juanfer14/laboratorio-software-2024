package ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Estudiante {
	private String apellido;
	private String nombre;
	private int edad;
	private int legajo;
	private int materiasAprobada;
	
	public Estudiante(String apellido, String nombre, int edad, int legajo, int materiasAprobada) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.legajo = legajo;
		this.materiasAprobada = materiasAprobada;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getLegajo() {
		return legajo;
	}

	public int getMateriasAprobada() {
		return materiasAprobada;
	}
	
	private static class materiasCmp implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante o1, Estudiante o2) {
			// TODO Auto-generated method stub
			return o1.getMateriasAprobada() - o2.getMateriasAprobada();
		}
	}
	
	private static class edadCmp implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante o1, Estudiante o2) {
			// TODO Auto-generated method stub
			return o2.getEdad() - o1.getEdad();
		}
	}
	
	private static class legajoCmp implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante o1, Estudiante o2) {
			// TODO Auto-generated method stub
			return o1.getLegajo() - o2.getLegajo();
		}
	}
	
	private static class nomyappCmp implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante o1, Estudiante o2) {
			// TODO Auto-generated method stub
			return (o2.getApellido() + o2.getNombre()).compareTo(o1.getApellido() + o1.getNombre());
		}
	}
	
	public static final Comparator<Estudiante> CMP_MATERIA = new materiasCmp();
	public static final Comparator<Estudiante> CMP_EDAD = new edadCmp();
	public static final Comparator<Estudiante> CMP_LEGAJO = new legajoCmp();
	public static final Comparator<Estudiante> CMP_NOM_APP = new nomyappCmp();
	
	public enum Comparaciones {
		CMP_MATERIA, CMP_EDAD, CMP_LEGAJO, CMP_NOM_APP;
	}
	
	@Override
	public String toString() {
		return apellido + " " + nombre + " " + edad + " " + legajo + " " + materiasAprobada;
		
	}
	
	public static void main(String[] args) {
		Estudiante [] estudiantes = new Estudiante[3];
		estudiantes[0] = new Estudiante("campodonico", "juan fernando", 27, 178949, 20);
		estudiantes[1] = new Estudiante("luciano", "manuel", 19, 184784, 6);
		estudiantes[2] = new Estudiante("gerson", "ximena", 22, 164567, 15);
		
		@SuppressWarnings("unchecked")
		Comparator<Estudiante> [] comparadores = new Comparator[] {
				CMP_MATERIA, CMP_EDAD, CMP_LEGAJO, CMP_NOM_APP
		};
		
		for(Comparator<Estudiante> cmp: comparadores) {
			
			Arrays.sort(estudiantes, cmp);
			
			for(Estudiante e: estudiantes)
				System.out.println(e);
			System.out.println();
		}
			
		}
	
}
