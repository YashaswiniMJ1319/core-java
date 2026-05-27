class AppTestRunner{
	
	public static void main(String... args){
		
		Application application=new WebApplication();
		
		AppTest appTest=new AppTest();
		appTest.test(application);
	}

}