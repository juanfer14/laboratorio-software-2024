package org.ejercicio3

import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class CarreraCallable(val total: Int) {
    var llegaron = 0
    var puesto = 0


    @Synchronized
    fun esperar(){
        llegaron++
        if(llegaron < total) {
            (this as java.lang.Object).wait()
        }
        else {
            llegaron = 0
            (this as java.lang.Object).notifyAll()
        }
    }


    @Synchronized
    fun puesto(): Int {
        puesto += 1
        var miPuesto = puesto
        if (puesto == total)
            puesto = 0
        return miPuesto
    }
}

fun main(){
    val total = 5
    val exec = Executors.newFixedThreadPool(total)
    val carrera = CarreraCallable(total)

    val corredores = List(total) {
        nro -> Callable<String>{
            val nro = nro+1
            var metros = 100
            println("Corredor#${nro} listo para empezar")
            carrera.esperar()
            while (metros > 0){
                metros -= (10..12).random()
                if(metros > 0) {
                    TimeUnit.SECONDS.sleep(1)
                    println("Corredor#${nro} esta a ${metros} de la meta")
                }
                var lesion = (1..20).random()
                if(lesion == 10){
                    throw Exception("Corredor#${nro} se lesiono")
                }
            }
            val puesto = carrera.puesto()
            "Corredor#${nro}, posicion#${puesto}"
       }
    }

    val res: List<Future<String>> = exec.invokeAll(corredores)

    res.forEach({
        try {
            println(it.get())
        } catch (e: Exception){
            println(e.cause?.message)
        }

    })

    exec.shutdown()
}


