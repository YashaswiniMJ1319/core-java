class Tablet{
	String[] names=new String[5];
	int index=0;
	void save(String names){
		if(names!=null){
			
			if(this.index<this.names.length){
				System.out.println("the name is exist within the range");
				this.names[this.index]=names;
				System.out.println("getting the details of tablets:"+names);
				System.out.println("getting the position of tablets:"+this.index);
				this.index++;
				
			}
			else{
				System.out.println("name not exist");
			}
		}
		else{
			System.out.println("name is out of the range");
		}
		}
		void store(String name){
			int count=0;
			if(name!=null){
				for(String temp:names){
					if(name==temp){
						
						System.out.println("getting the saved details:"+name);
						count++;
						break;
					}
					
					}
					if(count==0){
						System.out.println("the given name not exist");
					}
				}
				
			}
		}
	
