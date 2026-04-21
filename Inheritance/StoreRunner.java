class StoreRunner{
	
	public static void main(String... args){
		
		Store store=new Store("dimpana","ckm",10,20000,true);
		System.out.println("name:"+store.storeName);
		System.out.println("location:"+store.location);
		System.out.println("numOfEmployees:"+store.numOfEmployees);
		System.out.println("revenue:"+store.revenue);
		System.out.println("isOpen:"+store.isOpen);
		
	}
}