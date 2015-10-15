package classes.cases

abstract class IntList {
  def add(item: Int): IntList =  this match {
    case _ => new Cons(item, this)
  }

  def contains(item: Int): Boolean = this match{
    case Cons(x, xs) => x.equals(item) || xs.contains(item)
    case Nil => false
  }

  def union (that: IntList): IntList = this match{
    case Cons(x, xs) => Cons(x, xs.union(that))
    case nil => that
  }
  def map (f: Int => Int): IntList = this match{
    case Cons(x, xs) => Cons(f(x), xs.map(f))
    case nil => nil
  }

  override def toString = this match {
    case Cons(x, Nil) => x.toString
    case Cons(x, xs) => s"$x, $xs"
    case Nil => ""
  }
}

case class Cons(x: Int, xs: IntList) extends IntList
case object Nil extends IntList