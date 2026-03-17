class Ring{
static void details(){
	double weight=2.5;
	double diameter=3.35;
	int cost=21000;
	int noOfStones=5;
	boolean isGold=true;
	System.out.println("Weight:"+weight);
	System.out.println("Diameter:"+diameter);
	System.out.println("Cost:"+cost);
	System.out.println("Number of stones:"+noOfStones);
	System.out.println("Is Gols:"+isGold);
	
}
static void info(double weight,double diameter,int cost,int noOfStones,boolean isGold){
	System.out.println("Weight:"+weight);
	System.out.println("Diameter:"+diameter);
	System.out.println("Cost:"+cost);
	System.out.println("Number of stones:"+noOfStones);
	System.out.println("Is Gols:"+isGold);
	if(weight>=1 && weight<=20.5){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is an invalid statement");
	}
	if(diameter>=1.5 && diameter<=5.6){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is an invalid statement");
	}
	if(cost>=10000 && cost<=60000){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is an invalid statement");
	}
	if(noOfStones>=1 && noOfStones<=6){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is an invalid statement");
	}
	if(isGold==true && isGold==true){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is an invalid statement");
	}
	
	
}
}
