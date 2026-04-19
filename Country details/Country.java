class Country {

    String name;
    President president;
    State[] states;

    Country(String name, President president, State[] states){
        this.name = name;
        this.president = president;
        this.states = states;
    }

    void display(){
        System.out.println("the name of the country is:"+name);

        president.display();

        for(State star : states){
            star.display();
        }
    }
}