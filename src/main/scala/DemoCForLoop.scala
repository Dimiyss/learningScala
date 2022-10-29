import scala.util.control.Breaks

object DemoCForLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(s"value of i is $i")
    }

    for (i <- 1 until 10) {
      println(s"value of i using until is $i")
    }
    println("=================================Nested For Loop====================================")
    for (i <- 1 to 10) {
      for (j <- 1 to 10) {
        println(s"Value of is $i, value of j is $j")
      }
    }
    println("=====================================================================================")
  // Nested for loop - Scala
    for (i <- 1 to 10; j <- 1 to 10; k <- 1 to 10) {
      println(s"Value of is $i, value of j is $j value of k is $k")
    }
    println("==============================For Loop for Collections==================================")
//    List - similar to Arrays. List is immutable.
    var numbersList = List(1,2,3,4,5,6,7,8,9,10)

    for (i <- numbersList) {
      println(s"Value of i is $i")
    }
    println("==============================For Loop for Collections with filter==================================")
    var numbersList2 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i <- numbersList2 if i%2 == 0; if i != 4) {
      println(s"Value of i is $i")
    }

    println("==============================For Loop for Collections with filter with YIELD==================================")
    var numbersList3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var evenNumberList = for (i <- numbersList3 if i % 2 == 0) yield i
    println(evenNumberList)

//    Break statement
    println("===============================For Loop for Collections with filter and Break============================================")
    var numbersList4 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val breakObject = new Breaks;

    breakObject.breakable {
      for (i <- numbersList4 if i % 2 == 0) {
        println(s"Value of i is $i")

        if (i == 4) {
          println("I am break at 4")
          breakObject.break
        }
      }
    }

  }

}
