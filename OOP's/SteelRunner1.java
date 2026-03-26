class SteelRunner1{
	public static void main(String[] args){
		Steel ref=new Steel();
		Steel price=new Steel();
		Steel rate=new Steel();
		Steel gra=new Steel();
		Steel wid=new Steel();
		
		System.out.println("the steel name is:"+ref.name);
		System.out.println("the cost is:"+price.cost);
		System.out.println("the rating is:"+rate.rating);
		System.out.println("the grade is:"+gra.grade);
		System.out.println("the color name is:"+wid.width);
		
		
		ref.name="Stainless steel";
		price.cost=300;
		rate.rating=2.34f;
		gra.grade='A';
		wid.width=6.54;
		
		System.out.println("the updated  name is:"+ref.name);
		System.out.println("the updated cost  is:"+price.cost);
		System.out.println("the updated rating is:"+rate.rating);
		System.out.println("the updated grade is:"+gra.grade);
		System.out.println("the updated width is:"+wid.width);
	}
}
		
		
		