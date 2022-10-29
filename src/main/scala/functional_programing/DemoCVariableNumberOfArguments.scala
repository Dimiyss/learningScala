package functional_programing

object DemoCVariableNumberOfArguments {

  def printMultipleTimes(n: Int, args: String*): Unit = { // String* means you are defining Array[String]
    for (arg <- args) {
      println( arg * n)
    }
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(3, "Hello", "World", "India", "Singapore")
  }

}
