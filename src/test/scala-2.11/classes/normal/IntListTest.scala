package classes.normal

import org.scalatest.{Matchers, GivenWhenThen, FlatSpec}

/**
 * Represents a IntListTest
 * Created by nicojs
 */
class IntListTest extends FlatSpec with GivenWhenThen with Matchers{


  "Add" should "return new cons object" in{
    new Cons(5, new Cons(6, Nil)).toString() should be ("5, 6, nil")
  }

  "{23, 2, 1}" should "contain 23, 2 and 1" in{
    val list = new Cons(23, new Cons(2, new Cons(1, Nil)))
    list.contains(1) should be (true)
    list.contains(23) should be (true)
    list.contains(2) should be (true)
  }

  it should "not contain 5" in{
    val list = new Cons(23, new Cons(2, new Cons(1, Nil)))
    list.contains(5) should be (false)
  }

  "{23, 5} union {32}" should "construct {23, 5, 32}" in {
    val list = new Cons(23, new Cons(5, Nil)).union(new Cons(32, Nil))
    list.toString should be ("23, 5, 32, nil")
  }

  "{23, 5} map +1" should "construct {24, 6}" in {
    val list = new Cons(23, new Cons(5, Nil))
    list.map(x => x+1).toString should be ("24, 6, nil")
  }
}
