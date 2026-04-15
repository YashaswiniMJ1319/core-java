class ScreenStore{
	Screen[] screen=new Screen[20];
	int index=0;
	void store(Screen screen){
		if(screen!=null){
			System.out.println("getting the details");
			if(this.index<this.screen.length){
				System.out.println("the given element is within the range");
				this.screen[this.index]=screen;
				System.out.println("getting the properties of the screen:"+screen);
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
		//screen.display();
		for(int start=0;start<index;start++){
			screen[start].display();
		}
	}
}