package array

object DemoFArray {
  def main(args: Array[String]): Unit = {
    var marks1 = Array(5, 8, 9)
    var marks2 = Array(5, 9, 7)
    var marks3 = Array(5, 9, 4)

    var marks = Array(marks1, marks2, marks3)

    marks.foreach(x => println(x.foreach(print)))

    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        print(marks(row)(column) + " ")
      }
      println()
    }
  }

}
