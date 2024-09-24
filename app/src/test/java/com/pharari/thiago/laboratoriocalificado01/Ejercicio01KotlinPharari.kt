package com.pharari.thiago.laboratoriocalificado01

import org.junit.Test

class Ejercicio01KotlinPharari {
    @Test
    fun main() {
        val palabra = "helLo thiago"  // Definimos la que queremos dividir
        val frecuencia = contarFrecuenciaCaracteres(palabra)  // Llamamos a la función para contar la frecuencia de caracteres
        println(frecuencia)  // Imprimimos las frecuencias de los caracteres
    }

    fun contarFrecuenciaCaracteres(palabra: String): Map<Char, Int> {
        val frecuencia = mutableMapOf<Char, Int>()  // Creamos un mapa mutable para almacenar la frecuencia de cada carácter

        for (caracter in palabra) {  // Recorremos cada carácter de la palabra
            if (caracter != ' ') {  // Si el carácter no es un espacio en blanco, continuamos
                frecuencia[caracter] = frecuencia.getOrDefault(caracter, 0) + 1  // Si el carácter ya está en el mapa, incrementamos su valor; si no, lo añadimos con valor 1
            }
        }

        return frecuencia  // Devolvemos el mapa con la frecuencia de cada carácter
    }



}