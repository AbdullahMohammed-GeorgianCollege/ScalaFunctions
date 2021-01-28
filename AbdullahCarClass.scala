

class AbdullahCarClass {
   
  def sumSalesPrice(carslist : List[Cars]) = {
      var totalSales = 0
      carslist.foreach(c => totalSales += c.price)
      totalSales
   }  
  def sumSalary_yearmade (carslist : List [Cars],
      selection : Cars => Boolean) = {
    var totalSales = 0
    carslist.foreach(c => {
    if (selection(c))
      totalSales += c.price
   
    })
    
    totalSales
    
  }
    
}

object main{
  
  def main (args: Array[String]) : Unit = {
    
    val t  = new AbdullahCarClass()
    
    var Toyota = new Cars ("Toyota" , 10000)
    Toyota.yearmade = 2020
    
    var Hyunday = new Cars ("Hyunday" , 15000)
    Hyunday.yearmade = 2018
    
    var Nissan = new Cars ("Nissan" , 20000)
    Nissan.yearmade = 2020
    
    var Mazda = new Cars ("Mazda" , 30000)
    Mazda.yearmade = 2020
    
    val carslist = List (Toyota,Hyunday,Nissan,Mazda)
    
    println ("Total car sales: " + t.sumSalesPrice(carslist))
    
    println ("Total car made adter 2019 sales: " + t.sumSalary_yearmade (carslist,(x: Cars) => x.yearmade  > 2019)
  
 )
        
  
        
  }
}