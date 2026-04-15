class GloveStore{
	Glove[] glove=new Glove[20];
	int index=0;

	void store(Glove glove){
		if(glove!=null){
			System.out.println("getting the details");
			if(this.index<this.glove.length){
				System.out.println("the given element is within the range");
				this.glove[this.index]=glove;
				System.out.println("getting the properties of the glove:"+glove);
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
			glove[start].display();
		}
	}
}

