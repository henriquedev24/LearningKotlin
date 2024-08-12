fun main() {
    var cargo:String = "Estagiário"
    when(cargo){
        "Presidente" -> println(2450f)
        "Gerente" -> println(5000f)
        "Coordenador" -> println(2300f)
        "Analista" -> println(6000f)
        "Estagiário" -> println(1500f)
        else -> println("Não idantificado")
    }

    var id:Float = 25f
    when(id){
        25f -> println("Bem-vindo")
        else -> println("Acesso negado")
    }
}