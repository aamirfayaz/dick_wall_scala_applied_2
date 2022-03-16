case class Person(firstName: String, lastName: String)

val person = Person("aamir", "fayaz")

{
  import person._
  firstName == "aamir"
  lastName == "fayaz"

}

//firstName == "aamir"