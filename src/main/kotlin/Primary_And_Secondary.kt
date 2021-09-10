


fun main(){
    val hoa1 = Person("Bùi","Hòa",21)

    val hoa2 = Person("Hòa",21)

    val hoa3 = Person("Hòa")

}
class Person constructor(var firstName : String, var lastName : String,
                         var age : Int = 0){

    constructor(lastName: String, age: Int) : this("Hòa",lastName,age){
        println("2nd")
    }
    constructor(lastName: String) : this(lastName,21){
        println("3rd")
    }
    fun printInfo(){
        println("$firstName $lastName")
    }
    fun updateName(newName : String){
        lastName = newName
    }
}