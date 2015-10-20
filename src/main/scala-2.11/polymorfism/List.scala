package polymorfism

import scala.annotation.tailrec

abstract class List[+T] {

  def add[U >: T](item: U): List[U] = this match {
    case _ => new Cons(item, this)
  }

  @tailrec
  final def contains[U >: T](item: U): Boolean = this match {
    case Nil => false
    case Cons(x, xs) => x == item || (xs contains item)
  }

  def union[U >: T](that: List[U]): List[U] = this match {
    case Cons(x, xs) => Cons(x, xs.union(that))
    case nil => that
  }

  def map[U >: T](f: T => U): List[U] = this match {
    case Cons(x, xs) => Cons(f(x), xs.map(f))
    case nil => nil
  }

  def reverse : List[T] = this match {
    case Nil => Nil
    case Cons(x, xs) => xs.reverse.union(this)
  }

  override def toString = this match {
    case Cons(x, Nil) => x.toString
    case Cons(x, xs) => s"$x, $xs"
    case Nil => ""
  }
}

case class Cons[T](x: T, xs: List[T]) extends List[T]

case object Nil extends List[Nothing]