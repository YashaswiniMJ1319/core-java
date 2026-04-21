class TempleRunner{
	
	public static void main(String... args){
		
		Temple temple=new HillTemple("Tirupati", "Andhra Pradesh", "Lord Venkateswara", 300, true);
		System.out.println("templeName:"+temple.templeName);
		System.out.println("location:"+temple.location);
		System.out.println("deity:"+temple.deity);
		System.out.println("yearBuilt:"+temple.yearBuilt);
		System.out.println("isOpen:"+temple.isOpen);
		
	}
}