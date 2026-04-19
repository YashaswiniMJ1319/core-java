class Collector{
	
	String name;
	int batchNo;
	
	Collector(String name,int batchNo){
		this.name=name;
		this.batchNo=batchNo;
		
	}
	
	void display(){
		System.out.println("name:"+name);
		System.out.println("batch number:"+batchNo);
	}
	
}