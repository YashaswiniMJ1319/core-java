class KnifeRunner{
	
	public static void main(String... args){
		
		Knife knife=new Knife("steel",5);
		System.out.println("bladeMaterial:"+knife.bladeMaterial);
		System.out.println("bladeLength:"+knife.bladeLength);
		
		Knife knife1=new Knife("stainless steel",10);
		System.out.println("bladeMaterial:"+knife1.bladeMaterial);
		System.out.println("bladeLength:"+knife1.bladeLength);
	}
}