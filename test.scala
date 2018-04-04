

object Test extends App {
  if (args.length == 0) {
    println("add some parameters")
  }

  def compare(str1: String, str2: String): Boolean = {
    str1.length == str2.length
  }

  def bigger(i: Int, y: Int): Int = {
    if(i > y) i else y
  }

  println(compare(args(0), args(1)))

  println(bigger(args(0).toInt, args(1).toInt))

}
