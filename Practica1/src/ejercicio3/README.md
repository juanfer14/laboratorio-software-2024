3.- Respecto de los constructores, analice los siguientes casos:

3.1.- Escriba 3 subclases de la clase Vacuna(definida en el punto 1) llamadas VacunaPatogenoIntegro, VacunaSubunidadAntigenica y VacunaGenetica con las siguientes variables de instancias:

● VacunaPatogenoIntegro: define una variable de instancia destinada para el nombre del virus patógeno inactivado o atenuado.

● VacunaSubunidadAntigenica: define 2 variables de instancia, una para guardar la cantidad de antígenos de la vacuna y la otra para mantener el tipo de proceso llevado a cabo.

● VacunaGenetica: define dos variables de instancia, una para la temperatura mínima y otra para la temperatura máxima de almacenamiento.

a) Implemente los getters y setters para cada una de las variables de instancias anteriores.

b) Implemente los constructores para las clases anteriores, todos ellos deben recibir los parámetros necesarios para inicializar las variables de instancia propias de la clase donde están definidos.

c) ¿Pudo compilar las clases? ¿Qué problemas surgieron y por qué? ¿Cómo los solucionó?

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

<ins>Nota</ins>: Recuerde que en la url <https://docs.oracle.com/en/java/javase/19/docs/api/> tiene disponible al documentación de la API de java
