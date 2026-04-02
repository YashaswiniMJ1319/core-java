class SpecsRunner {
    public static void main(String[] args) {

        Specs s1 = new Specs("RayBan", "Black", "Sunglasses", "Metal","UV Protected", "Round", "Medium", "Italy", 7500.0, 120.5);

        Specs s2 = new Specs("Fastrack", "Blue", "Eyeglasses", "Plastic","Anti-Glare", "Square", "Large", "India", 2500.0, 100.0);

        Specs s3 = new Specs("Oakley", "Grey", "Sports", "Fiber", "Polarized", "Rectangle", "Small", "USA", 9500.0, 110.3);
		
        s1.display();
        s2.display();
        s3.display();
    }
}
