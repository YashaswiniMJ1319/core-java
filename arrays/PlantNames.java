class PlantNames {
    public static void main(String[] values)
    {
        String plant1="Neem";
        String plant2="Tulsi";
        String plant3="Aloe Vera";
        String plant4="Bamboo";
        String plant5="Rose";
        String plant6="Sunflower";
        String plant7="Cactus";
        String plant8="Money Plant";
        String plant9="Mint";
        String plant10="Coriander";
        String plant11="Lavender";
        String plant12="Jasmine";
        String plant13="Hibiscus";
        String plant14="Peepal";
        String plant15="Banyan";
        String plant16="Mango";
        String plant17="Banana";
        String plant18="Papaya";
        String plant19="Guava";
        String plant20="Coconut";
        String plant21="Apple";
        String plant22="Orange";
        String plant23="Lemon";
        String plant24="Ginger";
        String plant25="Turmeric";

        String[] plants = {plant1,plant2,plant3,plant4,plant5,plant6,plant7,plant8,plant9,plant10,
        plant11,plant12,plant13,plant14,plant15,plant16,plant17,plant18,plant19,plant20,plant21,plant22,plant23,plant24,plant25
        };
        int size = plants.length;
        plants[1] = "treee";
        System.out.println("The size of available elements are :" + size);
        System.out.println("The updated element is:" + plants[1]);
		for(int items=0;items<25;items++){
            System.out.println(plants[items]);
        }
		System.out.println("\n reverse order \n");

        for(int items=size-1;items>=0;items--){
            System.out.println(plants[items]);
        }
		String name1=plants[30];
		System.out.println("The retrived plant name is:"+name1);
    }
}