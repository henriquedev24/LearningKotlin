import java.util.Scanner

fun lerInt(){
    val scanner = Scanner(System. `in`)
    println("Digite número inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}

fun lerDouble(){
    val scanner = Scanner(System. `in`)
    println("Digite número double: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}

fun lerString(){
    val scanner = Scanner(System. `in`)
    println("Digite nome: ")
    val num = scanner.next()
    println("Você digitou: ${num}")
}

fun lerFloat(){
    val scanner = Scanner(System. `in`)
    println("Digite número float: ")
    val num = scanner.nextFloat()
    println("Você digitou: ${num}")
}

fun main(){
    lerInt()
    lerDouble()
    lerString()
    lerFloat()
    lerBoolean()
}

fun lerBoolean(){
    val scanner = Scanner(System. `in`)
    println("Digite valor boolean: ")
    val num = scanner.nextBoolean()
    println("Você digitou: ${num}")
    scanner.close()
}