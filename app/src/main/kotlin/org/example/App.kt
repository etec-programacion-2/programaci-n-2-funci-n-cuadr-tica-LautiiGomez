package org.example

// Etapa 1: Estructura Básica y Definición de Coeficientes

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0
    
    if (a == 0.0) {
        println("El coeficiente 'a' no puede ser cero. La función no es cuadrática.")
        return
    }
    
    println("La función cuadrática es igual a f(x) = ${a}x² + ${b}x + $c")
    
}

