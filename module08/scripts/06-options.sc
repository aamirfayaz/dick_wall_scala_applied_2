val s1: String = "hello"
val s2: String = null

s1.length
// will compile but throws an exception
// s2.length

val os1: Option[String] = Some("hello")
val os2: Option[String] = None

// will no longer compile
// os1.length

os1.map(_.length)
os2.map(_.length)

val numWords = Map(1 -> "onxxz", 2 -> "two", 3 -> "three")
numWords(1)
// numWords(4)

val word1 = numWords.get(1)
val word2 = numWords.get(4)

word1 match {
  case Some(word) => word
  case None => "unknown"
}

word2.getOrElse("unknown")

val r: String = "helloworld".drop(4)

def fourthLetter(i: Int): Option[Char] =
  for {
    word <- numWords.get(i)
    char <- word.drop(4).headOption
  } yield char

val x1 = fourthLetter(1)
val x2 = fourthLetter(3)
val x3 = fourthLetter(2)



def fourthLetters(nums: Seq[Int]): Seq[Char] =
  for {
    i <- nums
    word <- numWords.get(i).toSeq //toSeq optional
    char <- word.drop(4).headOption.toSeq //toSeq optional
  } yield char

fourthLetters(List(1, 2, 3))

Some(10).toSeq

val l = List(Some(1), None, Some(2),None)
l.flatten

val res0 = List(1,2,3).map { index =>
  numWords.get(index).map { str =>
    str.drop(4).headOption
  }
}

val res1 = List(1,2,3).flatMap { index =>
  numWords.get(index).map { str =>
    str.drop(4).headOption
  }
}

val res2 = List(1,2,3).flatMap { index =>
  numWords.get(index).flatMap { str =>
    str.drop(4).headOption
  }
}

