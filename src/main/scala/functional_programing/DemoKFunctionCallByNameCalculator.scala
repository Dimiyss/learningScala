package functional_programing

object DemoKFunctionCallByNameCalculator {
    def main(args: Array[String]): Unit = {
      println(s"Value addition of 5 and 2 is: ${calculator(add, 5, 2)}")
      println(s"Value substruction of 5 and 2 is: ${calculator(sub, 5, 2)}")
      println(s"Value multiplication of 5 and 2 is: ${calculator(mul, 5, 2)}")
      println(s"Value quotient of division of 5 and 2 is: ${calculator(div, 5, 2)}")
      println(s"Value reminder of division of 5 and 2 is: ${calculator(rem, 5, 2)}")
    }

    def calculator(m:(Int, Int) => Int, x: Int, y:Int): Int = {
      m(x, y)
    }

    val add: (Int, Int) => Int = _ + _
    val sub: (Int, Int) => Int = _ - _
    val mul: (Int, Int) => Int = _ * _
    val div: (Int, Int) => Int = _ / _
    val rem: (Int, Int) => Int = _ % _
}
