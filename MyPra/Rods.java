class Rods{
    public static void main(String[] args){

        Rod.metal();
		String name="Gold";
		int price=20130;
		double wt=34.54;
		char grade='A';
		Rod.metals(name,price,wt,grade);
		Rod.metals("Silver",1000,23.5,'A');

    }
}