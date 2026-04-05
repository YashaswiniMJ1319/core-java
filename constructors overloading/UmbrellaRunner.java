class UmbrellaRunner {
    public static void main(String[] args) {

        Umbrella u1 = new Umbrella();
        Umbrella u2 = new Umbrella("Fulton");
        Umbrella u3 = new Umbrella("Totes", "Manual");
        Umbrella u4 = new Umbrella("Cello", "Folding", "Blue");
        Umbrella u5 = new Umbrella("Fulton", "Automatic", "Black", 1200.0);
        Umbrella u6 = new Umbrella("Totes", "Manual", "Red", 900.0, 0.6);

        u1.display();
        u2.display();
        u3.display();
        u4.display();
        u5.display();
        u6.display();
    }
}