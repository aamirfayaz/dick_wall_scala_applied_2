trait Car {
  def color: String
  def describe: String = s"$color car"
}

val mustang = new Car {
  val color = "red"
}

mustang.describe

class ActualCar(val color: String, val name: String) extends AnyRef with Car

val modelT = new ActualCar("black", "Model T")

modelT.describe

val car: Car = modelT

car.describe

class Demo extends Car with Function1[String, String] {
  override def color = "red"
  override def apply(v1: String): String = s"$v1 $color"
}

val demo: Demo = new Demo
val demo2:String => String = new Demo

demo("cherry")

val descriptionLength = demo.andThen(_.length)

descriptionLength("cherry")

//with traits we implement a little, and get a lot
class MyCollection[T] extends Traversable[T] {
  override def foreach[U](f: T => U): Unit = {
    ()
  }
}