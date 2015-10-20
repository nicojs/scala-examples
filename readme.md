Lessons learned
===============

Yay points
========
+ No checked exceptions
+ Declaration of an 'object' means a class with a singleton instance
+ Functions
	+ Are objects
	+ Currieing is a function which takes one param and returns a new function which accept the other parameters
		+ f(a)(b,c): d
		+ When curying, the 'implicit' keyword can be used to sweep implementation details under the rugh
+ Nothing inherits from every class
+ Case classes make things much more functional
+ var is used for mutable variables, val for constants
+ use ??? for notImplementedException
+ very extendable using operators
	+ Operator overloading +-/*#$%
	+ Every method can be used as an operator by default
		+ 'normal' method names have lowest priority 
+ Every class can be a function by implementing 'apply'
+ Scala supports tail recursion when the last expression of the recursive method is the recursive call
	+ Meaning that no stack overflows can occur, because the same stack frame is overriden everytime the recursion is called.
	+ Use @tailrec to make the compiler complain
+ Sweet java interop
	+ Write parts of your code in scala / java
+ Polimorfism 
	+ Generics can be upper (T <: person) or lower bound (T >: Person)
	+ Covariance is supported (class List[+T])
		+ More extensive than in C#, because the lowerbound can be specified: def contains[U >: T](item: U): Boolean 
	+ DuckTyping! def doDuck(duck: {def quack(): String} ) : Unit = {}. Can be usefull when the original class can not be modified to implement an interface 
+ Data structures
	+ have companion objects with the same name. List(2,3,5) == new List(2,3,5)
	+ Array[T]
		+ Conctrete mutable class
		+ Array(1,3,4)(2) = 5 == Array(1,3,5)
	+ List[T] 
		+ Is an immutable abstract linked list
		+ Concrete implementations are Cons and Nil
		+ object Nil extends List[Nothing]
		+ The operator used to create lists is ::. A list can be created like val l: List = 7::5::Nil
		+ Operators ending with : are 'mirrored'. x :: y means y.::(x)
		+ Concat lists with :::
		+ List(1,2,3).map(_*10) == List(1,2,3).map(n => n*10)
		+ High order functions (like 'map' and 'forEach') are implemented with high order function foldRight (or :\) or reduceRight (foldLeft, reduceLeft)
			def length = this :\ (0) ((x,n) => 1+n)
	+ Stream is a Lazy list
	
WTF points
=========
- Can make things very complex, because you can do everything in the old 'java' way or the scala way
- Void is wrongly spelled as Unit