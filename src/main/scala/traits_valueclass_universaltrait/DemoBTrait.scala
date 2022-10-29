package traits_valueclass_universaltrait

trait CarB {
  def engine(): Unit = {
    println("Engine is 1000 CC in a Car")
  }
  def break()

  def tyres (): Unit = {
    println("4 Tyres is present in Car")
  }
}

trait FourWheelerB {
  def tyres():Unit = {
    println("4 Tyres is present in Four Wheeler")
  }
}

class Mercedes extends CarB with FourWheelerB {

  def break (): Unit = {
    println("Disk Breaks in Mercedes")
  }

  override def tyres(): Unit = super.tyres()

}


object DemoBTrait {
  def main(args: Array[String]): Unit = {
    //    println("Hello World!")
    val m1 = new Mercedes
    m1.engine()
    m1.break()
    m1.tyres()
  }
}
