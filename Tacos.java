
public class Tacos extends NonAmericanFood implements tacoable,tacoable2 {
	protected String yourFood;
	protected boolean Chile = false;
	protected boolean PicoDeGayo = false;
	
	//Constructors
	public Tacos(){
		this.yourFood = "Tacos";
	}
	
	public Tacos(String a){
		ChooseNonAmericanFood(a);
	}
	
	// other
	@Override
	public void ChooseNonAmericanFood(String s) {
		this.yourFood = s;

	}

	// setters
	@Override
	public boolean Chile() {
		Chile = true;
		return Chile;
	}

	@Override
	public boolean PicoDeGayo() {
		PicoDeGayo = false;
		return PicoDeGayo;
	}
	
	// getters
	public String getFood(){
		return this.yourFood;
	}
	
	public boolean DidIWantChile(){
		return this.Chile;
	}
	
	public boolean DidIWantPicoDEGayo(){
		return this.PicoDeGayo;
	}
	
	public String toString(){
		return "Your food is: "+yourFood + ", did you get Chile: "+Chile+" , and did you get Pico De Gayo on it: "+PicoDeGayo+". Enjoy!";
	}

}
