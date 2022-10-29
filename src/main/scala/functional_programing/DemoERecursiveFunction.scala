package functional_programing

object DemoERecursiveFunction {

  def factorial(n: Int): Int = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

  def main(args: Array[String]): Unit = {
    var fact = factorial(5)
    println(fact)
  }

}
