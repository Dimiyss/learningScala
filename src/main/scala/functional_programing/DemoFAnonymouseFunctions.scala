package functional_programing

object DemoFAnonymouseFunctions {
  def main(args: Array[String]): Unit = {
    println(s"Increment Function output is: ${increments2(5)}")
    printHelloWorld()
    printHelloWorldAnon()
    println(s"Summ func result = ${summ(3, 2)}")
    println(s"SummA func result = ${summA(3, 2)}")
  }

  //  def increments(x: Int): Int = {
  //    x + 1
  //  }
  var increments: Int => Int = (x: Int) => x + 1

  var increments2: (Int => Int) = (x => x + 1)

//  Example 2 Anonymous Function with 0 input an 0 output parameter:
//  Normal Func
  def printHelloWorld(): Unit = {
  println("Hello World!")
}
//  Anonymouse Func
  var printHelloWorldAnon = () => println("Hello World Anonymouse!")

//  Example 3 Anonymous Function with 2 input an 01 output parameter:
//  Normal Func
  def summ(x: Int, y:Int): Int = {
    x + y
  }
//  Anonymouse Func
  var summA = (x: Int, y: Int) => x + y

}
