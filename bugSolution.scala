```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object MainObject extends App {
  val myInt = new MyClass[Int](10)
  val myString = new MyClass[String]("Hello")

  println(myInt.getValue) // Output: 10
  println(myString.getValue) // Output: Hello

  // Solution: Use Any to allow lists of different types
  val myList = new MyClass[List[Any]](List(1, 2, 3))
  val myList2 = new MyClass[List[Any]](List("a", "b", "c"))
  val combinedList = myList.getValue ++ myList2.getValue
  println(combinedList) // Output: List(1, 2, 3, a, b, c)
  
  //Alternative solution, using a different combining approach
  val myList3 = new MyClass[List[Int]](List(1,2,3))
  val myList4 = new MyClass[List[String]](List("a", "b", "c"))
  val combinedList2 = myList3.getValue.map(_.toString) ++ myList4.getValue
  println(combinedList2)// Output: List(1, 2, 3, a, b, c)
}
```