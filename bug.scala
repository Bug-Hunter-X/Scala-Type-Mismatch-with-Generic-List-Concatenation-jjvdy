```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object MainObject extends App {
  val myInt = new MyClass[Int](10)
  val myString = new MyClass[String]("Hello")

  println(myInt.getValue) // Output: 10
  println(myString.getValue) // Output: Hello

  // Type mismatch error
  val myList = new MyClass[List[Int]](List(1, 2, 3))
  val myList2 = new MyClass[List[String]](List("a","b","c"))
  val combinedList = myList.getValue ++ myList2.getValue
}
```