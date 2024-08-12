fun main() {
    var i:Int = 0
    for(i in 1..10){
        println("${i}")
    }
    while(i<=10){
        println("${i} ")
        i++ //i = i+i
    }
    println("\n")
    while(i>=0){
        println("${i} ")
        i--
    }
}