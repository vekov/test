// fpaa_1.scala

val arr = Array("this", "is", "some", "kind", "of", "array")

val thread = new Thread {
  override def run {
    printStringLength(arr)
  }
}
thread.start

//arr(4) = null

def printStringLength(xs: Seq[String]) {
  for (x <- xs) println(x.length)
}