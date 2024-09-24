package Praktikum3

class OuterA {
    val a = "Outside Nested class."
    inner class Inner {
        fun callMe() = a
    }
}
fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
}
