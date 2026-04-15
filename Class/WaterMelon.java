class WaterMelon{
	String color;
	double price;
	double quantity;
	String grownLoca;
	boolean isHydration;
	int sugarContent;
	boolean isRipe;
	String variety;
	boolean isSeedless;
	double diameter;
	WaterMelon(String color,double price,double quantity,String grownLoca,boolean isHydration,int sugarContent,boolean isRipe,
	String variety,boolean isSeedless,double diameter){
		this.color=color;
		this.price=price;
		this.quantity=quantity;
		this.grownLoca=grownLoca;
		this.isHydration=isHydration;
		this.sugarContent=sugarContent;
		this.isRipe=isRipe;
		this.variety=variety;
		this.isSeedless=isSeedless;
		this.diameter=diameter;
		
	}
	void display(){
		System.out.println("displaying the properties of watermelon");
		System.out.println("color:"+color);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		System.out.println("grownLocation:"+grownLoca);
		System.out.println("isHydration:"+isHydration);
		System.out.println("Suger content:"+sugarContent);
		System.out.println("isRipe:"+isRipe);
		System.out.println("variety:"+variety);
		System.out.println("isSeedless:"+isSeedless);
		System.out.println("diameter:"+diameter);
		
		
	}
	
}