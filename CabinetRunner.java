class CabinetRunner{
	public static void main(String[] args){
		Cabinet ref=new Cabinet();
		System.out.println("Literal values");
		
		System.out.println("Color:"+ref.color);
		System.out.println("material:"+ref.material);
		System.out.println("shelves:"+ref.shelves);
		System.out.println("rating:"+ref.rating);
		System.out.println("type:"+ref.type);
		
		ref.color="Green";
		ref.material="wood";
		ref.shelves=5;
		ref.rating=5.5f;
		ref.type='B';
		
		System.out.println("updated Literal values");
		
		System.out.println("updated Color:"+ref.color);
		System.out.println("updated material:"+ref.material);
		System.out.println("updated shelves:"+ref.shelves);
		System.out.println("updated rating:"+ref.rating);
		System.out.println("updated type:"+ref.type);
		
		Cabinet brand=new Cabinet();
		Cabinet weight=new Cabinet();
		Cabinet height=new Cabinet();
		Cabinet code=new Cabinet();
		Cabinet discount=new Cabinet();
		Cabinet windows=new Cabinet();
		Cabinet doors=new Cabinet();
		Cabinet width=new Cabinet();
		Cabinet quality=new Cabinet();
		Cabinet cost=new Cabinet();
		System.out.println("Brand:");
		System.out.println(brand.brand+" "+brand.weight+" "+brand.height+" "+brand.code+" "+brand.discount+" "+
		brand.windows+" "+brand.doors+" "+brand.width+" "+brand.quality+" "+brand.cost);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+weight.weight);
		System.out.println("height:"+weight.height);
		System.out.println("code:"+weight.code);
		System.out.println("discount:"+weight.discount);
		System.out.println("windows:"+weight.windows);
		System.out.println("doors:"+weight.doors);
		System.out.println("width:"+weight.width);
		System.out.println("quality:"+weight.quality);
		System.out.println("cost:"+weight.cost);
		System.out.println("brand:"+weight.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+height.weight);
		System.out.println("height:"+height.height);
		System.out.println("code:"+height.code);
		System.out.println("discount:"+height.discount);
		System.out.println("windows:"+height.windows);
		System.out.println("doors:"+height.doors);
		System.out.println("width:"+height.width);
		System.out.println("quality:"+height.quality);
		System.out.println("cost:"+height.cost);
		System.out.println("brand:"+height.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+code.weight);
		System.out.println("height:"+code.height);
		System.out.println("code:"+code.code);
		System.out.println("discount:"+code.discount);
		System.out.println("windows:"+code.windows);
		System.out.println("doors:"+code.doors);
		System.out.println("width:"+code.width);
		System.out.println("quality:"+code.quality);
		System.out.println("cost:"+code.cost);
		System.out.println("brand:"+code.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+discount.weight);
		System.out.println("height:"+discount.height);
		System.out.println("code:"+discount.code);
		System.out.println("discount:"+discount.discount);
		System.out.println("windows:"+discount.windows);
		System.out.println("doors:"+discount.doors);
		System.out.println("width:"+discount.width);
		System.out.println("quality:"+discount.quality);
		System.out.println("cost:"+discount.cost);
		System.out.println("brand:"+discount.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+windows.weight);
		System.out.println("height:"+windows.height);
		System.out.println("code:"+windows.code);
		System.out.println("discount:"+windows.discount);
		System.out.println("windows:"+windows.windows);
		System.out.println("doors:"+windows.doors);
		System.out.println("width:"+windows.width);
		System.out.println("quality:"+windows.quality);
		System.out.println("cost:"+windows.cost);
		System.out.println("brand:"+windows.brand);
		System.out.println("\n  \n");
		System.out.println("weight:"+doors.weight);
		System.out.println("height:"+doors.height);
		System.out.println("code:"+doors.code);
		System.out.println("discount:"+doors.discount);
		System.out.println("windows:"+doors.windows);
		System.out.println("doors:"+doors.doors);
		System.out.println("width:"+doors.width);
		System.out.println("quality:"+doors.quality);
		System.out.println("cost:"+doors.cost);
		System.out.println("brand:"+doors.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+width.weight);
		System.out.println("height:"+width.height);
		System.out.println("code:"+width.code);
		System.out.println("discount:"+width.discount);
		System.out.println("windows:"+width.windows);
		System.out.println("doors:"+width.doors);
		System.out.println("width:"+width.width);
		System.out.println("quality:"+width.quality);
		System.out.println("cost:"+width.cost);
		System.out.println("brand:"+width.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+quality.weight);
		System.out.println("height:"+quality.height);
		System.out.println("code:"+quality.code);
		System.out.println("discount:"+quality.discount);
		System.out.println("windows:"+quality.windows);
		System.out.println("doors:"+quality.doors);
		System.out.println("width:"+quality.width);
		System.out.println("quality:"+quality.quality);
		System.out.println("cost:"+quality.cost);
		System.out.println("brand:"+quality.brand);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+cost.weight);
		System.out.println("height:"+cost.height);
		System.out.println("code:"+cost.code);
		System.out.println("discount:"+cost.discount);
		System.out.println("windows:"+cost.windows);
		System.out.println("doors:"+cost.doors);
		System.out.println("width:"+cost.width);
		System.out.println("quality:"+cost.quality);
		System.out.println("cost:"+cost.cost);
		System.out.println("brand:"+cost.brand);
		
		
		System.out.println("\n  \n");
		
		
		brand.brand="IKEA";
		brand.weight=20;
		brand.height=5.5f;
		brand.code='A';
		brand.discount=10;
		brand.windows=5;
		brand.doors=4;
		brand.width=43.3f;
		brand.quality='B';
		brand.cost=70.76;
		
		System.out.println(brand.brand+" "+brand.weight+" "+brand.height+" "+brand.code+" "+brand.discount+" "+
		brand.windows+" "+brand.doors+" "+brand.width+" "+brand.quality+" "+brand.cost);
		
		System.out.println("\n  \n");
		
		weight.brand="Boffi";
		weight.weight=15;
		weight.height=15.5f;
		weight.code='C';
		weight.discount=20;
		weight.windows=7;
		weight.doors=2;
		weight.width=143.3f;
		weight.quality='A';
		weight.cost=170.76;
		
		System.out.println("weight:"+weight.weight);
		System.out.println("height:"+weight.height);
		System.out.println("code:"+weight.code);
		System.out.println("discount:"+weight.discount);
		System.out.println("windows:"+weight.windows);
		System.out.println("doors:"+weight.doors);
		System.out.println("width:"+weight.width);
		System.out.println("quality:"+weight.quality);
		System.out.println("cost:"+weight.cost);
		System.out.println("brand:"+weight.brand);
		
		System.out.println("\n  \n");
		
		height.brand="Blum";
		height.weight=20;
		height.height=20.5f;
		height.code='A';
		height.discount=5;
		height.windows=2;
		height.doors=1;
		height.width=25.3f;
		height.quality='B';
		height.cost=17.76;
		
		System.out.println("weight:"+height.weight);
		System.out.println("height:"+height.height);
		System.out.println("code:"+height.code);
		System.out.println("discount:"+height.discount);
		System.out.println("windows:"+height.windows);
		System.out.println("doors:"+height.doors);
		System.out.println("width:"+height.width);
		System.out.println("quality:"+height.quality);
		System.out.println("cost:"+height.cost);
		System.out.println("brand:"+height.brand);   
		
		System.out.println("\n  \n");
		
		code.brand="Hettich";
		code.weight=200;
		code.height=10.5f;
		code.code='C';
		code.discount=15;
		code.windows=3;
		code.doors=1;
		code.width=125.3f;
		code.quality='A';
		code.cost=147.76;
		
		System.out.println("weight:"+code.weight);
		System.out.println("height:"+code.height);
		System.out.println("code:"+code.code);
		System.out.println("discount:"+code.discount);
		System.out.println("windows:"+code.windows);
		System.out.println("doors:"+code.doors);
		System.out.println("width:"+code.width);
		System.out.println("quality:"+code.quality);
		System.out.println("cost:"+code.cost);
		System.out.println("brand:"+code.brand);
		
		System.out.println("\n  \n");
		
		discount.brand="Hafele";
		discount.weight=150;
		discount.height=12.5f;
		discount.code='C';
		discount.discount=12;
		discount.windows=5;
		discount.doors=2;
		discount.width=150.3f;
		discount.quality='B';
		discount.cost=150.76;
		
		System.out.println("weight:"+discount.weight);
		System.out.println("height:"+discount.height);
		System.out.println("code:"+discount.code);
		System.out.println("discount:"+discount.discount);
		System.out.println("windows:"+discount.windows);
		System.out.println("doors:"+discount.doors);
		System.out.println("width:"+discount.width);
		System.out.println("quality:"+discount.quality);
		System.out.println("cost:"+discount.cost);
		System.out.println("brand:"+discount.brand);
		
		System.out.println("\n  \n");
		
		windows.brand="Ebco";
		windows.weight=250;
		windows.height=15.5f;
		windows.code='D';
		windows.discount=13;
		windows.windows=6;
		windows.doors=3;
		windows.width=155.3f;
		windows.quality='C';
		windows.cost=151.76;
		
		System.out.println("weight:"+windows.weight);
		System.out.println("height:"+windows.height);
		System.out.println("code:"+windows.code);
		System.out.println("discount:"+windows.discount);
		System.out.println("windows:"+windows.windows);
		System.out.println("doors:"+windows.doors);
		System.out.println("width:"+windows.width);
		System.out.println("quality:"+windows.quality);
		System.out.println("cost:"+windows.cost);
		System.out.println("brand:"+windows.brand);
		
		System.out.println("\n  \n");
		doors.brand="Celiche";
		doors.weight=300;
		doors.height=16.5f;
		doors.code='E';
		doors.discount=14;
		doors.windows=7;
		doors.doors=3;
		doors.width=156.3f;
		doors.quality='D';
		doors.cost=152.76;
		System.out.println("weight:"+doors.weight);
		System.out.println("height:"+doors.height);
		System.out.println("code:"+doors.code);
		System.out.println("discount:"+doors.discount);
		System.out.println("windows:"+doors.windows);
		System.out.println("doors:"+doors.doors);
		System.out.println("width:"+doors.width);
		System.out.println("quality:"+doors.quality);
		System.out.println("cost:"+doors.cost);
		System.out.println("brand:"+doors.brand);
		
		System.out.println("\n  \n");
		
		width.brand="Aristokraft";
		width.weight=350;
		width.height=16.5f;
		width.code='F';
		width.discount=15;
		width.windows=8;
		width.doors=3;
		width.width=157.3f;
		width.quality='E';
		width.cost=153.76;
		
		System.out.println("weight:"+width.weight);
		System.out.println("height:"+width.height);
		System.out.println("code:"+width.code);
		System.out.println("discount:"+width.discount);
		System.out.println("windows:"+width.windows);
		System.out.println("doors:"+width.doors);
		System.out.println("width:"+width.width);
		System.out.println("quality:"+width.quality);
		System.out.println("cost:"+width.cost);
		System.out.println("brand:"+width.brand);
		
		System.out.println("\n  \n");
		
		quality.brand="Diamond";
		quality.weight=400;
		quality.height=17.5f;
		quality.code='G';
		quality.discount=13;
		quality.windows=6;
		quality.doors=3;
		quality.width=155.3f;
		quality.quality='C';
		quality.cost=151.76;  
		
		System.out.println("weight:"+quality.weight);
		System.out.println("height:"+quality.height);
		System.out.println("code:"+quality.code);
		System.out.println("discount:"+quality.discount);
		System.out.println("windows:"+quality.windows);
		System.out.println("doors:"+quality.doors);
		System.out.println("width:"+quality.width);
		System.out.println("quality:"+quality.quality);
		System.out.println("cost:"+quality.cost);
		System.out.println("brand:"+quality.brand);
		
		System.out.println("\n  \n");
		
		cost.brand="Ebco";
		cost.weight=250;
		cost.height=15.5f;
		cost.code='D';
		cost.discount=13;
		cost.windows=6;
		cost.doors=3;
		cost.width=155.3f;
		cost.quality='C';
		cost.cost=151.76;
		
		System.out.println("weight:"+cost.weight);
		System.out.println("height:"+cost.height);
		System.out.println("code:"+cost.code);
		System.out.println("discount:"+cost.discount);
		System.out.println("windows:"+cost.windows);
		System.out.println("doors:"+cost.doors);
		System.out.println("width:"+cost.width);
		System.out.println("quality:"+cost.quality);
		System.out.println("cost:"+cost.cost);
		System.out.println("brand:"+cost.brand);
	}
}