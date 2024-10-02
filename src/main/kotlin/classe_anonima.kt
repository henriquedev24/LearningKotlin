
interface  Evento{
    fun ok(){

    }
}

class Program{
    fun salvar(e:Evento){
        println("Abrindo arquivos")
        println("Salvando dados")
        e.ok()
    }
}


fun main(){
    val p:Program = Program()
    p.salvar(object : Evento {
        override fun ok() {
            println("salvando evento")
        }
    })
}