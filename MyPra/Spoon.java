class Spoon{
static void details(){
	double weight=3.5;
	int price=10;
	float length=2.7f;
	System.out.println("Weight:"+weight);
	System.out.println("Price:"+price);
	System.out.println("Length:"+length);
	}
	static void info(double weight,int price,float length){
		System.out.println("Weight:"+weight);
	    System.out.println("Price:"+price);
	    System.out.println("Length:"+length);
	
	if(weight>=1 && weight<=10){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is invalid statement");
	}
	if(price>=10 && price<=100){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is invalid statement");
	}
	if(length>=1.5 && length<=11.5){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is invalid statement");
	}
}
}



