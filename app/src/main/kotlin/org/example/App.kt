package org.example

// Etapa 1: Estructura Básica y Definición de Coeficientes

fun main() {
    val a: Int = 5
    val b: Int = 3
    val c: Int = -2

    if (a == 0) {
        println("El valor de 'a' no puede ser cero. No es una función cuadrática.")
        return
    }

    val funcion = funcionCuadratica(a, b, c)
    println("La función ingresada es: $funcion")
}

fun funcionCuadratica(a: Int, b: Int, c: Int): String {
    return "${a}x² + ${b}x + $c"
}