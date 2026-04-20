class ThreadRunner{
	
	public static void main(String... args){
		
		Thread thread=new Thread("blue",20);
		System.out.println("color:"+thread.color);
		System.out.println("length:"+thread.length);
		
		Thread thread1=new Thread("red",15);
		System.out.println("color:"+thread1.color);
		System.out.println("length:"+thread1.length);
		
	}
}