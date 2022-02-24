def addDoubles(a: Double, b: Double): Double = a + b

val a: Int = 7
val b: Int = 2

addDoubles(a, b)  // no need to convert - types are widened automatically

def addInts(a: Int, b: Int): Int = a + b

// addInts(1.0, 2.0)  // but only one way, have to explicitly narrow types
addInts(1.0.toInt, 2.0.toInt)

// Rich wrappers:

val d1: Double = -1.5
val d2 = 1.5

d1.abs
d1 min d2
d1 max d2

d1.floor
d2.ceil
d2.round

val str = "hello"
str.reverse
str.toSeq
str.slice(2, 4)


// @specialized to avoid unwanted boxing (but don't overuse)
def sumOf[@specialized(Int, Double, Long) T: Numeric](items: T*): T = {
  val numeric: Numeric[T] = implicitly[Numeric[T]]
  items.foldLeft(numeric.zero)(numeric.plus)
}

/*def sumOf[T](items: T*)(implicit n: Numeric[T]): T = {
  val numeric = implicitly[Numeric[T]]
  items.foldLeft(numeric.zero)(numeric.plus)
}*/

sumOf(1,2,3)

// Don't do this, just tuple them instead...
def pair[@specialized T, @specialized U](t: T, u: U): (T, U) = (t, u)

pair(1,2)

trait Foo[@specialized(Int) A, @specialized(Int,Double) B] { }


trait Foo[@specialized A] { }
/*
A specialized template parameter here gets expanded/rewritten
for 9 different primitive types
  ( void, boolean, byte, char, int, long, short, double, float ).
    So, basically you end up with 20 classes instead of 2.*/
