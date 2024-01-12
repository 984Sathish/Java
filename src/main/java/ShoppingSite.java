import Page.GodrejWashingMaching;
import Page.NokiaBasicPhone;
import Page.SamsungSmartMobile;
import Page.SamsungWashingMachine;

public class ShoppingSite {
	
	public static void main(String[] args) {
		
		System.out.println("*****Nokia Mobile******");
		NokiaBasicPhone bm = new NokiaBasicPhone();
		bm.battery();
		bm.display();
		bm.price();
		
		System.out.println("\n******Samsung Smartphone*******");
		SamsungSmartMobile sm = new SamsungSmartMobile();
		sm.display();
		sm.processor();
		sm.battery();
		sm.camera();
		sm.support5G();
		sm.dolbySupport();
		sm.dualSpeaker();
		sm.getPrice();
		
		System.out.println("\n******Samsung Washing Machine*******");
		SamsungWashingMachine sw = new SamsungWashingMachine();
		sw.Washing();
		sw.rinseType();
		sw.spinType();
		
		System.out.println("\n******Godraj Washing Machine*******");
		GodrejWashingMaching gw = new GodrejWashingMaching();
		gw.Washing();
		gw.rinseType();
		gw.spinType();
	}

}
