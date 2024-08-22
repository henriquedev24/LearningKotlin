import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo() {
    val arquivo = File("C:\\Users\\PAULO\\gabriel\\aprend-kotlin\\src\\main\\kotlin\\tratamento-de-exceçoes3.kt")
    try {
        Scanner(arquivo).use { l ->
            while(l.hasNext()){
                println(l.next())
            }
            l.close()
        }

    }catch (e: FileNotFoundException){
        println("Falha ao ler arquivo")
    }
}

fun main() {
    ler_arquivo()

}