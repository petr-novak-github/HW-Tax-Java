package pcgTax;

import java.time.LocalDateTime;

public class House extends RealEstate {
	
	public House()
    {

    }
   
	
	//c# public override double GetTax() 
	public  double GetTax() {
		LocalDateTime ldt = LocalDateTime.now(); 
		int day   = ldt.getDayOfMonth();
		
		
		return day * 1.27; }
		
	
	
}
