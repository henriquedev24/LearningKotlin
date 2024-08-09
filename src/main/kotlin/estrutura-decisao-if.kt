fun main(){
    var idade:Int = 20
    if(idade>=60){
        println("Idoso")
    }else if(idade<=59 && idade>=60){
        println("Adulto")
    }else if(idade<=20 && idade>=13){
        println("Jovem")
    }
    else{
        println("Criança")
    }
}