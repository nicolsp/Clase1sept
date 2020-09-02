package com.example.clase1sept


  /*  fun main() {
        val func = operation()
        println(func(3))
        val cube = cube(3, func)
        println(cube)
    }
    fun operation():(Int)-> Int{
        return ::square
    }
    fun square(x: Int) = x * x
    fun cube(x: Int, operation: (x: Int) -> Int): Int {
        return square(x) * x
    }

*/
/*
fun main() {
      val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}
      val upperCase2: (String) -> String = {str -> str.toUpperCase()}
      val upperCase3 = {str:String -> str.toUpperCase()}

      val upperCase5: (String) -> String = {it.toUpperCase()}

      val upperCase6: (String) -> String = String::toUpperCase

      println(upperCase1("esto en minuscula"))
      println(upperCase2("esto en minuscula"))
      println(upperCase3("esto en minuscula"))
      println(upperCase5("esto en minuscula"))
      println(upperCase6("esto en minuscula"))

  }

*/
/*
fun main(){
    val numers = listOf(10, 9, 1,-1,23,3,-4,5,6)
    val words = listOf("lets" , "find","something", "in", "someHow")

    val natural10orden = numers.sorted()
    val inverted = numers.sortedBy {   -it}
    println(natural10orden)

    println(inverted)
}
*/
fun main(){
      val list: MutableList<Libro> = mutableListOf(
          Libro("algo","ASSDSD"), 300, 100.000, "YOLITO",
          1956,"SANTILLANA", "d"))
      )
  }

data class  Libro(val name:String,
                   val isbn : String,
        val pages: Int ,
                val price: Double,
                  val author: String,
                  val publishYear:Int,
                  val editorial: String,
                  val type: Char)
 */