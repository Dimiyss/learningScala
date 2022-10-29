package functional_programing

object DemoIFunctionCallByName {
  def main(args: Array[String]): Unit = {
    printValue(increment())
    printValue(decrement())
  }

  def printValue(m: => Int): Unit = {
    println(s"Value is: ${m}")
  }

  def increment(): Int = {
    var i = 2
    println(s"Input $i")
    var z = i + 1
    println(s"After increment is: $z")
    z
  }

  def decrement(): Int = {
    var i = 2
    println(s"Input $i")
    var z = i - 1
    println(s"After decrement is: $z")
    z
  }

}
