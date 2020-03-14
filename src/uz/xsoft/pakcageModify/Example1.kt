package uz.xsoft.pakcageModify

/**
 *  Note fun, class, interface larga protected modifiers berib bolmas ekan
 */

fun main() {
    exampleFunPrivate()
}

public fun exampleFunPublic(){ }

private fun exampleFunPrivate(){ }

internal fun exampleFunInternal(){  }

public class exampleClassPublic(){ }

private class exampleClassPrivate(){ }

internal class exampleClassInternal(){ }

public interface exampleInterPublic { }

private interface exampleInterPrivate { }

internal interface exampleInterInternal { }