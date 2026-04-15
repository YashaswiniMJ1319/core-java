class TissueStore{
	Tissue[] tissue=new Tissue[20];
	int index=0;

	void store(Tissue tissue){
		if(tissue!=null){
			System.out.println("getting the details");
			if(this.index<this.tissue.length){
				System.out.println("the given element is within the range");
				this.tissue[this.index]=tissue;
				System.out.println("getting the properties of the tissue:"+tissue);
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
			tissue[start].display();
		}
	}
}

