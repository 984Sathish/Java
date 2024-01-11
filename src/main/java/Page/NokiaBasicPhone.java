package Page;

import Abstract.KeypadPhone;

//extend abstract class
public class NokiaBasicPhone extends KeypadPhone {

	//implement the unimpleted from KeypadPhone abstract class
	
	@Override
	public void processor() {
		System.out.println("Added processor in Budget Mobile");
		
	}

	@Override
	public void price() {
		System.out.println("price: "+KeypadPhone.price);
		
	}

}
