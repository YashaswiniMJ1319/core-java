class LocketRunner{
    public static void main(String[] args) {
        Locket l1=new Locket();
		Locket l2=new Locket("Heart Locket");
		Locket l3 = new Locket("triangle Locket","Malabar");
        Locket l4 = new Locket("Star Locket", "Malabar", 3000.0);
        Locket l5 = new Locket("Oval Locket", "Kalyan", 4200.0, 9.0);
		Locket l6 = new Locket("Oval Locket", "Kalyan", 4200.0, 9.0,30);
        l1.display();
        l2.display();
        l3.display();
		l4.display();
		l5.display();
		l6.display();
    }
} 
