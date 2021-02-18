package pcgTax;

import java.util.ArrayList;
import java.util.List;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var h1 = new House();
        var f1 = new Flat();
        var m1 = new Motorcycle();
        var c1 = new Car();
        var t1 = new Trolleybus();

        //pouziti listu
        List<Inter> zdanit = new ArrayList<Inter>();
        zdanit.add(h1);
        zdanit.add(f1);
        zdanit.add(m1);
        zdanit.add(c1);
        zdanit.add(t1);
        
       double celkDan=0;
        
        for(Inter item : zdanit) {
        	
        	System.out.println(item.getClass().getName().substring(item.getClass().getName().indexOf(".")+1) +"- sazba danne:" + item.GetTax());
        	celkDan+=item.GetTax(); 
        }
        
        System.out.println("Celkova dan je:"+ celkDan);
        
        
        
        
        //pouziti pole
       // Inter[] zdanit = new Inter[] { h1, f1, m1, c1, t1 };
        //for (int i = 0; i < zdanit.length; i++)
        //{
          //  System.out.println(zdanit[i].getClass().getName().substring(zdanit[i].getClass().getName().indexOf(".")+1) +"- sazba danne:" + zdanit[i].GetTax());
        //}
       
		

	}

}
