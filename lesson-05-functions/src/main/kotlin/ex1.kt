
fun main() {
  println("Hello from main")

  println("Result: " + sum(10, 20))

  println("Result from funcWithoutResult: " + funcWithoutResult(10.0f))
}

fun sum(a: Int, b: Int): Int {
  println("sum($a, $b)")
  return a + b
}

fun sumShort(a: Int, b: Int): Int = a + b

fun sumShort2(a: Int, b: Int) = a + b

fun funcWithoutResult(a: Float) {
  println("funcWithoutResult($a)")
}

fun funcWithoutResult2(a: Float): Unit {
  println("funcWithoutResult2($a)")
}