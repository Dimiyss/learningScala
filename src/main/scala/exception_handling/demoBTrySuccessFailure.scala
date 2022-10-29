package exception_handling

import scala.annotation.unused
import scala.util.Try
import scala.util.Success
import scala.util.Failure


object demoBTrySuccessFailure {

  def main(args: Array[String]): Unit = {
    val a = Try(10/0)

    a match {
      case Success(value) => println(value)
      case Failure(exception) => errorHandlingFunction(exception)
    }
  }

  def errorHandlingFunction(exception: Throwable): Unit = {
    println(exception)
    if (exception.toString.equals("java.lang.ArithmeticException: / by zero")) {
      println("Test eeee")
    }
  }
}
