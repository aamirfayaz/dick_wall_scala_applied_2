val flag = true  // could be false...

if (flag) 1.0 else ()  // Double + Unit = AnyVal

if (flag) 1.0  // implicit Unit, Double + Unit = AnyVal

if (flag) "hi" // implicit Unit, String + Unit = Any

if (flag) "Hello" else null // String + Null = String

if (flag) 2.0 else null // Double + Null = Any

def fail(msg: String): Nothing =
  throw new IllegalStateException(msg)

if (flag) 2.0 else fail("not 2.0") // Double + Nothing = Double

if (flag) "yo" else fail("no yo") // String + Nothing = String

trait Fruit //extends Product with Serializable

case class Apple(name: String) extends Fruit
case class Orange(name: String) extends Fruit

//Left to its own devices, Scala will often infer more than you need:

val app = Apple("kashmiri")
app.productArity
case class Person(name: String, address: String)
val p = Person("neo", "adam's street")



val xs: Fruit = if(true) Apple("kashmiri") else Orange("bhojpuri")
val ys = if(true) Apple("kashmiri") else Orange("bhojpuri")
val xsq: Product with Serializable with Fruit = if(true) Apple("kashmiri") else Orange("bhojpuri")
val x: List[Product with Serializable with Fruit] = List(Apple("fiji"), Orange("Jaffa"))
val xxs: Seq[Any] = List(Apple("fiji"), Orange("Jaffa"))

def fail(message: String): Unit = {
  println(message)
  System.exit(1)
  throw new Exception("")
}

