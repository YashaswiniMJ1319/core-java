class MyJersey extends Jersey {

    @Override
    void wearJersey() { 
	System.out.println("wearing jersey in child"); 
	}

    void washJersey() { 
	System.out.println("washing jersey in child"); 
	}

    void dryJersey() { 
	System.out.println("drying jersey in child"); 
	}
}


