class Coin{
	
	String country;     
    int value;         
    String material;    
    double weight;      
    int year;   

	Coin(String country){
		this.country=country;
	}
	Coin(String country,int value){
		this(country);
		this.value=value;
	}
	Coin(String country,int value,String material,double weight){
		this(country,value);
		this.material=material;
		this.weight=weight;
	}
	Coin(String country,int value,String material,double weight,int year){
		this(country,value,material,weight);
		this.year=year;
		
	}
	
}
	
