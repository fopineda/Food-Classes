
public class Burgers extends AmericanFood {
	protected String yourFood;
	protected boolean Ketchup = false;
	protected boolean mayo = false;
	
	//Constructors
	public Burgers(){
		this.yourFood = "Burgers";
	}
	
	public Burgers(String a){
		ChooseAmericanFood(a);
	}
	
	// other
	@Override
	public void ChooseAmericanFood(String s) {
		this.yourFood = s;

	}
	
	// setters
	@Override
	public boolean Ketchup() {
		Ketchup = true;
		return Ketchup;
	}

	@Override
	public boolean mayo() {
		mayo = true;
		return mayo;
	}
	
	// getters
	public String getFood(){
		return this.yourFood;
	}
	
	public boolean DidIWantKetchup(){
		return this.Ketchup;
	}
	
	public boolean DidIWantMayo(){
		return this.mayo;
	}
	
	public String toString(){
		return "Your food is: "+yourFood + ", did you get Ketchup: "+Ketchup+" , and did you get mayo: "+mayo+". Enjoy!";
	}

}
