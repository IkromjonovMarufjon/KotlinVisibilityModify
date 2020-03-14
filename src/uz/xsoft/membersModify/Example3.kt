package uz.xsoft.membersModify

fun main() {
    val ob = OtherExample()
    println(ob)
}

class OtherExample  {
    public var a: Int = 0
    private var b: Int = 0
    protected var c: Int = 0
    internal var d: Int = 0

    public inner class InnerPublic()
    private inner class InnerPrivate()
    protected inner class InnerProtected()
    internal inner class InnerInternal()
}


