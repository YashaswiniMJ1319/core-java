class CarModels {
    public static void main(String[] values)
    {
        String car1="Mustang";
        String car2="Civic";
        String car3="Corolla";
        String car4="Swift";
        String car5="i20";
        String car6="Verna";
        String car7="City";
        String car8="Creta";
        String car9="Fortuner";
        String car10="Innova";
        String car11="XUV700";
        String car12="Thar";
        String car13="Scorpio";
        String car14="Harrier";
        String car15="Safari";
        String car16="Baleno";
        String car17="Altroz";
        String car18="Polo";
        String car19="Virtus";
        String car20="Slavia";
        String car21="Kushaq";
        String car22="Seltos";
        String car23="Sonet";
        String car24="Venue";
        String car25="Compass";

        String[] cars = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10,car11,car12,car13,car14,car15,car16,car17,car18,car19,car20,
        car21,car22,car23,car24,car25};
        int size = cars.length;
        cars[1] = "Bus";
        System.out.println("The size of available elements are :" + size);
        System.out.println("The updated element is:" + cars[1]);
		for(int items=0;items<=24;items++){
            System.out.println(cars[items]);
        }
		System.out.println("\n reverse order \n");
        for(int items=size-1;items>=0;items--){
            System.out.println(cars[items]);
        }
		String name1=cars[-1];
		System.out.println("The retrived car name is:"+name1);
    }
}