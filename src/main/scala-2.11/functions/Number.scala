package functions

/**
 * Represents a Functional
 * Created by nicojs
 */
class Number(val value: Int) {



  def *(other: Number): Number = {
    new Number(value * other.value)
  }


  def leastCommonMultiplier(other: Number) = {
    other.value * value / Math.greatestCommonDenominator(other.value, this.value)
  }

}


object Math{

  def greatestCommonDenominator(a: Int, b: Int): Int ={
    if(b == 0){
      a
    }else{
      greatestCommonDenominator(b, a % b)
    }
  }

  def compose [T] (last: T => T, first: T => T ) = {
    x:T => last(first(x))
  }

  def composeCurried[Y] (last: Int => Int, first: Int => Int)(x: Int): Int = {
    last(first(x))
  }

  def * (x: Int)(y: Int):  Int = {
    x * y
  }

  def timesTwo(i: Int) = {
    *(i)(2)
  }

  def timesFour(i: Int) = {
    compose(timesTwo, timesTwo)(i)
  }
}