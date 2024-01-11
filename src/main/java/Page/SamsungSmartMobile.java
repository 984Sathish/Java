package Page;

import Interface.SmartPhone;
import Interface.Speaker;

//implement interfaces
public class SamsungSmartMobile implements SmartPhone, Speaker{
	
	//implement the unimpleted from SmartPhone, Speaker

	@Override
	public void display() {
		System.out.println("Added display in samsung smartphone");
		
	}

	@Override
	public void battery() {
		System.out.println("Added battery in samsung smartphone");
		
	}

	@Override
	public void processor() {
		System.out.println("Added processor in samsung smartphone");
		
	}
	

	@Override
	public void dolbySupport() {
		System.out.println("Dolby Support in samsung smartphone");
		
	}

	@Override
	public void dualSpeaker() {
		System.out.println("Dual Speaker in samsung smartphone");
		
	}
	
	//Added current class methods
	public void support5G() {
		System.out.println("5G enabled");
	}
	
	public void camera() {
		System.out.println("Tripple camera in samsung smartphone");
	}
	
	public void getPrice() {
		System.out.println("samsung smartphone price: "+SmartPhone.price);
	}
	


	
}
