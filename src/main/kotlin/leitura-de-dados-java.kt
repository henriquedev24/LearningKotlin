import java.util.Scanner

fun ler_int(){
    var scanner = Scanner(System. `in`)
    println("Digite número inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}

fun ler_double(){
    val scanner = Scanner(System. `in`)
    println("Digite número double: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}

fun ler_string(){
    val scanner = Scanner(System. `in`)
    println("Digite nome: ")
    val num = scanner.next()
    println("Você digitou: ${num}")
}

fun ler_float(){
    val scanner = Scanner(System. `in`)
    println("Digite número float: ")
    val num = scanner.nextFloat()
    println("Você digitou: ${num}")
}

fun main(){
    ler_int()
    ler_double()
    ler_string()
    ler_float()
    ler_boolean()
}

fun ler_boolean(){
    val scanner = Scanner(System. `in`)
    println("Digite valor boolean: ")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
    scanner.close()
}