class TouristPlaces {
    public static void main(String[] values)
    {
        String place1="Taj Mahal";
        String place2="Mysore Palace";
        String place3="Goa";
        String place4="Kerala";
        String place5="Manali";
        String place6="Shimla";
        String place7="Ooty";
        String place8="Coorg";
        String place9="Hampi";
        String place10="Jaipur";
        String place11="Udaipur";
        String place12="Varanasi";
        String place13="Rishikesh";
        String place14="Amritsar";
        String place15="Darjeeling";
        String place16="Andaman";
        String place17="Leh Ladakh";
        String place18="Mount Abu";
        String place19="Mahabalipuram";
        String place20="Kodaikanal";
        String place21="Chennai";
        String place22="Bangalore";
        String place23="Hyderabad";
        String place24="Delhi";
        String place25="Mumbai";
        String place26="Pune";
        String place27="Agra";
        String place28="Lucknow";
        String place29="Patna";
        String place30="Kolkata";
        String[] places = {place1,place2,place3,place4,place5,place6,place7,place8,place9,place10,place11,place12,place13,place14,place15,
        place16,place17,place18,place19,place20,place21,place22,place23,place24,place25,place26,place27,place28,place29,place30};
        int size = places.length;
        places[1] = "empty";
        System.out.println("The size of available elements are :" + size);
        System.out.println("The updated element is:" + places[1]);
        for(int i=29;i>=0;){
            System.out.println(places[i]);
			i--;
        }
		String name1=places[100];
		System.out.println("The retrived place name is:"+name1);
    }
}