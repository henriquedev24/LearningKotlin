
private class F(){
    var teste = "Classe F"
}

open class Eletronico(var marca:String){
    private fun ativarCorrente(){

    }
    protected fun relogio(){
        println("Fun relógio")
    }
    fun ligar(){
        println("Ligado")
    }
    fun desligar() {
        println("Desligado")
    }
    var modelo:String = "Teste de herança"
    private var F:String = "Testando..."
}

class Computador(marca:String):Eletronico(marca){
    fun InstalarSoftware(){
        println("Instalando Software no computador")
        relogio()
    }
    fun Varredura(){
        println("Realizando varredura no computador")
        ligar()
        desligar()
    }
}

fun main(){
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.InstalarSoftware()
    println(c.modelo)
    var t:F = F()
    println(t.teste)
}