class Lipsticks {
    public static void main(String[] values)
    {
        String lipstick1="Lakme";
        String lipstick2="Maybelline";
        String lipstick3="MAC";
        String lipstick4="Nykaa";
        String lipstick5="L'Oreal";
        String lipstick6="Colorbar";
        String lipstick7="Revlon";
        String lipstick8="Sugar";
        String lipstick9="Faces Canada";
        String lipstick10="Huda Beauty";

        String[] lipsticks = {lipstick1,lipstick2,lipstick3,lipstick4,lipstick5,lipstick6,lipstick7,lipstick8,lipstick9,lipstick10};
        int size = lipsticks.length;
        lipsticks[1] = "New one";
        System.out.println("The size of available elements are :" + size);
        System.out.println("The updated element is:" + lipsticks[1]);
		 for(int items=0; items<=10; items++){
            System.out.println(lipsticks[items]);
		 }
			
			System.out.println("\n reverse order \n");
			
        for(int items=9; items>=0; items--){
            System.out.println(lipsticks[items]);
        }
		String name1=lipsticks[20];
		System.out.println("The retrived car lipsticks is:"+name1);
    }
}