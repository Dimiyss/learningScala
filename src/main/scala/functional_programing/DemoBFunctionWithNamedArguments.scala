package functional_programing

object DemoBFunctionWithNamedArguments {
    def sum(x: Int, y: Int): Int = {
      println(s"x = $x")
      println(s"y = $y")
      return (x + y)
    }

    def main(args: Array[String]): Unit = {
    var z = sum(y=2, x=3)
    println(z)
  }

}
