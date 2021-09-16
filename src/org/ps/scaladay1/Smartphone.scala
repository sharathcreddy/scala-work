package org.ps.scaladay1

class Smartphone {

  //class Variables
  var number: Int = 16
  var nameofthecompany: String = "Apple"
  //class method

  def Display(): Unit = {
    println("Name of the Company : " + nameofthecompany)
    println("Total no of smartphone generation: " + number)
  }
}
    object Main1 {
      // Main method
      def main(args: Array[String]) {
        // Class object
        var obj = new Smartphone()
        obj.Display()
      }
    }

