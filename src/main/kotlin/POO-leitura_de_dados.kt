class Pessoa (val ano_nasc: Int, var nome:String){
    var idade = 2023 - ano_nasc
    fun saudar(){
        println("Bem vindo ${this.nome}")
    }
    fun acordar(x: Boolean){
        if(x == true) {
            println("O ${this.nome} está acordado")
        }else{
            println("${this.nome} está dormindo")
        }
    }
}

fun main(){
    println("Ano de nascimento:")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Nome completo:")
    var y = readln()
    println("Tá acordado?")
    var d = readlnOrNull()?.toBoolean() ?: false
    var pessoa: Pessoa = Pessoa(x, y )
    println(pessoa.ano_nasc)
    println(pessoa.nome)
    println("Você tem ${pessoa.idade} anos")
//        if( d == "sim" || d == "SIM" || d == "Sim") pessoa.acordar(true) else if(d == "não" || d == "NÃO" || d == "Não") {
//            pessoa.acordar(false)
//        }



}



















