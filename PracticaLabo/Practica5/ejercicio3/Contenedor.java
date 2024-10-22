package ejercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.sun.net.httpserver.HttpServer;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Contenedor implements HttpHandler {
	
	public static String archivoLog;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<ServerAnotado> serverAnotado = ServerAnotado.class;
		Servidor servidor = serverAnotado.getAnnotation(Servidor.class);
		int puerto = servidor.puerto();
		String direccion = servidor.direccion();
		archivoLog = servidor.archivo();
		HttpServer server;
		try {
			server = HttpServer.create(new InetSocketAddress(direccion, puerto),0);
			server.createContext("/applications/myapp", new Contenedor());
			server.setExecutor(null);
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void loguear(HttpExchange exchange) {
		// Logueando informacion del cliente
		
		String directorioActual = System.getProperty("user.dir");
        directorioActual = directorioActual + "/Practica5/ejercicio3/";
        
        
        try {
			File file = new File(directorioActual + archivoLog);
			if(!file.exists())
				file.createNewFile();
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String ipRemota = exchange.getRemoteAddress().getAddress().getHostAddress();
			// Obtén la fecha y hora actuales
	        LocalDateTime fechaHoraActual = LocalDateTime.now();

	        // Formatea la fecha y la hora
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        // Imprime la fecha y la hora en el formato deseado
	        String fechaHoraFormateada = fechaHoraActual.format(formato);
	        
			bw.write(fechaHoraFormateada + " " + ipRemota);
			bw.newLine();
			bw.close();
			
        } catch(IOException e) {
        	e.printStackTrace();
        }

	}
	
	private void invocarMetodos() {


		Class<ServerAnotado> serverAnotado = ServerAnotado.class;
		for(Method m: serverAnotado.getDeclaredMethods()) {
			if(m.isAnnotationPresent(Invocar.class)) {
				try {
					m.invoke(null);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		// TODO Auto-generated method stub
		
		// Loguea la informacio de la conexion
		loguear(exchange);
		// Invoca a los metodos de la clase 'ServerAnotado'
		invocarMetodos();
		
		
		InputStream is = exchange.getRequestBody();
		is.read(); // .. lee el request body
		String response = "Esta es la respuesta";
		exchange.sendResponseHeaders(200, response.length());
		OutputStream os = exchange.getResponseBody();
		os.write(response.getBytes());
		os.close();
		
	}

}
