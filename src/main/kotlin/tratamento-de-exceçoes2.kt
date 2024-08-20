import java.lang.NullPointerException
import kotlin.math.sqrt

fun main() {
    try {
        var s: String? = null
//        s= "Gabriel"
        println("O tam. da String é: ${s!!.length}")

        var a:Int = 10/0
        println("O resultado da divião é: $a!")

        var b = -9.0
        var c:Double = sqrt(b)
            if (b<0){
                throw IllegalArgumentException()
            }
        var x = 1
            if (x==1){
                throw Exception("O valor de x não é 1")
            }
    }catch (e: NullPointerException){
        println("A variável ta vazia")
    }catch (e: ArithmeticException){
        println("Nao existe essa divisão")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo")
    }catch (e: Exception){
        print("Exceção geral:")
        println(e.message)
    }finally {
        println("Executando o Finnaly, finalizando bloco de dados")
    }
    println("Continuando....")
}