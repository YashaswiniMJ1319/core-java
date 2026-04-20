class DumbBellRunner{
	
	public static void main(String... args){
		
		DumbBell dumbBell=new DumbBell(100,"iron");
		System.out.println("weight:"+dumbBell.weight);
		System.out.println("material:"+dumbBell.material);
		
		DumbBell dumbBell1=new DumbBell(200,"rubber");
		System.out.println("weight:"+dumbBell1.weight);
		System.out.println("material:"+dumbBell1.material);
		
	}
}