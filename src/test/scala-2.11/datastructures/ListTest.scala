package datastructures

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}


/**
 * Represents a ds
 * Created by nicojs
 */
class ListTest extends FlatSpec with GivenWhenThen with Matchers {
  val names = List("Sylvia", "Jeanette", "Natalie", "Fiene",
    "Elsje", "Treesje", "Truus", "Babbette", "Betsie", "Sabine",
    "Greet", "Magreet", "Magriet", "Marie", "Marije", "Angeline",
    "Wies", "Marjan", "Marjo", "Marlyn", "Tine")


  //How many names are there
  "names" should "have length 21" in {
    names.length should be(21)
  }

  //  Make a list of the length of the names
  "List of names mapped to the length function" should "yield in a list with the length of the names" in {
    names.map(_.length) should contain(7)
  }

  //  What is the total length?
  "Total length of list of names" should "yield 126" in {
    (names :\ 0) ((x, n)=>x.length + n) should be(126)
    names.foldRight(0)((x, n) => x.length + n) should be(126)
  }

  //  Make two lists: one with all names that start with a 'M' and one with all names that don't
  "All names split('m')" should "yield the 2 lists" in {
    def invert[T](function: T => Boolean): T => Boolean = value => !function(value)

    def split[T](aList: List[T], splitFunction: T => Boolean): (List[T], List[T]) = {
      (aList.filter(splitFunction), aList.filter(invert(splitFunction)))
    }

    val tuple = split[String](names, t => t.toString.charAt(0) == 'M')
    tuple._1 should be("Magreet" :: "Magriet" :: "Marie" :: "Marije" :: "Marjan" :: "Marjo" :: "Marlyn" :: Nil)
    tuple._2 should be("Sylvia" :: "Jeanette" :: "Natalie" :: "Fiene" ::
      "Elsje" :: "Treesje" :: "Truus" :: "Babbette" :: "Betsie" :: "Sabine" ::
      "Greet" :: "Angeline" :: "Wies" :: "Tine" :: Nil)
  }

  //  Group all names by length: List[(Int,List[String])]
  "All names grouped by length" should "yield Jeanette. Babbette, Angeline for length 8" in {
    val namesByLength = names.groupBy(_.length)
    namesByLength(8) should be("Jeanette" :: "Babbette" :: "Angeline" :: Nil)
  }

  //  What is the most common length?
  "The most common length" should "be 6" in {
    val mostCommonLengths =
      names.groupBy(_.length)   // Group names on length
       .map(group => (group._1, group._2.length)) // Count groups with equal length
       .groupBy(_._2)     // Group by amount with equal length
       .map(p => (p._1, p._2.keys)) // Create tupels with length and number of names
       .toList.sortBy(_._1) // Largest number of names to the back
       .last._2  // Take the list with the number which are the most common
    mostCommonLengths should be (Set(6,5))
  }
}

