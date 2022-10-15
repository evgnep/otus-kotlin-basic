fun main() {
  evaluate(10, 20, { a, b -> a + b })
  evaluate(10, 20) { a, b ->
    a + b
  }

  evaluate(10, 20) { _, _ ->
    22
  }

  doSomething2Times {
    println("x")
  }

  doSomething2Times {
    println("y:$it")
  }

  doSomething2Times { no ->
    println("y:$no")
  }
}

fun evaluate(a: Int, b: Int, evaluator: (Int, Int) -> Int): Int {
  println("evaluate($a, $b)")
  val res = evaluator(a, b)
  println("result = $res")
  return res
}

fun doSomething2Times(action: (no: Int) -> Unit) {
  for (i in 0..1) {
    action(i)
  }
}