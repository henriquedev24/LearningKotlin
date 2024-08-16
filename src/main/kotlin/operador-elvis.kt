fun main(){
    var str:String? = null
    str = "Biel"
    if(str == null){
        println("Nulo")
    }else{
        println(str)
    }
    // Operador Elvis
    println(str ?: "nulo")
}