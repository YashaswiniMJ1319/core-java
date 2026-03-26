class FlagRunner{
	public static void main(String[] args){
		Flag ref=new Flag();
		Flag num=new Flag();
		Flag len=new Flag();
		Flag str=new Flag();
		Flag national=new Flag();
		
		System.out.println("the color name is:"+ref.color);
		System.out.println("the color name is:"+num.number);
		System.out.println("the color name is:"+len.length);
		System.out.println("the color name is:"+str.stripes);
		System.out.println("the color name is:"+str.stripes);
		System.out.println("the color name is:"+national.isNational);
		
		ref.color="Green";
		num.number=3;
		len.length=2.34;
		str.stripes=6;
		national.isNational=true;
		
		System.out.println("the updated color name is:"+ref.color);
		System.out.println("the updated color name is:"+num.number);
		System.out.println("the updated color name is:"+len.length);
		System.out.println("the updated color name is:"+str.stripes);
		System.out.println("the updated color name is:"+national.isNational);
	}
}