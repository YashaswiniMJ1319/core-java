class WindShieldRunner {
    public static void main(String[] args) {

        WindShield w1 = new WindShield();
        WindShield w2 = new WindShield("Saint-Gobain");
        WindShield w3 = new WindShield("AGC", "Tempered");
        WindShield w4 = new WindShield("Pilkington", "Laminated", "Glass");
        WindShield w5 = new WindShield("AGC", "Tempered", "Glass", 6000.0);
        WindShield w6 = new WindShield("Saint-Gobain", "Laminated", "Glass", 5000.0, 5.0);

        w1.display();
        w2.display();
        w3.display();
        w4.display();
        w5.display();
        w6.display();
    }
}