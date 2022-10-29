package traits_valueclass_universaltrait

// if you extends by CarD, you should extend FourWheelerD and VehicleD

abstract class VehicleD {
}

trait CarD {
  this: FourWheelerD with VehicleD => {

  }
}

trait FourWheelerD {
}

class MercedesD extends VehicleD with FourWheelerD with CarD {
}


object DemoDTrait {
  def main(args: Array[String]): Unit = {
    //    println("Hello World!")
    val m1 = new MercedesD

  }
}
