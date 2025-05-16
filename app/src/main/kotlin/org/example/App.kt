package org.example

// Etapa 1: Estructura Básica y Definición de Coeficientes
fun main() {
    // Definimos los coeficientes de la función cuadrática ax² + bx + c
    val a = 1.0
    val b = -3.0
    val c = 2.0
    
    // Verificar que sea una función cuadrática válida
    if (a == 0.0) {
        println("El coeficiente 'a' no puede ser cero. La función no es cuadrática.")
        return
    }
    
    // Mostrar función y tabla de valores
    println("Función cuadrática: f(x) = ${formatearFuncion(a, b, c)}")
    
    // Etapa 3: Calcular y mostrar las raíces
    calcularYMostrarRaices(a, b, c)
    
    // Etapa 2: Mostrar tabla de valores
    mostrarTablaValores(a, b, c, -5, 5)
}

// Etapa 2: Cálculo de Valores de la Función
/**
 * Calcula el valor de la función cuadrática para un valor x dado
 */
fun calcularFuncionCuadratica(x: Double, a: Double, b: Double, c: Double): Double {
    return a * x * x + b * x + c
}

/**
 * Formatea la representación de la función cuadrática como string
 */
fun formatearFuncion(a: Double, b: Double, c: Double): String {
    val resultado = StringBuilder()
    
    // Formatear coeficiente a
    if (a == 1.0) {
        resultado.append("x²")
    } else if (a == -1.0) {
        resultado.append("-x²")
    } else {
        resultado.append("${a}x²")
    }
    
    // Formatear coeficiente b
    if (b != 0.0) {
        if (b > 0) {
            resultado.append(" + ")
            if (b == 1.0) {
                resultado.append("x")
            } else {
                resultado.append("${b}x")
            }
        } else {
            resultado.append(" - ")
            if (b == -1.0) {
                resultado.append("x")
            } else {
                resultado.append("${-b}x")
            }
        }
    }
    
    // Formatear coeficiente c
    if (c != 0.0) {
        if (c > 0) {
            resultado.append(" + $c")
        } else {
            resultado.append(" - ${-c}")
        }
    }
    
    return resultado.toString()
}

/**
 * Muestra una tabla de valores de la función
 */
fun mostrarTablaValores(
    a: Double,
    b: Double,
    c: Double,
    inicio: Int,
    fin: Int
) {
    val lineaSeparadora = "=" * 30
    println("\nTABLA DE VALORES")
    println(lineaSeparadora)
    println("    x    |    f(x)    ")
    println(lineaSeparadora)
    for (x in inicio..fin) {
        val fx = calcularFuncionCuadratica(x.toDouble(), a, b, c)
        printf("   %2d    |   %6.2f   \n", x, fx)
    }
    println(lineaSeparadora)
}

// Etapa 3: Cálculo de Raíces
/**
 * Calcula el discriminante de la función cuadrática
 */
fun calcularDiscriminante(a: Double, b: Double, c: Double): Double {
    return b * b - 4 * a * c
}

/**
 * Calcula y muestra las raíces de la función cuadrática
 */
fun calcularYMostrarRaices(a: Double, b: Double, c: Double) {
    val discriminante = calcularDiscriminante(a, b, c)
    
    println("\nANÁLISIS DE RAÍCES")
    println("=" * 30)
    println("Discriminante: $discriminante")
    
    when {
        discriminante > 0 -> {
            // Dos raíces reales distintas
            val raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a)
            val raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a)
            
            println("La función tiene dos raíces reales distintas:")
            println("x₁ = %.2f".format(raiz1))
            println("x₂ = %.2f".format(raiz2))
            println("La parábola corta al eje X en dos puntos.")
        }
        discriminante == 0.0 -> {
            // Una raíz real (raíz doble)
            val raiz = -b / (2 * a)
            
            println("La función tiene una raíz real doble:")
            println("x = %.2f".format(raiz))
            println("La parábola es tangente al eje X en un punto.")
        }
        else -> {
            // No tiene raíces reales
            val parteReal = -b / (2 * a)
            val parteImaginaria = Math.sqrt(-discriminante) / (2 * a)
            
            println("La función no tiene raíces reales.")
            println("Raíces complejas:")
            println("x₁ = %.2f + %.2fi".format(parteReal, parteImaginaria))
            println("x₂ = %.2f - %.2fi".format(parteReal, parteImaginaria))
            println("La parábola no corta al eje X.")
        }
    }
    println("=" * 30)
}

/**
 * Función auxiliar para formatear la salida con printf
 */
fun printf(format: String, vararg args: Any) {
    print(String.format(format, *args))
}

/**
 * Operador de repetición para cadenas
 */
operator fun String.times(n: Int): String {
    return this.repeat(n)
}