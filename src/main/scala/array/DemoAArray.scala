package array

object DemoAArray {
  def main(args: Array[String]): Unit = {
//    var num: Array[Int] = new Array[Int](3)
//    num.foreach(i => println(i))
//
//    val num1 = Array(1, 2, 4, 5, 5, 9)
//    num1.foreach(i => print(i))

    var marks = Array(56,36,18,21,345,6,788,9,5,3)

    for (mark <- marks) {
      println(mark)
    }
//    Average marks (Scala way)
    var totalMarks = 0
    var averageMarks = 0
    for (mark <- marks) {
      totalMarks = totalMarks + mark
    }
    averageMarks = totalMarks / marks.length
    println(s"Average marks is $averageMarks")

  //    Average marks (Scala way)
    totalMarks = 0
    averageMarks = 0
    for (i <- marks.indices) {
      totalMarks = totalMarks + marks(i)
    }
    averageMarks = totalMarks / marks.length
    println(s"Average marks is $averageMarks")
//    map and foreach

}
}
