package classes.normal

abstract class IntList {
  def add(item: Int): IntList

  def contains(item: Int): Boolean
  def union (that: IntList): IntList
  def map (f: Int => Int): IntList
}

class Cons(x: Int, xs: IntList) extends IntList{
  override def add(item: Int): IntList = {
    new Cons(item, this)
  }

  override def contains(item: Int): Boolean = {
    x.equals(item) || xs.contains(item)
  }

  override def union(that: IntList): IntList = {
    new Cons(x, xs.union(that))
  }

  override def map(f: (Int) => Int): IntList = {
    new Cons(f(x), xs.map(f))
  }

  override def toString = s"$x, $xs"
}

object Nil extends IntList {
  override def add(item: Int): IntList = new Cons(item, this)

  override def contains(item: Int): Boolean = false

  override def union(that: IntList): IntList = that

  override def map(f: (Int) => Int): IntList = this

  override def toString = "nil"
}