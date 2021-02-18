package pcgTax;



public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var h1 = new House();
        var f1 = new Flat();
        var m1 = new Motorcycle();
        var c1 = new Car();
        var t1 = new Trolleybus();

        //pouziti listu
        //List<Inter> zdanit = new List<Inter>() { h1, f1, m1, c1, t1 };
        //foreach (Inter item in zdanit) {System.out.println($"{item.GetType().Name} - sazba danne: {item.GetTax()}"); }
        //pouziti pole
        Inter[] zdanit = new Inter[] { h1, f1, m1, c1, t1 };
        for (int i = 0; i < zdanit.length; i++)
        {
            System.out.println(zdanit[i].getClass().getName().substring(zdanit[i].getClass().getName().indexOf(".")+1) +"- sazba danne:" + zdanit[i].GetTax());
        }
       
		

	}

}
