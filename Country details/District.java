class District{
	
	String name;
	Collector collector;
	
	District(String name,Collector collector){
		
		this.name=name;
		this.collector=collector;
	}
	void display(){
		System.out.println("getting the name:"+name);
		collector.display();
	
	}
}