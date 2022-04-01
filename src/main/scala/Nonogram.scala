object Nonogram extends App {

  def nonogramRow(ns: Array[Int]): Array[Int] = {
    ns.mkString("")
      .split("0")
      .filter(_.nonEmpty)
      .map(_.length)
  }

}
