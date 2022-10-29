package array

object DemoBArray {
  def main(args: Array[String]): Unit = {
    var marks = Array(56, 36, 18, 21, 345, 6, 788, 9, 5, 3)
    //    foreach and map
    for (mark <- marks) {
      println(mark)
    }

    marks.foreach(println)

    //  Average marks
    var totalMarks = 0

    for (mark <- marks) {
      totalMarks = totalMarks + mark
    }
    var averageMarks = totalMarks / marks.length
    println(s"Average marks is $averageMarks")


    totalMarks = 0
//    marks.foreach(mark => totalMarks = totalMarks + mark)
//    marks.foreach(mark => totalMarks += mark)
    marks.foreach(totalMarks += _)
    averageMarks = totalMarks / marks.length
    println(s"Average marks is $averageMarks")

//  MAP

//    var newMarks = marks.map(mark => mark + 10)
    var newMarks = marks.map(_ + 10)
    newMarks.foreach(println)

    var result = for (mark <- marks) yield {mark + 10}
    result.foreach(println)
  }
}
