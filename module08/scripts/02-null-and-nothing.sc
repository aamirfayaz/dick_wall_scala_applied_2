val s1: String = "hello"

s1.charAt(1)

val s2: String = null

val s:Null = null


 // val n: Nothing = throw new Exception("")
//val n: Nothing = null CTE
//val nu: Null = n

// NullPointerException...
// s2.charAt(1)

s1.isInstanceOf[String]
s2.isInstanceOf[String] // coz null means absence of instance.



val emptyList: List[Nothing] = List.empty
val str: List[String] = emptyList

1 :: emptyList
"hello" :: emptyList

def fail(msg: String): Nothing =
  throw new IllegalStateException(msg)
//Nothing has no instance, exists only to complete type system
val r: Double = if(true) 11.2 else fail("")