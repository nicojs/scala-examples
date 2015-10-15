package functions

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}

/**
 * Represents a FunctionalTest
 * Created by nicojs
 */
class NumberTest extends FlatSpec with GivenWhenThen with Matchers {

  // Write a function that multiplies two numbers
  "multiply" should "multiply two numbers" in {
    val a = new Number(5)
    assert(Math.compose[Int](t => t * t, t => t + 1)(3) == 16)

    (a * new Number(6)).value should be (30)
    assert((a * new Number(6)).value == 30)
  }


  "Greatest common denominator of 12, 18" should "be 6" in {
    assert(Math.greatestCommonDenominator(12, 18) == 6)
  }

  // Write a function to determine the "Least common multiplier"
  "Least common multiplier of 12,18" should "be 36" in {
    assert(new Number(12).leastCommonMultiplier(new Number(18)) == 36)
  }

  // Write a function compose, such that	compose(g,f)(3) == g(f(3))
  "Compose" should "combine two functions" in {
    assert(Math.compose[Int](t => t * t, t => t + 1)(3) == 16)
    assert(Math.composeCurried[Int](t => t * t, t => t + 1)(3) == 16)
  }

  // Write a curried version of 1 (Write a function that multiplies two numbers).
  "Multiply curried" should "multiply two numbers" in {
    assert(Math.*(5)(6) == 30)
  }

  // Use this curried version to define: def timesTwo: Int => Int = ???
  "5 timesTwo" should "be  10" in {
    assert(Math.timesTwo(5) == 10)
  }

  // Use compose to define def timesFour: Int => Int = ???
  "3 timesFour" should "be 12" in{
    assert(Math.timesFour(3) == 12)
  }

}
