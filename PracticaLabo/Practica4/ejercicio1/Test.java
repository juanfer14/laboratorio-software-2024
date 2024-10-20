package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a0 = new Alumno("17894/9", "Juan Fernando", "Campodonico", 4144455);
		Alumno a10 = new Alumno("17894/9", "Juan Fernando", "Campodonico", 4144455);
		Alumno a1 = new Alumno("14567/2", "Enrique", "Suarez", 42495333);
		Alumno a2 = new Alumno("21456/3", "Vanesa", "Miglierini", 43217789);
		Alumno a3 = new Alumno("16722/4", "Andes", "Dorado", 44213987);
		Alumno a4 = new Alumno("17821/3", "Camila", "Ledesma", 44514323);
		Alumno a5 = new Alumno("21145/7", "Pedro", "Perez", 42320190);
		Alumno a6 = new Alumno("11245/2", "Karina", "Manes", 42455887);
		Alumno a7 = new Alumno("16223/5", "Lucas", "Thibaut", 41234667);
		Alumno a8 = new Alumno("16775/4", "Mercedes", "Sosa", 41922344);
		Alumno a9 = new Alumno("23347/4", "Leonardo", "Da Vinci", 43787969);
		Materia m = new Materia("CADP");
		m.agregarAlumno(a0);
		m.agregarAlumno(a10);
		m.agregarAlumno(a1);
		m.agregarAlumno(a2);
		m.agregarAlumno(a3);
		m.agregarAlumno(a4);
		m.agregarAlumno(a5);
		m.agregarAlumno(a6);
		m.agregarAlumno(a7);
		m.agregarAlumno(a8);
		m.agregarAlumno(a9);
		
		for(Alumno a: m.getAlumnos())
			System.out.println(a);
	}

}
