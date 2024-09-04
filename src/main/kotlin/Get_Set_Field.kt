// Função SET - Atribui um valor ao campo correspondente.
// Função GET - Retorna um valor ao campo correspondente.
// Função FIELD - Evita chamadas infinitas.

class Planeta(var nome:String){
    private var id= 1
    var tamanho = 1000
    var fala = "Terra"
    var fala2 = "Marte"
        get(){
            println("Acessando GET")
            return field
        }
        set(value){
            println("Acessando SET")
            field = value
        }
}

class Planeta2{
    var nome: String = ""
        get() {
            println("Meu valor É $field")
            return field
        }
        set(value) {
            if (value == ""){
                println("Muitos tem nome")
            }else{
                field = value
            }
        }
}

fun main() {
    var p: Planeta = Planeta("Terra")
    println("Imprimindo o tamanho ${p.tamanho}")
    var a: Planeta = Planeta("Marte")
    a.fala2
    var c: Planeta2 = Planeta2()
    c.nome = ""
}