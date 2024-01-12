package Abstract;


public class HighCleanWash extends WashingMachine {

	int price = 20000;
	
	@Override
	public void wash(int washCycle) {
		System.out.println("Washing with highlevel water - "+washCycle+" wash per minute");		
	}

	@Override
	public void price() {
		System.out.println("Price: "+price);
	}

}
