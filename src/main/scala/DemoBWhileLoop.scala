object DemoBWhileLoop {
  def main(args: Array[String]): Unit = {

    var x = 12

    while (x < 10) {
      println(s"Value of x is $x")
      x = x + 1
    }

    x = 12
    do {
      println(s"Value of x from do-while is $x")
      x = x + 1
    } while (x < 10)

  }
}
