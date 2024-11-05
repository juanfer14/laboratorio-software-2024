2. Analice el siguiente código Kotlin y responda:

```
class TestSynchronized(id: String): Thread(id) {
    var frase: Array<String> = arrayOf("UNLP", "PUBLICA", "AHORA", "Y", "SIEMPRE")
    override fun run(){
        synchronized(System.out){
            for(palabra in frase)
                println("${this.name} : ${palabra} ")
        }
    }
}

fun main(args: Array<String>){
    val t1 = TestSynchronized("Thread 1")
    val t2 = TestSynchronized("Thread 2")
    val t3 = TestSynchronized("Thread 3")
    t1.start()
    t2.start()
    t3.start()
}
```

a.- ¿Cuál es el efecto del synchronized(System.out)?

__El efecto es que el objeto 'System.out' sera utiliza para realizar la sincronizacion de los diferentes hilos, en el acceso al recuro compartido.__

__Se nota ademas, que System.out es

b.- ¿Qué tipo de lock hace el código dado?

__El lock que realiza es de tipo monitor lock.__

Fuente: teoria de la catedra y https://www.baeldung.com/java-synchronized