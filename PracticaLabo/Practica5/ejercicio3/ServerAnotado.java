package ejercicio3;

@Servidor(direccion="127.0.0.1", puerto=8080, archivo="log.txt")
public class ServerAnotado {
	
	@Invocar
	public static void saludo() {
		System.out.println("Conexion establecida");
	}
	
	@Invocar
	public static void presentacion() {
		Servidor servidor = ServerAnotado.class.getAnnotation(Servidor.class);
		System.out.println(servidor.direccion() + " " +  servidor.puerto() + " " + servidor.archivo());
	}
	
	public static void otro() {
		System.out.println("otro metodo no ejecutado");
	}
}
