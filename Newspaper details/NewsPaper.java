class NewsPaper{
	enum Language{
		KANNADA,
		ENGLISH,
		HINDI
		
	}
	enum InkColour{
		BLUE,
		BLACK
		
	}
	Language language;
	char paperQuality;
	double price;
	int noOfPages;
	String name;
	double height;
	double weight;
	String headerText;
	String footerText;
	int fontSize;
	int noOfImages;
	String headEditor;
	String printHouseAddress;
	int noOfContents;
	InkColour inkcolour;
	
	NewsPaper(Language language,char paperQuality,double price,int noOfPages,String name,double height,
	double weight,String headerText,String footerText,int fontSize,int noOfImages,String headEditor,
	String printHouseAddress,int noOfContents,InkColour inkcolour){
		this.language=language;
		this.paperQuality=paperQuality;
		this.price=price;
		this.noOfPages=noOfPages;
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.headerText=headerText;
		this.footerText=footerText;
		this.fontSize=fontSize;
		this.noOfImages=noOfImages;
		this.headEditor=headEditor;
		this.printHouseAddress=printHouseAddress;
		this.noOfContents=noOfContents;
		this.inkcolour=inkcolour;
	}
	void display(){
		System.out.println("language:"+language);
		System.out.println("paperQuality:"+paperQuality);
		System.out.println("price:"+price);
		System.out.println("noOfPages:"+noOfPages);
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
		System.out.println("headerText:"+headerText);
		System.out.println("footerText:"+footerText);
		System.out.println("fontSize:"+fontSize);
		System.out.println("noOfImages:"+noOfImages);
		System.out.println("headEditor:"+headEditor);
		System.out.println("printHouseAddress:"+printHouseAddress);
		System.out.println("noOfContents:"+noOfContents);
		System.out.println("colour:"+inkcolour);
		
	}
	
	
}