interface InterfaceProperties {
    val a : Int
    val b : String
        get() = "Hello"
}

interface InterfaceMethods {
    fun description()
    fun sayHello(name : String) : String{
        return "Hello $name"
    }
}

class MultipleInterface : InterfaceProperties, InterfaceMethods {
    override val a : Int
        get() = 50

    override fun description()
    {
        println("Multiple Interfaces implemented with $a and $b")
    }

    override fun sayHello(name: String) : String{
        return "${super.sayHello(name)} have been overrided"
    }
}
fun main()
{
    val obj = MultipleInterface()
    obj.description()
    println(obj.sayHello("Hòa"))
}
