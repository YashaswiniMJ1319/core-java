class Key{
	static void details(){
		int cost=50;
		double length=45.3;
		double weight=33.45;
		int nuOfKeys=6;
		boolean isGood=true;
		System.out.println("Cost:"+cost);
		System.out.println("Length:"+length);
		System.out.println("Weight:"+weight);
		System.out.println("Is the key good:"+isGood);
		
	}
	static void info(int cost,double length,double weight,int nuOfKeys,boolean isGood){
		System.out.println("Cost:"+cost);
		System.out.println("Length:"+length);
		System.out.println("Weight:"+weight);
		System.out.println("Is the key good:"+isGood);
		
		if(cost>=10 && cost<=60){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(length>=1.5 && length<=35.7){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(weight>=1.5 && weight<=35.7){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(nuOfKeys>=1 && nuOfKeys<=10){
	   System.out.println("It is a valid statement");
   }
   else{
	   System.out.println("It is a invalid statement");
	   
   }
   if(isGood==true && isGood==true){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is an invalid statement");
	}
	
	}
}