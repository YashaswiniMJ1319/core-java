class MyUPS extends UPS {

    @Override
    void supplyPower() { 
	System.out.println("supplying power in child"); 
	}
	
	void chargeBattery() { 
	System.out.println("charging battery in child"); 
	}
	
	void switchMode() { 
	System.out.println("switching mode in child"); 
	}


}