package exception_handling

import exception_handling.demoBTrySuccessFailure.errorHandlingFunction

import scala.util.control.Exception.catching

object demoCCatching {
  def main(args: Array[String]): Unit = {

    val catchExceptions = catching(classOf[ArithmeticException]).withApply(e => errorHandlingFunction(e))

    val a: Unit = catchExceptions(10/0)
    if (a.!=()){
      println(a)
    }

  }

}
