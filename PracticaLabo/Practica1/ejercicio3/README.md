3.- Respecto de los constructores, analice los siguientes casos:

3.1.- Escriba 3 subclases de la clase Vacuna(definida en el punto 1) llamadas VacunaPatogenoIntegro, VacunaSubunidadAntigenica y VacunaGenetica con las siguientes variables de instancias:

● VacunaPatogenoIntegro: define una variable de instancia destinada para el nombre del virus patógeno inactivado o atenuado.

● VacunaSubunidadAntigenica: define 2 variables de instancia, una para guardar la cantidad de antígenos de la vacuna y la otra para mantener el tipo de proceso llevado a cabo.

● VacunaGenetica: define dos variables de instancia, una para la temperatura mínima y otra para la temperatura máxima de almacenamiento.

a) Implemente los getters y setters para cada una de las variables de instancias anteriores.

b) Implemente los constructores para las clases anteriores, todos ellos deben recibir los parámetros necesarios para inicializar las variables de instancia propias de la clase donde están definidos.

c) ¿Pudo compilar las clases? ¿Qué problemas surgieron y por qué? ¿Cómo los solucionó?

__Al principio no, ya que compile directamente los *.java de la carpeta 'ejercicio3', pero ademas se debe compilar los *.java de la carpeta 'ejercicio1' (en este caso Vacuna.java)__

3.2.- El siguiente código, define una subclase de java.awt.Dialog. Verifique si compila. Si no lo hace implemente una solución.

~~~
package laboratorio;
import java.awt.Dialog;
public class Dialoguito extends Dialog {
  public Dialoguito() {
    System.out.println(“Dialoguito”) ;
  }
}
~~~

<ins>Nota</ins>: Recuerde que en la <a href="https://docs.oracle.com/en/java/javase/19/docs/api/">url</a> tiene disponible al documentación de la API de java

**El codigo como esta no compila, es necesario agregarle como parametro un 'Frame' al constructor de Dialoguito y pasarselo a 'Dialog' a traves de super()**

3.3.- Las clases definidas a continuación establecen una relación de herencia. La implementación dada, ¿es correcta?.

<ins><b>Constructores privados</b></ins>

~~~
package laboratorio;
public class SuperClase {
  private SuperClase() {
  }
}

package laboratorio;
public class SubClase extends SuperClase {
  public SubClase() {
  }
}
~~~

__No, ya que SubClase no puede instanciar SuperClase, porque su constructor es privado__

<ins><b>Constructores protegidos</b></ins>

~~~
package laboratorio;
public class SuperClase{
  protected SuperClase(){
  }
}

package laboratorio1;
public class SubClase extends SuperClase {
  public SubClase() {
  }
}

package laboratorio1;
public class OtraClase {
  public OtraClase() {
  }
  public void getX() {
    new SuperClase();
  }
}
~~~

__En ambas clases (SubClase y OtraClase) no se importa 'SuperClase' por lo tanto no se sera posible compilar los archivos__