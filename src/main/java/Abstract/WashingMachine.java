package Abstract;

//created abstract class
public abstract class WashingMachine {
	
	int washCycle = 5000;   

	//implemented method - spin
	public void spin() {
		System.out.println("Spining");
	}
	
	//Unimplemented abstract method - wash
	public abstract void wash(int washCycle);
	
	//Unimplemented abstract method - price
	public abstract void price();
	
	//implemented method - rinse
	public void rinse() {
		System.out.println("Rinse");
	}
	
	//highClean static method - return HighCleanWash class
	public static WashingMachine highClean() {
		return new HighCleanWash();
	}
	
	//regularCleanWash static method - return RegularWash class
	public static WashingMachine regularCleanWash() {
		return new RegularWash();
	}
	
	//Start washing
	public void start() {
		
		//get price
		price();
		
		//get washcycle
		wash(washCycle);
		
		//wash
		System.out.println("Start Washing");
		
	}

	
	
	
}
