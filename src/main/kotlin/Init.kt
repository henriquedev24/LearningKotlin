class Animal_(var especie:String){
    var fala: String = ""
    init {
        fala = if(especie.lowercase() == "cão"){
            "auau"
        }else if (especie.lowercase() == "gato"){
            "miau"
        }else{
            ""
        }
    }
    init {
        println(fala)
    }
    fun falar(){
        println(fala)
    }
}

fun main(){
    val animal = Animal_("cão")
    Animal_("gato")
    Animal_("cão")
}