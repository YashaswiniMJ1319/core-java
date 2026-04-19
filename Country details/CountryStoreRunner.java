class CountryStoreRunner {
    public static void main(String[] args){

        Collector col = new Collector("Yashu", 10);

        District d1 = new District("Hassan", col);
        District d2 = new District("Mysore", col);

        District[] districts = {d1, d2};

        City city = new City("Arsikere", 2, districts);

        State state = new State("Karnataka", 61130704, city);
        State[] states = {state};
		

        Address addr = new Address(923, 573100);

        President pres = new President("Prathiba", 22, addr);

        Country country = new Country("India", pres, states);

        CountryStore store = new CountryStore();
        store.save(country);

        System.out.println("\n=====================\n");
        store.display();

        System.out.println("\n======================\n");

        Country c1 = store.findByName("India");
        if(c1 != null){
            System.out.println("Found Country: " + c1.name);
        }

        State s1 = store.findStateByStateName("Karnataka");
        if(s1 != null){
            System.out.println("Found State: " + s1.name);
        }

        City[] cities = store.findAllCityByStateName("Karnataka");
        if(cities != null){
            for(City c : cities){
                System.out.println("City: " + c.name);
            }
        }

        int count = store.findNoOfDistrictsByCityName("Arsikere");
        System.out.println("No of Districts: " + count);

        Country c2 = store.findByCollectorName("Yashu");
        if(c2 != null){
            System.out.println("Country by Collector: " + c2.name);
        }
    }
}