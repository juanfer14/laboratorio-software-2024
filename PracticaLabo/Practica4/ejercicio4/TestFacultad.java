package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class TestFacultad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Materia m1 = new Materia("Laboratorio de Software");
		Materia m2 = new Materia("Concepto de Algoritmos Datos y Programas");
		Materia m3 = new Materia("Organizacion de Computadoras");
		Materia m4 = new Materia("Arquitectura de Computadoras");
		Materia m5 = new Materia("Arquitectura de Computadoras");
		Materia m6 = new Materia("Taller de Programacion");
		
		Alumno a0 = new Alumno("17894/9", "Juan Fernando", "Campodonico" , 27);
		Alumno a1 = new Alumno("14567/2", "Enrique", "Suarez", 21);
		Alumno a2 = new Alumno("21456/3", "Vanesa", "Miglierini", 18);
		Alumno a3 = new Alumno("16722/4", "Andres", "Dorado", 20);
		Alumno a4 = new Alumno("17821/3", "Camila", "Ledesma", 19);
		Alumno a5 = new Alumno("21145/7", "Pedro", "Perez", 19);
		Alumno a6 = new Alumno("11245/2", "Karina", "Manes", 18);
		Alumno a7 = new Alumno("16223/5", "Paco", "Thibaut", 19);
		Alumno a8 = new Alumno("16775/4", "Mercedes", "Sosa", 20);
		Alumno a9 = new Alumno("23347/4", "Leonardo", "Da Vinci", 60);
		
		Cursada c0 = new Cursada(a9, m6, 6);
		Cursada c1 = new Cursada(a0, m1, 8);
		Cursada c2 = new Cursada(a1, m2, 7);
		Cursada c3 = new Cursada(a2, m2, 10);
		Cursada c4 = new Cursada(a3, m3, 6);
		Cursada c5 = new Cursada(a4, m3, 8);
		Cursada c6 = new Cursada(a5, m3, 7);
		Cursada c7 = new Cursada(a6, m4, 9);
		Cursada c8 = new Cursada(a7, m5, 5);
		Cursada c9 = new Cursada(a8, m6, 7);
		
		Facultad f = new Facultad();
		f.agregarCursada(c0);
		f.agregarCursada(c1);
		f.agregarCursada(c2);
		f.agregarCursada(c3);
		f.agregarCursada(c4);
		f.agregarCursada(c5);
		f.agregarCursada(c6);
		f.agregarCursada(c7);
		f.agregarCursada(c8);
		f.agregarCursada(c9);
		
		out.println("===ESTUDIANTE CON MAYOR NOTA===");
		out.println(f.mayorNota());
		out.println("===DOS ESTUDIANTES DE LA LISTA===");
		out.println(f.dosAlumnos());
		out.println("===ALUMNO QUE TOMO EL CURSO DE 'Laboratorio de Software'===");
		out.println(f.hizoLaboratorio());
		out.println("===ALUMNOS CUYO NOMBRE EMPIEZA CON 'P' Y SU LONGITUD ES MENOR O IGUAL A 6===");
		out.println(f.condicionNombre());
		out.println("===ALUMNOS ORDENADOS POR NOTA===");
		f.ordenarPorNota().forEach(out::println);
		
	}

}
