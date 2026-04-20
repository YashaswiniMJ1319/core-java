class TagRunner{
	
	public static void main(String... args){
		Tag tag=new Tag("h1","hello");
		System.out.println("tag name:"+tag.tagName);
		System.out.println("tag value:"+tag.tagValue);
		
		Tag tag1=new Tag("p","world");
		System.out.println("tag name:"+tag1.tagName);
		System.out.println("tag value:"+tag1.tagValue);
		
	}
}