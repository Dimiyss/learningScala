object DemoAIfElse {
  def main(args: Array[String]): Unit = {
    val x = 2

    if (x > 5) {
      println("x is greater than five")
    } else {
      println("x is less or equal five")
    }

    if (x == 1) {
      println("x is equal to 1")
    } else if (x == 2) {
      println("x is equal two")
    } else if (x == 3) {
      println("x is equal three")
    } else {
      println("x is greater than 3")
    }
  }
}
