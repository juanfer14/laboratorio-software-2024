package ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Prueba {
	
	public static void generarArchivo(Class<?> mapeo, Object obj) {
		if(mapeo.isAnnotationPresent(Archivo.class)) {
			
			Archivo archivo = mapeo.getAnnotation(Archivo.class);
			String nombreArchivo = archivo.name();
			String nombreClase = mapeo.getSimpleName();
			if(nombreArchivo.isEmpty())
				nombreArchivo = nombreClase + ".txt";
			
            String directorioActual = System.getProperty("user.dir");
            directorioActual = directorioActual + "/PracticaLabo/Practica5/ejercicio2/";
            
			File file = new File(directorioActual + nombreArchivo);
			
			
			
			try {
				if(!file.exists())
					file.createNewFile();
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("<nombreClase>"+nombreClase+"</nombreClase");
				
				for(Field field: mapeo.getDeclaredFields()) {
					if(field.isAnnotationPresent(AlmacenarAtributo.class)) {
						field.setAccessible(true);
						String nombreAtributo = field.getName();
						Object valorAtributo = field.get(obj);
						bw.newLine();
						bw.write("<nombreAtributo>"+nombreAtributo+"</nombreAtributo>");
						bw.newLine();
						bw.write("<nombreValor>"+valorAtributo+"</nombreValor>");
					}
				}

				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapeado objMapeado = new Mapeado();
		Class<Mapeado> mapeado = Mapeado.class;
		MapeadoSinNombre objMapSinNombre = new MapeadoSinNombre();
		Class<MapeadoSinNombre> mapSinNombre = MapeadoSinNombre.class;
		
		generarArchivo(mapeado, objMapeado);
		generarArchivo(mapSinNombre, objMapSinNombre);
		
	}

}
