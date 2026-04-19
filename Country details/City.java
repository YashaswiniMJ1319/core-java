class City{
	
	String name;
	int noOfDistricts;
	District[] districts;
	
	City(String name,int noOfDistricts,District[] districts){
		
		this.name=name;
		this.noOfDistricts=noOfDistricts;
		this.districts=districts;
		
	}
	
	void display(){
		
		System.out.println("name of the city:"+name);
		System.out.println("number of districts:"+noOfDistricts);
		
		for(District start : districts){
            start.display();
	}
	}
		
	
	
}