package org.ps.scaladay1

//Create a class to calculate the simple intrest using a method callcalculateSimpleIntrest
// having two parameters principle , rate for one year

  object SimpleInterest {
    def main(args: Array[String]): Unit = {
      println("Simple Interest for 1 year is:" + calculateSimpleInterest(100000,2.5))
    }

    def calculateSimpleInterest(principal: Int, rate: Double): Double = {
      val duration = 12
      var interest = principal * rate * duration / 100
      interest
    }
  }
