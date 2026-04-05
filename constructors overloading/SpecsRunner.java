class SpecsRunner {
    public static void main(String[] args) {
        Specs s1 = new Specs();
        Specs s2 = new Specs("RayBan");
        Specs s3 = new Specs("Fastrack", "Blue");
        Specs s4 = new Specs("Oakley", "Grey", "Sports");
		Specs s5=new Specs("Fiber", "Polarized","Blue",9500.0);
		Specs s6=new Specs("Fiber", "Polarized","Grey",9500.0,110.3);
		
        s1.display();
        s2.display();
        s3.display();
		s4.display();
		s5.display();
		s6.display();
    }
}