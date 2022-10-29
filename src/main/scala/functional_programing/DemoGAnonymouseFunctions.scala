package functional_programing

object DemoGAnonymouseFunctions {
  def main(args: Array[String]): Unit = {
//    Check if divisible by 3
    val listOfNumbers: List[Int] = List(0,1,2,3,4,5,6,7,8,9,10,11,12)
    listOfNumbers.foreach(num => println(s"Number $num is divisible by 3 - ${divisibleByThree(num)}"))
    listOfNumbers.foreach(num => if (divisibleByThreeAnonymous(num)) println(s"Number $num is divisible by 3"))
//    var outputDivisibleResult = listOfNumbers.filter(x => x%3==0)
    val outputDivisibleResult = listOfNumbers.filter(_%3==0)
    println(outputDivisibleResult)
  }
//  Traditional Way
  def divisibleByThree (x: Int): Boolean = {
    x % 3 == 0
  }
//  Anonymous Function
  val divisibleByThreeAnonymous: (Int => Boolean) = x => x % 3 == 0
//
}
