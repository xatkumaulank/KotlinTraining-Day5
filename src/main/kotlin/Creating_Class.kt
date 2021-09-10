


fun main(){
    val hoa = User()
    hoa.firstName = "Bùi"
    hoa.middleName = "Huy"
    hoa.lastName = "Hòa"
    hoa.printInfo()
    hoa.updateName("Hòaaaa")
    hoa.printInfo()

    val hoa2 = Person("Bùi","Hòa")
    hoa2.printInfo()
    hoa2.updateName("Hòaaaa")
    hoa2.printInfo()
}
class User{
    var firstName : String = ""
    var middleName : String = ""
    var lastName : String = ""

    fun printInfo(){
        println("$firstName $middleName $lastName")
    }
    fun updateName(newName : String){
        lastName = newName
    }
}
