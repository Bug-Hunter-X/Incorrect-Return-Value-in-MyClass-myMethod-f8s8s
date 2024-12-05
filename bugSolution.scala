```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x > value) {
      x + value 
    } else if (x == value){
      value
    } else {
      x + value //Corrected: should return x + value
    }
  }
}
```