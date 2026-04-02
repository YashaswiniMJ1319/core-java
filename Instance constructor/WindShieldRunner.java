class WindShieldRunner {
    public static void main(String[] args) {

        WindShield w1 = new WindShield("Saint-Gobain", "Laminated", "Glass", "Transparent","Rectangular", "Car", "France", "Front", 5000.0, 5.0);
        WindShield w2 = new WindShield("AGC", "Tempered", "Glass", "Transparent","Curved", "SUV", "Japan", "Rear", 6000.0, 6.0);
        WindShield w3 = new WindShield("Pilkington", "Laminated", "Glass", "Tinted","Flat", "Truck", "UK", "Front", 7000.0, 8.0);
		
        w1.display();
        w2.display();
        w3.display();
    }
}