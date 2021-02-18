package pcgTax;

public class Trolleybus extends Vehicle {
	
	 public Trolleybus()
     {
     }

     public double GetTax() { return super.GetTax() * 0.9; }

}
