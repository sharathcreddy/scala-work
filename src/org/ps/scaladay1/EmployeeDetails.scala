package org.ps.scaladay1

//Create a case class and override apply method to print a custom message
case class EmployeeDetails(Employee_name:String,Emp_ID:Int ){

}
object apply{
  def main(args: Array[String]): Unit ={
    val emp1 =EmployeeDetails("Sharath",165701)
    val emp2 = EmployeeDetails("Chandra",165702)
    println("Employee Name is " +  emp1.Employee_name + " and Employee_ID is " +  emp1.Emp_ID )
    println("Employee Name is " +  emp2.Employee_name + " and Employee_ID is " +  emp2.Emp_ID )
  }
}