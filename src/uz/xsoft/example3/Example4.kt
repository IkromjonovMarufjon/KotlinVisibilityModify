package uz.xsoft.example3

fun main() {
    val ob = Info()
    val a = A()
    a.abs()
}

open class Info {
    protected val message : String = "Message"
    protected fun show(){  }
}

class A : Info() {
    fun abs() {
        message
        show()
    }
}

