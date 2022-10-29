package traits_valueclass_universaltrait

trait CarE extends Any {
  def print(): Unit = {println(this)}
}

class MercedesE(val x:Int) extends AnyVal with CarE {
  def hello(): Unit = {
    println("Hello!")
  }
}

object DemoETrait {
  def main(args: Array[String]): Unit = {
    val m1 =new MercedesE(5)
    m1.print()
    m1.hello()
  }
}
