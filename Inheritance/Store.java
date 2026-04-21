class Store{
	
	String storeName;
	String location;
	int numOfEmployees;
	double revenue;       
    boolean isOpen;
	
	Store(String storeName,String location){
		
		this.storeName=storeName;
		this.location=location;
		
	}
	
	Store(String storeName,String location,int numOfEmployees,double revenue,boolean isOpen){
		this(storeName,location);
		
		this.numOfEmployees=numOfEmployees;
		this.revenue=revenue;
		this.isOpen=isOpen;
		
	}
	
}