class BoomerRunner {
    public static void main(String[] args) {

        Boomer b1 = new Boomer();
        Boomer b2 = new Boomer("Nike");
        Boomer b3 = new Boomer("Decathlon", "Training");
        Boomer b4 = new Boomer("Adidas", "Pro", "Fiber");
        Boomer b5 = new Boomer("Nike", "Sports", "Plastic", 500.0);
        Boomer b6 = new Boomer("Adidas", "Pro", "Fiber", 800.0, 0.4);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
    }
}