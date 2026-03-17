class Ice{
	static void details(){
	double weight=3.5;
	int price=10;
	boolean isCold=true;
	System.out.println("Weight:"+weight);
	System.out.println("Price:"+price);
	System.out.println("Is it Cold:"+isCold);
	}
	static void info(double weight,int price,boolean isCold){
		System.out.println("Weight:"+weight);
	    System.out.println("Price:"+price);
	    System.out.println("Is it cold:"+isCold);
	
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
	if(isCold==true && isCold==true){
		System.out.println("It is a valid statement");
	}
	else{
		System.out.println("It is invalid statement");
	}
}
}
