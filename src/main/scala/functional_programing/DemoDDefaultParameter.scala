package functional_programing

object DemoDDefaultParameter {
  def div(x: Int = 5, y: Int = 1): Double = {
    println(s"x = $x")
    println(s"y = $y")
    return x / y.toDouble
  }

  def main(args: Array[String]): Unit = {
    println(div(2,3))

    println(div(2,0))

    println(div(2))

    println(div(y=2))
  }

}
