3.- Implementar el siguiente ejercicio:

a. Definir la anotación RUNTIME llamada @Servidor que se utiliza para anotar una clase que funcionará como un servidor HTTP. Esta anotación debe poseer los siguientes atributos:

&ensp; ● dirección – indica la dirección IP a la cual se conectarán los clientes.

&ensp; ● puerto – indica el puerto donde espera las conexiones de los clientes.

&ensp; ● archivo – indica el archivo en el que se guardará la información de login.

b. Definir la anotación RUNTIME llamada @Invocar que se utiliza para marcar el o los métodos de clase que deben ser invocados cuando un cliente se conecta al servidor.

c. Utilice las anotaciones previamente definidas para anotar una clase cualquiera.

d. Implementar una clase llamada Contenedor que procese la clase anotada para escuchar peticiones de red en la IP y puerto especificados y luego delegar la atención de las mismas en los métodos de la clase anotada. La clase Contenedor al recibir una petición deberá realizar dos tareas:

&ensp; ● Loguear Fecha, Hora e IP del cliente en un archivo de texto cuyo nombre se indicó en la anotación @Servidor

&ensp; ● Invocar a todos los métodos que fueron anotados con la anotación @Invocar

e. Pruebe el servidor HTTP creado en los incisos anteriores con un navegador de Internet.