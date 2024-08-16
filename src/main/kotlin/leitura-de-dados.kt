fun main() {
    val s = readLine()
    var num = readLine()?.toInt() ?: 0
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble() ?: 0.0
    var num4 = readlnOrNull()?.toFloat() ?: 0.0f
    var num5 = readlnOrNull()?.toBoolean() ?: true
    println("String $s")
    println("Int $num")
    println("Int $num2")
    println("Double $num3")
    println("Float $num4")
    println("Boolean $num5")
}