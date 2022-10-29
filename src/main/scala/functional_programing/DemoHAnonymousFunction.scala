package functional_programing

object DemoHAnonymousFunction {
  def main(args: Array[String]): Unit = {
    val listOfNumbers: List[Int] = List(0,1,2,3,4,5,6,7,8,9,10,11,12)
    println(listOfNumbers)
//    Use Map
    val squareOfNumbers = listOfNumbers.map(square)
    println(squareOfNumbers)

    val squareOfNumbersA = listOfNumbers.map(x => x * x)
    println(squareOfNumbersA)

//    Not allowed for one input argument (_ * _ ) expect two inputs
//    val squareOfNumbersB = listOfNumbers.map(_*_)
//    println(squareOfNumbersB)
    val doubleNumbers = listOfNumbers.map(_*2)
    println(doubleNumbers)
  }
// Traditional Way
//  def square(x: Int): Int = {
//    x * x
//  }
// Anonymous Function
  val square: Int => Int = x => x * x
}
