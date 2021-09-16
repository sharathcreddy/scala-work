package org.ps.scaladay1

object AnyVal {
  def main(args: Array[String]): Unit = {

    val list: List[Any] = List(1, "Sharath", "C", 0.6, 0.9, true)
    list.foreach(element => println(element))

  }
}
