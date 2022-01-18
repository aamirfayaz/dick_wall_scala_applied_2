abstract class Vehicle(val name: String, val age: Int) {
  override def toString: String =
    s"$name, $age years old"
}

class Car(
  override val name: String, //override becoz name is already in Vehicle, so name clash
  val make: String,
  val model: String,
  override val age: Int
) extends Vehicle(name, age) {

  override def toString: String =
    s"a $make $model, named ${super.toString}"
}

val mustang = new Car("Sally", "Ford", "Mustang", 50)
 mustang.name

class Car2(
   name: String, //works as they are private and don't conflict with name fields from Vehicle
  val make: String,
  val model: String,
   age: Int
) extends Vehicle(name, age) {
  //it has public name and age from Vehicle

  val x = this.name // private name
  val y = name // private name
  println("x = " + x)
  println("y = " + y)
  override def toString: String =
    s"a $make $model, named ${super.toString}"
}
val mustang2 = new Car2("Sally", "Ford", "Mustang", 50)
mustang2.name
