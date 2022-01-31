abstract class Car {
  def color: String
  def describe: String = s"$color"
  override def toString = s"$describe car"
}

trait Classic extends Car {
  def vintage: Int
  override def describe: String =
    s"vintage $vintage ${super.describe}"
}

trait Convertible extends Car {
  override def describe: String =
    s"convertible ${super.describe}"
}

trait PoweredConvertible extends Convertible {
  override def describe: String =
    s"powered ${super.describe}"
}

trait HardtopConvertible extends Convertible {
  override def describe: String =
    s"hard-top ${super.describe}"
}
class ClassicCar(val color: String, val vintage: Int) extends Car with Classic
val ccc =
  new ClassicCar("red", 1965) with PoweredConvertible with HardtopConvertible