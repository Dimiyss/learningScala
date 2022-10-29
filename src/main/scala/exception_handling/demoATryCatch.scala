package exception_handling

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object demoATryCatch {
  def main(args: Array[String]): Unit = {
//    println("Hello World!")
    try {
      val f = new FileReader("/Users/arhip/IdeaProjects/LearnScala/src/main/scala/exception_handling/input.txt")
      val a = 10/2
      println(a)

      val array1 = Array(10)
      println(array1(11))

    } catch {
        case e: FileNotFoundException => {
          println(s"File not found! Error: $e")
        }
        case e: IOException => {
          println(s"Error While reading file! Error: $e")
        }
        case e: ArithmeticException => {
          println(s"Arithmetic exception received Error: $e")
        }
//        case _: Exception => {  // All exceptions
//          println("Catch all unhandled exception")
//        }
        case e: ArrayIndexOutOfBoundsException => {
          println(s"Handled Array Index Out Of Bounds Exception Error: $e")
        }
    } finally {
      println("It will always be executed irrespective of Exception or not")
    }

  }

}
