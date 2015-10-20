package javainterop

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}

/**
 * Represents a BoekTest
 * Created by nicojs
 */
class LibraryTest extends FlatSpec with GivenWhenThen with Matchers {

  "when 'getBoeken' is called" should "retrieve 3 mapped boeken" in {
    new Library().getBoeken.size should be(3)
  }

  "boek one" should "have authors Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides" in{
    new Library().getBoeken.get(0).getAuteurs should be ("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")
  }

  it should "have price be 3788" in{
    new Library().getBoeken.get(0).getPrijsInCenten should be (3788)
  }

  it should "have publisher Addison-Wesley" in{
    new Library().getBoeken.get(0).getUitgever should be ("Addison-Wesley")
  }
}
