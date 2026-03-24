class PersonDetails{
	static void getDetailsOfPerson(String name,String[] email,String[]phoneNo,String[]addr){
		System.out.println("Executing the person details");
		
		if(name != null){
			System.out.println("The name is:"+name);
			
			}
		if(email!=null){
			for(int det=0;det<email.length;det++){
				
			System.out.println("the email is:"+email[det]);
			}
			
		}
		if(phoneNo!=null){
			for(int num=0;num<phoneNo.length;num++){
			System.out.println("the phone number is:"+phoneNo[num]);
			
		}
		if(addr!=null){
			for(int place=0;place<addr.length;place++)
			System.out.println("the addres is:"+addr[place]);
			
			
		}
			
		else{
			System.out.println("The detail is not found");
		}
		
		
	}
}
}