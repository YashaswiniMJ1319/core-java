class CricketStore{
	Cricket[] cricket=new Cricket[20];
	int index=0;

	void store(Cricket cricket){
		if(cricket!=null){
			System.out.println("getting the details");
			if(this.index<this.cricket.length){
				System.out.println("the given element is within the range");
				this.cricket[this.index]=cricket;
				System.out.println("getting the properties of the cricket:"+cricket);
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
			cricket[start].display();
		}
	}
}

