4.- Redefina las clases del ejercicio 6 de la práctica 1 de manera que las figuras se puedan serializar.

a) ¿Cómo se serializa un objeto? ¿Con qué fin?

__Implementando la interface 'java.io.Serializable'. Con el fin de convertir un objeto en una secuencia de bytes (serializacion) y luego recuperarla (deseralizar) para obtener el objeto original.__

b) ¿Qué relación tiene con el serialVersionUID? Analice su impacto al modificar la implementación de las clases.

__El fin del atributo 'serialVersionUID' en una clase que implementa 'java.io.Serializable' es el de mantener comptabilidad entre un objeto serializado y las diferentes modificaciones que se realicen sobre la clase.__

__Si ya tenia un objeto serializado, por ejemplo de Circulo, y agrego una nueva variable de instancia para el mismo, no voy a tener problemas a la hora de deserealizar este objeto, si el 'serialVersionUID' que contiene matchea al de la clase modificada.__

__Si el 'serialVersionUID' del objeto serializado fuera diferente, entonces no habria comptabilidad con la clase original.__
