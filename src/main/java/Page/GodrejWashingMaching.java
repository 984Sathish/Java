package Page;

import Abstract.WashingMachine;

public class GodrejWashingMaching {
	
	//call method from interface 
	
	public void rinseType() {
		WashingMachine.regularCleanWash().rinse();
	}
	
	public void spinType() {
		WashingMachine.regularCleanWash().spin();
	}
	
	public void Washing() {
		WashingMachine.regularCleanWash().start();
	}

}
