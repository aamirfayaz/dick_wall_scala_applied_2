import java.time.LocalDate

case class Car(make: String, model: String, year: Int) {
  lazy val isVintage: Boolean =
    LocalDate.now.getYear - year > 20
}

val mustang = Car.apply("Ford", "Mustang", 1965)

mustang.make
mustang.model
mustang.year
mustang.isVintage

mustang == Car("Ford", "Mustang", 1965)
mustang == Car("Ford", "Mustang", 1964)

mustang eq Car("Ford", "Mustang", 1965)

/**
eq is instance equality in Scala,
while == always calls .equals
 */

/*
import java.time.LocalDate

class Car(val make: String, val model: String, val year: Int) {
  lazy val isVintage: Boolean =
    LocalDate.now.getYear - year > 20
}

val mustang = new Car("Ford", "Mustang", 1965)

mustang.make
mustang.model
mustang.year
mustang.isVintage

mustang == new Car("Ford", "Mustang", 1965) // false
mustang == new Car("Ford", "Mustang", 1964)
*/
