class Paper{
static void details(){
	float height=5.4f;
	double weight=45.65;
	int cost=230;
	double width=234.45;
	boolean isGoodQuality=true;
	System.out.println("Height:"+height);
	System.out.println("Weight:"+weight);
	System.out.println("Cost:"+cost);
	System.out.println("Width:"+width);
	System.out.println("Is good quality:"+isGoodQuality);
	
}
   static void info(float height,double weight,int cost,double width,boolean isGoodQuality){
	System.out.println("Height:"+height);
	System.out.println("Weight:"+weight);
	System.out.println("Cost:"+cost);
	System.out.println("Width:"+width);
	System.out.println("Is good quality:"+isGoodQuality);
   
   if(height>=1.5 && height<=35.7){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(weight>=1.55 && weight<=35.75){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(cost>=5 && cost<=1000){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(width>=1.55 && height<=38.75){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(isGoodQuality==true && isGoodQuality==true){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
}
}

