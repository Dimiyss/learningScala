package array

object DemoCArray {
  def main(args: Array[String]): Unit = {
    println("Hello")
//    reduceLeft
    var marks = Array(12, 12, 34, 6, 46, 66, 78, 88, 8)
    var avg = marks.reduceLeft((x, y) => {
      println(s"x = $x, y = $y, avg = " + (x+y)/2)
      (x+y)/2
    })

    var avg3 = marks.reduceLeft(_/2+_/2)

    println(avg)
    println(avg3)

    var totalMarks = marks.reduceLeft(_+_)
    println(s"Total Marks is $totalMarks")

    var maxMarks = marks.reduceLeft(_ max _)
    println(s"Max Marks is $maxMarks")

    var minMarks = marks.reduceLeft(_ min _)
    println(s"Max Marks is $minMarks")

    val avg5 = marks.reduceRight(_/2 + _/2)
    println(avg5)
  }
}
