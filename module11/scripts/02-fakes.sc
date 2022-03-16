case class Person(id: Int, name: Option[String])
val person1 = Person(1, Some("aamir"))
val person2 = Person(2, None)
val person3 = Person(3, Some("zahid"))
val person4 = Person(4, Some("caiser"))
val person5 = Person(5, None)

val pList = List(person2, person4, person5, person1, person3)
pList.filter(_.name.isDefined).sortWith(_.name.getOrElse("").toLowerCase < _.name.getOrElse("").toLowerCase)


 def abc(doSearch: Option[String], nameIn: Option[String]) = {
  val t: (Option[String], Option[String]) = (doSearch, nameIn)
   t.productIterator.toList.
}