


fun main(){
    var worker = Worker("Hòa")
}
class Worker(var firstName : String, var lastName : String){

    constructor(lastName: String) : this("Bùi",lastName){
        println("2nd")
    }

    init {
        println("Hello 1")
    }
    init {
        println("Hello 2")
    }
}