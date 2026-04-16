class NewsPaperStoreRunner{
	public static void main(String... agrs){
		NewsPaperStore newsPaperStore=new NewsPaperStore();
		NewsPaper newsPaper1=new NewsPaper(NewsPaper.Language.KANNADA,'A',23.0,3,"indian express",2.3,3,"getting details","hkjs",3,4,"prathiba","kalyadi",5,NewsPaper.InkColour.BLUE);
		NewsPaper newsPaper2=new NewsPaper(NewsPaper.Language.ENGLISH,'B',25.0,5,"Times of India",2.5,3.5,"Sports","Footer2",11,5,"Ravi","Bangalore",6,NewsPaper.InkColour.BLACK);
		NewsPaper newsPaper3=new NewsPaper(NewsPaper.Language.HINDI,'A',20.0,4,"Dainik Jagran",2.2,2.8,"News","Footer3",9,3,"Amit","Delhi",4,NewsPaper.InkColour.BLUE);
		NewsPaper newsPaper4=new NewsPaper(NewsPaper.Language.ENGLISH,'C',30.0,6,"The Hindu",2.6,3.2,"Editorial","Footer4",12,6,"Suresh","Chennai",7,NewsPaper.InkColour.BLACK);
		NewsPaper newsPaper5=new NewsPaper(NewsPaper.Language.KANNADA,'B',22.0,3,"Prajavani",2.1,2.9,"Local","Footer5",10,4,"Manju","Mysore",5,NewsPaper.InkColour.BLUE);
		NewsPaper newsPaper6=new NewsPaper(NewsPaper.Language.HINDI,'A',18.0,2,"Amar Ujala",2.0,2.5,"Breaking","Footer6",8,2,"Raj","Lucknow",3,NewsPaper.InkColour.BLACK);
		NewsPaper newsPaper7=new NewsPaper(NewsPaper.Language.ENGLISH,'A',28.0,7,"Hindustan Times",2.7,3.6,"World","Footer7",13,7,"Neha","Mumbai",8,NewsPaper.InkColour.BLUE);
		NewsPaper newsPaper8=new NewsPaper(NewsPaper.Language.KANNADA,'C',19.0,3,"Udayavani",2.3,2.7,"State","Footer8",9,3,"Kiran","Udupi",4,NewsPaper.InkColour.BLACK);
		NewsPaper newsPaper9=new NewsPaper(NewsPaper.Language.HINDI,'B',21.0,4,"Navbharat Times",2.4,3.1,"Business","Footer9",11,5,"Deepak","Noida",6,NewsPaper.InkColour.BLUE);
		NewsPaper newsPaper10=new NewsPaper(NewsPaper.Language.ENGLISH,'A',35.0,8,"Economic Times",2.8,3.8,"Finance","Footer10",14,8,"Anil","Hyderabad",9,NewsPaper.InkColour.BLACK);

		
		NewsPaper[] news={newsPaper1,newsPaper2,newsPaper3,newsPaper4,newsPaper5,newsPaper6,newsPaper7,newsPaper8,newsPaper9,newsPaper10};
		newsPaperStore.saveAll(news);
		newsPaperStore.findByName("indian express");
		newsPaperStore.display();
		String quality = newsPaperStore.findPaperQualityByName("indian express");
        System.out.println("Paper Quality: " + quality);
		
		int numberOfPages=newsPaperStore.findNoOfPagesByNameAndHeadEditor("indian express","prathiba");
		System.out.println("number of pages:"+numberOfPages);
		
		NewsPaper update=newsPaperStore.updateLangByName("indian express",NewsPaper.Language.HINDI);
		if(update != null){
        update.display();
		}
		NewsPaper updated = newsPaperStore.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(NewsPaper.InkColour.BLACK, 10, 20,"indian express", 2.3, 3.0);
		if(updated != null){
		updated.display();
		}
		
		NewsPaper newPaper = new NewsPaper(NewsPaper.Language.ENGLISH,'B',50.0,10,"Times",2.5,4.0,"Header","Footer",12,6,"Editor","Hassan",8, NewsPaper.InkColour.BLACK);
		NewsPaper replace = newsPaperStore.replaceByPrintHouseAddress("kalyadi", newPaper);
		if(replace != null){
		replace.display();
}
			
		}
	}
