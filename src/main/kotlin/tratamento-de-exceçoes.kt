import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 2
    try {
        val res = (numerador / denominador)
        println("Resultado da divisão: $res")
    } catch (e: ArithmeticException) {
        println("Erro: Não existe divisão")
    }
    val numero = 5.5
    try {
        val res2 = sqrt(numero)
        if (numero < 0) {
            throw IllegalArgumentException()
        }
        println("Resultado da radiciação: $res2")
    }finally {

    }
}
