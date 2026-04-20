class PowerRunner{
	
	public static void main(String... args){
		
		Electricity electricity1=new Electricity(20,"AC");
		System.out.println("watt:"+electricity1.watt);
		System.out.println("type:"+electricity1.type);
		
		
		Electricity electricity2=new Electricity(30,"DC");
		System.out.println("watt:"+electricity2.watt);
		System.out.println("type:"+electricity2.type);
		
		
	}
}