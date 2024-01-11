package Page;

import Abstract.WashingMachine;

//created class
public class SamsungWashingMachine {

	//call method from interface 
	
	public void rinseType() {
		WashingMachine.highClean().rinse();
	}
	
	public void spinType() {
		WashingMachine.highClean().spin();
	}
	
	public void Washing() {	
		WashingMachine.highClean().start();
	}
	
	
	
	
	



}
