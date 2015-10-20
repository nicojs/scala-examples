package polymorfism

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}

/**
 * Represents a ListTest
 * Created by nicojs
 */
class ListTest extends FlatSpec with GivenWhenThen with Matchers {

  "Add" should "return new cons object" in {
    Cons(5, Cons(6, Nil)).toString() should be("5, 6")
  }

  "{23, 2, 1}" should "contain 23, 2 and 1" in{
    val list = Cons(23, Cons(2, Cons(1, Nil)))
    list.contains(1) should be (true)
    list.contains(23) should be (true)
    list.contains(2) should be (true)
  }

  it should "not contain 5" in{
    val list = Cons(23, Cons(2, Cons(1, Nil)))
    list.contains(5) should be (false)
  }

  "{23, 5} union {32}" should "construct {23, 5, 32}" in {
    val list = Cons(23, Cons(5, Nil)).union(Cons(32, Nil))
    list.toString should be ("23, 5, 32")
  }

  "{23, 5} map +1" should "construct {24, 6}" in {
    val list = Cons(23, Cons(5, Nil))
    list.map(x => x+1).toString should be ("24, 6")
  }


  "[1,2,3,4].reverse" should "be [4,3,2,1]" in{
    Cons(1, Cons(2, Cons(3, Cons(4, Nil)))).reverse.toString should be ("4,3,2,1")
  }

}
