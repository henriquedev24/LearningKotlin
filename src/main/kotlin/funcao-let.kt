fun main() {
    var str:String? = null
    str = "Biel"
    if(str != null){
        println("Caiu IF")
    }
    str?.let {
        println("Caiu na fun let")
    }
}