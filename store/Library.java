class Library{
	String[] names=new String[5];
	int index=0;
	void save(String names){
		System.out.println("printing the details of the library books");
		if(names!=null){
			if(this.index<this.names.length){
				System.out.println("getting the correct value");
				System.out.println("getting the books details");
				this.names[this.index]=names;
				System.out.println("getting the details of books:"+(this.index));
				System.out.println("getting the details of books:"+names);
				this.index++;
			}
			else{
				System.out.println("the position of the index is not correct");
			}
		}
		else{
			System.out.println("name is equal to null so not stored ");
		}
			
	
	}
	void search(String name){
		boolean found=false;
		if(name!=null){
			System.out.println("the book is there in lib");
			for(String temp:this.names){
				if(name==temp){
				System.out.println("getting the searched book name:"+name);
				found=true;
				break;
				}
			}
			if(!found){
				System.out.println("book not found");
			
		}
		
	}
}
}