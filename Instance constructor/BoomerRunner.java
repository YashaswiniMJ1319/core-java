class BoomerRunner {
    public static void main(String[] args) {
        Boomer b1 = new Boomer("Nike", "Sports", "Plastic", "Red","Curved", "Outdoor Play", "USA", "Modern", 500.0, 0.3);
        Boomer b2 = new Boomer("Decathlon", "Training", "Wood", "Brown","Classic", "Practice", "France", "Simple", 300.0, 0.5);
        Boomer b3 = new Boomer("Adidas", "Pro", "Fiber", "Black","Advanced", "Competition", "Germany", "Stylish", 800.0, 0.4);
        b1.display();
        b2.display();
        b3.display();
    }
}