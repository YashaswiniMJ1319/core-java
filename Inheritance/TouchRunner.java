class TouchRunner{
	
	public static void main(String... args){
		TouchPad touchPad=new TouchPad("HP",14);
		System.out.println("brand:"+touchPad.brand);
		System.out.println("size:"+touchPad.size);
		
		TouchPad touchPad1=new TouchPad("Dell",18);
		System.out.println("brand:"+touchPad1.brand);
		System.out.println("size:"+touchPad1.size);
		
	}
}