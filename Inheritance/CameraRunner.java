class CameraRunner{
	
	public static void main(String... args){
		
		Camera camera=new Camera(20,"mirrorless");
		System.out.println("pixel:"+camera.pixel);
		System.out.println("type:"+camera.type);
		
		Camera camera1=new Camera(30,"mirror");
		System.out.println("pixel:"+camera1.pixel);
		System.out.println("type:"+camera1.type);
		
	}
}