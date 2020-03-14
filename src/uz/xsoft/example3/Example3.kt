package uz.xsoft.example3

fun main() {
    val car = Car()
    println(car.b)
}

internal class Car(){
    val a = ""
    internal val b ="B"

    fun abs() { }
    internal fun abs1() { }
}

private interface ExampleS{
    fun a()
}

class S : ExampleS {
    override fun a() {
        TODO("Not yet implemented")
    }

}