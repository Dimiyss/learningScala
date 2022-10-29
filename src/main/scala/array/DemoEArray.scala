package array
import Array._

object DemoEArray {
  def main(args: Array[String]): Unit = {
    var marks1 = Array(5,6,8,9,2,4,6)
    var marks2 = Array(5,9,2,6,4,2,6)

    var  allMarks = concat(marks1, marks2)

    allMarks.foreach(print)
    println(" ")

    var rollNo = range(1, 101)
    rollNo.foreach(print)

    println(" ")

    var rollNox = range(2, 101, 2)
    rollNox.foreach(x => print(s"$x, "))
  }
}
