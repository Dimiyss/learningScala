package traits_valueclass_universaltrait

trait Car {
  def engine(): Unit = {
    println("Engine is 1000 CC")
  }
  def break()

  def tyres ()
}

class Mersedes extends Car {

  def break (): Unit = {
    println("Disk Breaks")
  }

  def tyres(): Unit = {
    println("4 Tyres")
  }
}

object DemoATraits {
  def main(args: Array[String]): Unit = {
//    println("Hello World!")
    val m1 = new Mercedes
    m1.engine()
    m1.break()
    m1.tyres()
  }

}
