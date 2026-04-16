class NewsPaperStore{
	NewsPaper[] newsPaper=new NewsPaper[100];
	int index=0;
	
	void save(NewsPaper newsPaper){
		if(newsPaper!=null){
			System.out.println("getting th correct value");
			if(this.index<this.newsPaper.length){
				System.out.println("the given content is within the range");
				this.newsPaper[this.index]=newsPaper;
				System.out.println("getting the newspaper details position:"+this.index);
				//System.out.println("getting the newspaper details:"+this.newsPaper[this.index]);
				index++;
			}
			else{
				System.out.println("the given content is out of range");
			}
		}
		else{System.out.println("the details cannot be null");
		}
	}
	void saveAll(NewsPaper[] newsPaper){
		if(newsPaper!=null){
			for(int start=0;start<newsPaper.length;start++){
				save(newsPaper[start]);
			}
			
		}
		else{
			System.out.println("getting the null value");
		}
	}
	
	NewsPaper findByName(String name){
		System.out.println("checking if the name is present");
		if(name!=null){
			boolean identify=false;;
			for(NewsPaper find:newsPaper){
				if(find!=null && find.name.equals(name) ){
					System.out.println("the actual name exist in the news paper:"+find.name);
					identify=true;
					return find;
				}
			}
			
				if(!identify){
					System.out.print("the give name not exist");
				}
		
		}
			else{
				System.out.println("it cannot be null");
			}
		System.out.println("\n=======================================\n");
		return null;
		
		}
	void display(){
		System.out.println("getting the complete details of newspaper");
		for(NewsPaper newsPaper:this.newsPaper){
			if(newsPaper!=null){
			newsPaper.display();
			
		}
		}
			
		
		
	} 
	
     String findPaperQualityByName(String name){
		 
		 System.out.println("getting the paper quality by the name");
		 if(name!=null){
			 for(NewsPaper valid:this.newsPaper){
				 if(valid!=null && valid.name.equals(name)){
					 System.out.println("the name is present:"+valid.name);
					 return String.valueOf( valid.paperQuality);
					 
					 
				 }
			 }  
			 
		 }
		 
		 return null;
	 }
		int findNoOfPagesByNameAndHeadEditor(String name,String headEditor){
			
			System.out.println( "getting the number of pages");
			if(name!=null && headEditor!=null){
				for(NewsPaper newsPaper:this.newsPaper){
	
					if(newsPaper!=null && newsPaper.name.equals(name) && newsPaper.headEditor.equals(headEditor)){
						return newsPaper.noOfPages;
					}
				}
				System.out.println("No matching newspaper found");
			}
			else{
				System.out.println("invalid");
			}
			return 0;
		
	}
	
	     NewsPaper updateLangByName(String name,NewsPaper.Language newLang){
			 
			 System.out.println("\nupdating the language by name:\n ");
			 if(name!=null && newLang!=null){
				 for(NewsPaper newsPaper:this.newsPaper){
					 if(newsPaper!=null && newsPaper.name.equals(name)){
						 newsPaper.language=newLang;
						 return newsPaper;
						 
					 }
				 }
			 }
			 return null;
		 }
		 
		 NewsPaper updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight (NewsPaper.InkColour ink,int noOfImages,int fontSize,String name,double height,double weight){
			 
			 System.out.println("\n updating the inkcolor images and font size");
			 
			 if(ink!=null && noOfImages>0 && fontSize>0 && name!=null && height>0.0 && weight>0.0){
				 for(NewsPaper newsPaper:this.newsPaper){
					 if(newsPaper!=null && newsPaper.name.equals(name) && newsPaper.height==height && newsPaper.weight == weight){
						 newsPaper.inkcolour=ink;
						  newsPaper.noOfImages=noOfImages;
						  newsPaper.fontSize=fontSize;
						  return newsPaper;
					 }
				 }
			 }
			 return null;
		 }
		 
		 NewsPaper replaceByPrintHouseAddress(String printHouseAddress, NewsPaper newPaper) {
			 
			System.out.println("\nReplacing by print house address");

			if (printHouseAddress != null && newPaper != null) {
				int count = 0;
				for (NewsPaper existing : this.newsPaper) {
					if (existing != null && existing.printHouseAddress.equals(printHouseAddress)) {
						this.newsPaper[count] = newPaper;
						return newPaper;
            }
				count++; 
        }
    }

    System.out.println("No matching print house address found");
    return null;
}
		}

