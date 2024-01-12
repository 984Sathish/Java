package Abstract;

//create class and extend abstract class
public class RegularWash extends WashingMachine{

	int price = 15000;
	
	@Override
	public void wash(int washCycle) {
		System.out.println("Wash with Regular water - "+washCycle+" wash per minute");
		
	}

	@Override
	public void price() {
		System.out.println("price: "+price);
		
	}



}
