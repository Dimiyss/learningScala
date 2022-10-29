package array
import scala.collection.mutable.ArrayBuffer

object DemoGArray {
  def main(args: Array[String]): Unit = {
    var marks = ArrayBuffer[Int]()
    println("Start")
    marks +=10
    marks += 6
    marks += 3

    marks.foreach(println)
    println("Next")
    marks += 5

    marks.foreach(println)
    println("Next")

    marks.append(7)
    marks.append(7)

    marks ++= Array(4, 5, 7, 8, 9, 11)
    marks.foreach(println)


    println("Remove")
    marks -= 5

    marks.foreach(println)
  }

}
