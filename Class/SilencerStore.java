class SilencerStore{
	Silencer[] silencer=new Silencer[20];
	int index=0;

	void store(Silencer silencer){
		if(silencer!=null){
			System.out.println("getting the details");
			if(this.index<this.silencer.length){
				System.out.println("the given element is within the range");
				this.silencer[this.index]=silencer;
				System.out.println("getting the properties of the silencer:"+silencer);
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
			silencer[start].display();
		}
	}
}

