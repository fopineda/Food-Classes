
public class Driver {

	public static void main(String[] args) {
		
		System.out.println("---------Burgers---------");
		Burgers burger = new Burgers();
		System.out.println(burger);
		
		// Put Ketchup on it
		burger.Ketchup();
		 
		System.out.println(burger);
		
		System.out.println();
		
		System.out.println("---------Tacos---------");
		
		Tacos tacos = new Tacos();
		System.out.println(tacos);
		
		//put Chile on it
		tacos.Chile();
		
		System.out.println(tacos);
		

	}

}
