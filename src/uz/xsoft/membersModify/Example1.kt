package uz.xsoft.membersModify

private fun main() {
    val person = Person()
    println(person.name)
    println(person.age)
    println(person.showInfo())
//    bu methodlar korinmaydi
//    println(person.lastName)
//    println(person.phoneNumber)
}

/**
 *  Protected bilan private bir xil boladi final class uchun, biz biror maydonga protected bersak ogohlantiradi
 *
 *  final bolmagan class uchun farqlidir
 */
open class Info (
        public var  name : String,
        private var  lastName : String,
        protected var  phoneNumber : String,
        internal var  age : Int
){

}

class Person : Info("John","_","+9989_ ___ __ __",12) {

    fun showInfo(){
        name = "Ma'ruf"
        age = 25
        phoneNumber = "+9989 * *** ** **"
    }
}