3. Implemente una aplicación que simule una carrera de 100 metros, donde cada participante está representado por un objeto thread. Para ello, cree un programa que muestre por consola la cantidad de metros recorrida por cada corredor.
   
a.- Use un ejecutor con un pool de tamaño 5 para ejecutar. Luego cambie el tamaño del pool a 3 y observe la ejecución de los threads.

b.- Supongamos que se quiere saber si un corredor abandona la carrera, retornando algún valor predefinido o en el peor de los casos, disparando una excepción. Analice la interface Callable, usando la documentación de la API y observe sus ventajas.

__La ventaja de la API Callable es:__

- Permite manejar en el thread main los valores de retorno de cada uno de los threads. 
- Se puede combinar con la interface Future, para poder obtener posteriormente del thread el valor que devolvio o la excepcion que disparo. 
- Ademas, con la interfaz 'Future' y el metodo 'get()' se limitar el tiempo de ejecucion de un thread, en el caso de que se quede loopeando infinitamente

https://www.geeksforgeeks.org/callable-future-java/
https://hyperskill.org/learn/step/4905#the-advantage-of-using-callable-and-future