package org.ejercicio3

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class Carrera(val total: Int) {
    var llegaron = 0
    var puesto = 0
    val podio: MutableList<Int> = ArrayList()


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

    fun podioFinal(){
        for(i in 0..total-1)
            println("Corredor#${podio.get(i)}, puesto#${i+1}")
    }

    @Synchronized
    fun puesto(id: Int){
        puesto += 1
        podio.add(id)
        if(puesto == total) {
            puesto = 0
            podioFinal()
        }

    }



}

fun main(args: Array<String>){
    val total = 5
    val exec = Executors.newFixedThreadPool(total)
    val carrera = Carrera(total)
    for(i in 1..total){
        exec.execute {
            var nro = i
            var metros = 100
            println("Corredor#${nro} listo para empezar")
            carrera.esperar()
            while (metros > 0){
                metros -= (10..12).random()
                if(metros > 0) {
                    TimeUnit.SECONDS.sleep(1)
                    println("Corredor#${nro} esta a ${metros} de la meta")
                }
            }
            carrera.puesto(nro)

        }
    }
    exec.shutdown()
}

