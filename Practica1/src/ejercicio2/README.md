2.- Analice las siguientes clases y responda cada uno de los incisos que figuran a continuación.

a) Considere la siguiente clase Alpha. ¿Es válido el acceso de la clase Gamma?. Justifique.

~~~
package griego;
class Alpha {
  protected int x;
  protected void otroMetodoA(){
    System.out.println(“Un método protegido”);
  }
}

package griego;
class Gamma {
  void unMétodoG(){
    Alpha a = new Alpha();
    a.x=10;
    a.otroMetodoA();
  }
}
~~~

**Si es valido, ya que los miembros protected son accesibles dentro del mismo paquete, sin necesidad de tener una relacion de herencia**

b) Considere la siguiente modificación de la clase Alpha. ¿Son válidos los accesos en la clase Beta?. Justifique.

~~~
package griego;
public class Alpha {
  public int x;
  public void unMetodoA(){
    System.out.println(“Un Método Público”);
  }
}

package romano;
import griego.*;
class Beta {
  void unMetodoB(){
    Alpha a=new Alpha();
    a.x=10;
    a.unMetodoA();
  }
}
~~~

**Si son validos, porque la clase y sus miembros son publicos**


c) Modifique la clase Alpha como se indica debajo. ¿Es válido el método de la clase Beta?. Justifique.

~~~
package griego;
public class Alpha {
  int x;
  void unMetodoA(){
    System.out.println(“Un mét. paquete”);
  }
}

package romano;
import griego.*;
class Beta {
  void unMetodoB(){
    Alpha a = new Alpha();
    a.x=10;
    a.unMetodoA();
  }
}
~~~

**No es valido, ya que los miembros de Alpha estan defindos en su package**


d) Considere el inciso c) ¿Es válido el acceso a la variable de instancia x y al método de instancia unMetodoA() desde una subclase de Alpha perteneciente al paquete romano?. Justifique.

**No, ya que esos miembros son de alcance package y aunque sea subclase de Alpha, no tendra acceso a esos miembros**

e) Analice el método de la clase Delta. ¿Es válido? Justifique analizando cómo influye el control de acceso protected en la herencia de clases.

~~~
package griego;
public class Alpha {
  protected int x;
  protected void otroMetodoA(){
    System.out.println(“Un método protegido”);
  }
}

package romano;
import griego.*;
public class Delta extends Alpha {
  void unMetodoD(Alpha a, Delta d){
    a.x=10;
    d.x=10;
    a.otroMetodoA();
    d.otroMetodoA();
  }
}
~~~

**Como Delta hereda de una clase que esta en otro paquete, entonces solamente tendra acceso a los miembros publicos y protected. El objeto Alpha, que es de otro paquete, no tiene alcance de sus miembros (tanto atributos como metodos), mientra que el objeto Delta, si, ya que sus miembros (atributos y metodo) son parte del mismo.**
