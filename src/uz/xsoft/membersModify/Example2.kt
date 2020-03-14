package uz.xsoft.membersModify

fun main() {

}

open class Exsample {
    public var a: Int = 0
    private var b: Int = 0
    protected var c: Int = 0
    internal var d : Int = 0

    public inner class InnerPublic()
    private inner class InnerPrivate()
    protected inner class InnerProtected()
    internal inner class InnerInternal()

    public class NestedPublic()
    private  class NestedPrivate()
    protected  class NestedProtected()
    internal  class NestedInternal()
}

class OtherClass : Exsample() {
    init {
        println(a)
//        println(b)   sabab u private
        println(c)
        println(d)
    }

    fun change(){
        a = 2
        c = 3
        d = 4
        println(a)
        println(c)
        println(d)
    }

}