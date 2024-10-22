package ejercicio3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Servidor {
	String direccion() default "127.0.0.1";
	int puerto() default 8080;
	String archivo() default "log.txt";
}
