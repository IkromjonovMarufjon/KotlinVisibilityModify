package uz.xsoft.packageModify2

import uz.xsoft.pakcageModify.exampleClassInternal
import uz.xsoft.pakcageModify.exampleClassPublic
import uz.xsoft.pakcageModify.exampleFunInternal
import uz.xsoft.pakcageModify.exampleFunPublic

fun main() {

    // Classlar bitta packageda priate korinmaydi
    val ob1 = exampleClassInternal()
    val ob2 = exampleClassPublic()

    // funcsiyalar privayte korinmaydi
    exampleFunInternal()
    exampleFunPublic()

    //interface uchun ham private korinmaydi qolgan hammasi korinadi
}

//private class sinov : exampleClassPrivate(){
//
//}


