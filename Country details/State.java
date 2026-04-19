class State{
	
	String name;
	int population;
	City city;
	
	State(String name,int population,City city){
		
		this.name=name;
		this.population=population;
		this.city=city;
		
	}
	
	void display(){
		
		System.out.println("the name of state is:"+name);
		System.out.println("the number of population:"+population);
		city.display();
		
	}
		
	

}