class FlightRunner{
    public static void main(String[] args) {
        Flight ref = new Flight();
        Flight seats = new Flight();
        Flight rate = new Flight();
        Flight code = new Flight();
        Flight price = new Flight();

        System.out.println("the flight name is:"+ref.name);
        System.out.println("the number of seats:"+seats.seats);
        System.out.println("the rating is :"+rate.rating);
        System.out.println("the code number is :"+code.code);
        System.out.println("the price is :"+price.price);

        ref.name = "Indigo";
        seats.seats = 180;
        rate.rating = 4.1f;
        code.code = 'I';
        price.price = 4500;

        System.out.println("the updated flight name is:"+ref.name);
        System.out.println("the updated number of seats:"+seats.seats);
        System.out.println("the updated rating is :"+rate.rating);
        System.out.println("the updated code number is :"+code.code);
        System.out.println("the updated price is :"+price.price);
    }
}
