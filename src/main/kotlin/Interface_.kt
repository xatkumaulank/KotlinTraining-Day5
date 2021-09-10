interface InterfaceProperties {
    val a : Int
    val b : String
        get() = "Hello"
}

interface InterfaceMethods {
    fun description()
}

class MultipleInterface : InterfaceProperties, InterfaceMethods {
    override val a : Int
        get() = 50

    override fun description()
    {
        println("Multiple Interfaces implemented with $a and $b")
    }
}
fun main()
{
    val obj = MultipleInterface()
    obj.description()
}
