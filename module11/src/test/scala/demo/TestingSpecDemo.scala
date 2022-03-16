package demo

import org.scalacheck.Prop.{forAll, propBoolean}
import org.scalatest._
import org.scalatest.prop.PropertyChecks

import scala.collection.immutable
class TestingSpecDemo extends FunSpec with Matchers with PropertyChecks {/*
  describe ("Property checks") {
  they ("should ensure abs on all Ints returns a positive number") { forAll { (i: Int) =>
    whenever(i != Int.MinValue) { i.abs should be >= 0
    }
  }
  }
}*/
  import org.scalacheck.Gen


  val validChars: immutable.Seq[Char] = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')
  val char: Gen[Char] = Gen.oneOf(validChars)

   val strGen: Gen[String] = for {
    n <- Gen.choose(0, 30) // 0 to 30 length strings
    seqChars <- Gen.listOfN(n, char)
     _= println(seqChars)
  } yield {
    seqChars.mkString
  }

  describe ("Property checks and generators") {
    they ("should test .reverse.reverse on any string gives you back original") {
      forAll(strGen) { str =>
        println(str)
        str.reverse.reverse should be (str)
      }
    }
  }
}

class TestScalaCheck extends FlatSpec {
/*  import org.scalacheck.Gen

       val myGen = for {
      n <- Gen.choose(10,20)
      m <- Gen.choose(2*n, 500)
    } yield (n,m)

      //println(myGen.sample)


  val validChars: immutable.Seq[Char] = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')
  val char: Gen[Char] = Gen.oneOf(validChars)

  val propConcatLists = forAll { (l1: List[Int], l2: List[Int]) =>
    l1.size + l2.size == (l1 ::: l2).size }
  propConcatLists.check

  val propSqrt = forAll { (n: Int) => scala.math.sqrt(n*n) == n }
  propSqrt.check*/


  import org.scalacheck._
  import org.scalacheck.Gen

/*  val smallInteger = Gen.choose(0,100)

  val propSmallInteger = Prop.forAll(smallInteger) { n =>
    println("n is :" + n)
    n >= 0 && n <= 100
  }
  propSmallInteger.check*/

  val validChars: immutable.Seq[Char] = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')
  val char: Gen[Char] = Gen.oneOf(validChars)

  val r = Gen.listOfN(10, char)
  println(r.sample)

}

