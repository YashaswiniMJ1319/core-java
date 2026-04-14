class LibraryRunner{
	public static void main(String[] args){
		Library library=new Library();
		library.save("12th fail");
		library.save("The power of subconsious mind");
		library.save("Richfather and poordad");
		library.save("Money");
		library.save("Cartoon");
		library.save("Car");
		
		library.search("Money");
		library.search("Mon");
	}
}
