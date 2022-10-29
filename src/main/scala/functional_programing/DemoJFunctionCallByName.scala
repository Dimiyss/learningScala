package functional_programing

object DemoJFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment, 2)
    printValue(decrement, 2)
  }

  def printValue(m:Int => Int, x: Int): Unit = {
    println(s"Value is: ${m(x)}")
  }

  def increment(i: Int): Int = {
//    var i = 2
    println(s"Input $i")
    var z = i + 1
    println(s"After increment is: $z")
    z
  }

  def decrement(i: Int): Int = {
//    var i = 2
    println(s"Input $i")
    var z = i - 1
    println(s"After decrement is: $z")
    z
  }

}
