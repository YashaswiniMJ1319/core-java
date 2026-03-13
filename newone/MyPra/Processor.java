class Processor{
static void details(){
	double speed=3;
	int gen=5;
	int storage=250;
	System.out.println("Speed :"+ speed);
	System.out.println("Generation :"+ gen);
	System.out.println("Storage:"+ storage);
	
}
static void info(double speed,int gen,int storage){
	System.out.println("Speed :"+speed);
	System.out.println("Generation :"+ gen);
	System.out.println("Storage :"+ storage);
	if(speed>=1 && speed<=7){
		System.out.println("It is the valid statement");
	}
	else{
		System.out.println("It is invalid");
	}
	if(gen>=1 && gen<=12){
		System.out.println("It is the valid statement");
	}
	else{
		System.out.println("It is invalid");
	}
	if(storage>=127 && speed<=512){
		System.out.println("It is the valid statement");
	}
	else{
		System.out.println("It is invalid");
	}
	
	
	
}
}





