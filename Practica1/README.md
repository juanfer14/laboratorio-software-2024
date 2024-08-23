# Practica1 
1.- Escriba una clase llamada Vacuna con 4 variables de instancia: marca, país de origen, enfermedad que previene y cantidad de dosis. Implemente los getters y setters para cada una de las variables de instancias anteriores.

a) Sobre-escriba el método toString() de Object, para ello declare una variable local de tipo StringBuffer y utilícela para concatenar cada uno de los datos de la vacuna y retorne un objeto String con los datos del mismo.

b) Escriba el método main() en la clase TestVacuna, donde se debe crear un arreglo con 5 objetos Vacuna inicializados, para luego recorrer el arreglo e imprimir en pantalla los objetos guardados en él.

c) Comente el método toString() escrito en la clase Vacuna y vuelva a ejecutar el programa. ¿Cuál es la diferencia entre b) y c)? 

d) Cree otro objeto de tipo Vacuna y compárelo con el anterior. ¿Qué método de Object es utilizado para la comparación por contenido?.

e) Ejecute la aplicación fuera del entorno de desarrollo. ¿Para que se utiliza la variable de entorno CLASSPATH?

f) Construya un archivo jar con las clases anteriores, ejecútelo desde la línea de comandos. ¿Dónde se especifica en el archivo jar la clase que contiene el método main?

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
