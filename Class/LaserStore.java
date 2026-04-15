class LaserStore{
	Laser[] laser=new Laser[20];
	int index=0;

	void store(Laser laser){
		if(laser!=null){
			System.out.println("getting the details");
			if(this.index<this.laser.length){
				System.out.println("the given element is within the range");
				this.laser[this.index]=laser;
				System.out.println("getting the properties of the laser:"+laser);
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
			laser[start].display();
		}
	}
}

