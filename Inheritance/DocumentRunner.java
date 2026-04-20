class DocumentRunner{
	
	public static void main(String... args){
		
		Document docx=new Document(70,"Java tool");
		System.out.println("page count:"+ docx.pageCount);
		System.out.println("Document title:"+ docx.documentTitle);
		
		Document docx1=new Document(100,"JavaScript tool");
		System.out.println("page count:"+ docx1.pageCount);
		System.out.println("Document title:"+ docx1.documentTitle);
	}
}