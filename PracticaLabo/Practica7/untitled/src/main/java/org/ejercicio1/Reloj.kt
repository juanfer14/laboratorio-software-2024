package org.ejercicio1

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import java.util.concurrent.Executors
import kotlinx.coroutines.*

class Reloj {
    private val formato = DateTimeFormatter.ofPattern("HH:mm:ss")
    private var disponible = true

    @Synchronized
    fun hora(){
        if(!disponible)
            (this as java.lang.Object).wait()
        disponible = false
        println(LocalTime.now().format(formato))
        TimeUnit.SECONDS.sleep(1)
        disponible = true
        (this as java.lang.Object).notify()
    }
}

fun tiempoThreads(formato: DateTimeFormatter){
    thread() {
        for(i in 1..60){
            var lt = LocalTime.now().format(formato)
            println(lt)
            TimeUnit.SECONDS.sleep(1)
        }
    }
}

fun tiempoExecutors(formato: DateTimeFormatter){
    // Es equivalente a crear un pool de 1 solo thread -> newFixedThreadPool(1)
    val executorService = Executors.newSingleThreadExecutor()
    for(i in 1..60){
        executorService.execute {
            var lt = LocalTime.now().format(formato)
            println(lt)
            TimeUnit.SECONDS.sleep(1)
        }

    }
}

suspend fun mostrar(formato: DateTimeFormatter) = coroutineScope {

}

fun tiempoCorrutinas(formato: DateTimeFormatter) = runBlocking {
    for(i in 1..60){
        launch {
            var lt = LocalTime.now().format(formato)
            println(lt)
            TimeUnit.SECONDS.sleep(1)
        }

    }
}

fun tiempoClaseReloj(){
    val reloj = Reloj()
    for (i in 1..60){
        thread {
            reloj.hora()
        }
    }
}

fun main() {
    val formato = DateTimeFormatter.ofPattern("HH:mm:ss")
    tiempoClaseReloj()
}
