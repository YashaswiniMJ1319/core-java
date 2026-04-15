class Movie{
	String name;
	double budget;
	String director;
	String genre;
	boolean isReleased;
	double rating;
	boolean isHit;
	String language;
	boolean isPanIndia;
	double duration;

	Movie(String name,double budget,String director,String genre,boolean isReleased,
	double rating,boolean isHit,String language,boolean isPanIndia,double duration){
		this.name=name;
		this.budget=budget;
		this.director=director;
		this.genre=genre;
		this.isReleased=isReleased;
		this.rating=rating;
		this.isHit=isHit;
		this.language=language;
		this.isPanIndia=isPanIndia;
		this.duration=duration;
	}

	void display(){
		System.out.println("displaying the properties of movie");
		System.out.println("name:"+name);
		System.out.println("budget:"+budget);
		System.out.println("director:"+director);
		System.out.println("genre:"+genre);
		System.out.println("isReleased:"+isReleased);
		System.out.println("rating:"+rating);
		System.out.println("isHit:"+isHit);
		System.out.println("language:"+language);
		System.out.println("isPanIndia:"+isPanIndia);
		System.out.println("duration:"+duration);
	}
}

