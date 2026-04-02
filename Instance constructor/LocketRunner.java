class LocketRunner{
    public static void main(String[] args) {

        
        Locket l1 = new Locket("Heart Locket", "Tanishq", "Gold", "Gold",
                "Jewelry", "Floral", "Heart", "India", 5000.0, 10.5);

        Locket l2 = new Locket("Star Locket", "Malabar", "Silver", "Silver",
                "Jewelry", "Plain", "Star", "India", 3000.0, 8.2);

        Locket l3 = new Locket("Oval Locket", "Kalyan", "Rose Gold", "Alloy",
                "Jewelry", "Modern", "Oval", "India", 4200.0, 9.0);

        
        l1.display();
        l2.display();
        l3.display();
    }
}