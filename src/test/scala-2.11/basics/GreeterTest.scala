package basics

import org.scalatest.FunSuite

class GreeterTest extends FunSuite{

  test("should greet") {
    val greeter = new Greeter
    assert(greeter.sayHello("nicojs") == "Welcome back nicojs!")
  }

}
