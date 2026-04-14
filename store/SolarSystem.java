class SolarSystem{
	String[] names=new String[5];
	int index=0;
	void save(String names){
		System.out.println("getting the details of solarsystem");
		if(names!=null){
			System.out.println("getting the names");
			if(this.index<this.names.length){
				System.out.println("getting the correct value");
				this.names[this.index]=names;
				System.out.println("getting the position of the solar system:"+this.index);
				System.out.println("getting the details of the solar system:"+names);
				this.index++;
			}	
		
		else{
			System.out.println("name not exist");
		}
		}
		else{
			System.out.println("out of range");
		}
		
	}
	
	void store(String name){
		boolean available=false;
		if(name!=null){
			
			for(String tep:this.names){
				if(name==tep){
					System.out.println("getting the saved name details:"+name);
					available=true;
					break;
				}
			}
				if(!available){
					System.out.println("not correct");
				}
				}
			}
			}
		
	
	
