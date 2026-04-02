class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella u1 = new Umbrella("Fulton", "Automatic", "Black", "Polyester","Straight", "Large", "Rain Protection", "UK", 1200.0, 0.8);
        Umbrella u2 = new Umbrella("Totes", "Manual", "Red", "Nylon","Hook", "Medium", "Rain Protection", "USA", 900.0, 0.6);
        Umbrella u3 = new Umbrella("Cello", "Folding", "Blue", "Polyester","Straight", "Small", "Travel", "India", 700.0, 0.5);

        u1.display();
        u2.display();
        u3.display();
    }
}