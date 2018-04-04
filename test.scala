
object Test extends App {
  if (args.length == 0) {
    println("add some parameters")
  }

  def compare(str1: String, str2: String): Boolean = {
    str1.length == str2.length
  }

  println(compare(args(0), args(1)))

  println("Test!")

}
