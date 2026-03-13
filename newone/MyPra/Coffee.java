class Coffee{
	static void details(){
	double weight=3.5;
	int price=10;
	boolean isTasty=true;
	System.out.println("Weight:"+weight);
	System.out.println("Price:"+price);
	System.out.println("Is it good:"+isTasty);
	}
	static void info(double weight,int price,boolean isTasty){
		System.out.println("Weight:"+weight);
	    System.out.println("Price:"+price);
	    System.out.println("Is it good:"+isTasty);
	
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
	if(isTasty==false && isTasty==false){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is invalid statement");
	}
}
}



