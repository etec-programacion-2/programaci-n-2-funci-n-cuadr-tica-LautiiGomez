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
    
    println("Función cuadrática: f(x) = ${formatearFuncion(a, b, c)}")
    
    mostrarTablaValores(a, b, c, -5, 5)
}

//  Etapa 2: Cálculo de Valores de la Función

fun calcularFuncionCuadratica(x: Double, a: Double, b: Double, c: Double): Double {
    return a * x * x + b * x + c
}

fun formatearFuncion(a: Double, b: Double, c: Double): String {
    val resultado = StringBuilder()
    
    resultado.append("${a}x²")
    
    if (b >= 0) {
        resultado.append(" + ${b}x")
    } else {
        resultado.append(" - ${-b}x")
    }
    
    if (c >= 0) {
        resultado.append(" + $c")
    } else {
        resultado.append(" - ${-c}")
    }
    
    return resultado.toString()
}

fun mostrarTablaValores(
    a: Double, 
    b: Double, 
    c: Double, 
    inicio: Int, 
    fin: Int
) {
    val lineaSeparadora = "=" * 30
    
    println(lineaSeparadora)
    println("   x   |   f(x)   ")
    println(lineaSeparadora)
    
    for (x in inicio..fin) {
        val fx = calcularFuncionCuadratica(x.toDouble(), a, b, c)
        printf("  %2d   |  %6.2f  \n", x, fx)
    }
    
    println(lineaSeparadora)
}

fun printf(format: String, vararg args: Any) {
    print(String.format(format, *args))
}

operator fun String.times(n: Int): String {
    return this.repeat(n)
}