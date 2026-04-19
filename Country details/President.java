class President{
	
	String name;
	int age;
	Address address;
	
	President(String name,int age,Address address){
		
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	void display(){
		System.out.println("The name of the president is:"+name);
		System.out.println("The age of the person is:"+age);
		address.display();
	}

}