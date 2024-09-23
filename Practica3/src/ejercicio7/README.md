7.- Declaración e implementación de Tipos Enumerativos

a) Implemente un tipo enumerativo llamado Notas que define los valores de las notas musicales y con su correspondiente cifrado americano (almacenado en un String).

b) Implemente un tipo enumerativo llamado FrecuenciasDeLA que represente las siguientes frecuencias estándares de afinación:

● 440 Hz: Organización Internacional de Estandarización ISO 16.

● 444 Hz: Afinación de cámara.

● 446 Hz: Renacimiento.

● 480 Hz: Órganos alemanes que tocaba Bach.

c) Sobrecargue los métodos hacerSonar() y afinar() de la interface InstrumentoMusical del ejercicio 1b) de la práctica 2 de manera que el nuevo hacerSonar(Notas n, int duracion) reciba como parámetro una nota musical y una duración, y el nuevo método afinar(FrecuenciaDeLA f) reciba como parámetro una frecuencia de LA.

d) Defina una clase llamada Piano que implemente la interface InstrumentoMusical y una clase TestPiano que permita probar los métodos implementados.

e) Implemente el patrón de diseño Singleton mediante un tipo Enumerativo el cual represente a Fito Páez. Fito cuenta con un instrumento musical (piano) y en algún momento se le puede pedir que toque una canción (especificando un arreglo de notas musicales con sus tiempos).