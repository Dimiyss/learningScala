package traits_valueclass_universaltrait

abstract class Vehicle {
  def category()
}

trait CarC {
  var x = 1000
  val t = 4
  def engine(): Unit = {
    println(s"Engine is $x CC in a Car")
  }
  def break()

  def tyres (): Unit = {
    println(s"$t Tyres is present in Car")
  }
}

trait FourWheelerC {
  def tyres():Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}

class MercedesC extends Vehicle with FourWheelerC with CarC {
  x = 2000
  override val t = 6

  def break (): Unit = {
    println("Disk Breaks in Mercedes")
  }

  override def tyres(): Unit = super.tyres()

  override def category(): Unit = {
    println("It is Mercedes")
  }

  override def engine(): Unit = {
    println(s"Engine of Mercedes is $x CC")
  }

}


object DemoCTrait {
  def main(args: Array[String]): Unit = {
    //    println("Hello World!")
    val m1 = new MercedesC
    m1.engine()
    m1.break()
    m1.tyres()
    m1.category()
  }
}
