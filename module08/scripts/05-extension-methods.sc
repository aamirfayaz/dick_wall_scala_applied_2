implicit class TimesDo(val i: Int) extends AnyVal {
 // val id:Int = 10, field definition not allowed in Value classes, as no instance to hold it.
  def times(fn: => Unit): Unit = {
    for (_ <- 1 to i) fn
  }
}

5 times {
  println("hello")
}

4 times println("hi")

new TimesDo(4) times println("bye")

val xs: List[Nothing] = List.empty
val ys: List[Boolean] = List.empty
xs == Nil
ys == xs
ys == Nil

