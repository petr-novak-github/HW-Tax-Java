package pcgTax;

import java.time.LocalDateTime;

public class Flat extends RealEstate {
	public Flat()
    {

    }
	
	public  double GetTax() {
		LocalDateTime ldt = LocalDateTime.now(); 
		
		int year  = ldt.getDayOfYear();
		
		return year * 1.27; }
	

}


