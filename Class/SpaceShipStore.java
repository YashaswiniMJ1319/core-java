class SpaceShipStore{
	SpaceShip[] spaceShip=new SpaceShip[20];
	int index=0;

	void store(SpaceShip spaceShip){
		if(spaceShip!=null){
			System.out.println("getting the details");
			if(this.index<this.spaceShip.length){
				System.out.println("the given element is within the range");
				this.spaceShip[this.index]=spaceShip;
				System.out.println("getting the properties of the spaceship:"+spaceShip);
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
			spaceShip[start].display();
		}
	}
}

