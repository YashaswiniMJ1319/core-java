class MyPaint extends Paint {

    @Override
    void applyPaint() { 
	System.out.println("applying paint in child"); 
	}
	
	void mixColor() { 
	System.out.println("mixing color in child"); 
	}
	
	void dryPaint() { 
	System.out.println("drying paint in child"); 
	}
}


