class WaterMelonStore{
	WaterMelon[] waterMelon=new WaterMelon[20];
	int index=0;
	void store(WaterMelon waterMelon){
		if(waterMelon!=null){
			System.out.println("getting the correct details");
			if(this.index<this.waterMelon.length){
			this.waterMelon[this.index]=waterMelon;
			System.out.println("getting the properties of the watermelon:"+waterMelon);
			index++;
			}
			else{
				System.out.println("Storage is full");
			}
		}
			else{
				System.out.println("getting the null value");
			}
			
		
	}
	void display(){
		//System.out.println("getting the details of the fruit:"+this.waterMelon);
		for(int i=0; i<index; i++){
           waterMelon[i].display();  
}
	}
}