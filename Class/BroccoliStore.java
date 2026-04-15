class BroccoliStore{
	Broccoli[] broccoli=new Broccoli[20];
	int index=0;

	void store(Broccoli broccoli){
		if(broccoli!=null){
			System.out.println("getting the details");
			if(this.index<this.broccoli.length){
				System.out.println("the given element is within the range");
				this.broccoli[this.index]=broccoli;
				System.out.println("getting the properties of the broccoli:"+broccoli);
				index++;
			}
			else{
				System.out.println("the data is out of range");
			}
		}
		else{
			System.out.println("invalid");
		}
	}

	void display(){
		for(int start=0;start<index;start++){
			broccoli[start].display();
		}
	}
}

