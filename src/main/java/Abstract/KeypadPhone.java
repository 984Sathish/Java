package Abstract;

import Interface.SmartPhone;

public abstract class KeypadPhone implements SmartPhone{
	
	public static int price = 500;
	
	@Override
	public void display() {
		System.out.println("added display in keypad phone");
	}

	@Override
	public void battery() {
		System.out.println("added battery in keypad phone");
		
	}
	
	public abstract void price();


}
