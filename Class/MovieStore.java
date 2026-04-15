class MovieStore{
	Movie[] movie=new Movie[20];
	int index=0;

	void store(Movie movie){
		if(movie!=null){
			System.out.println("getting the details");
			if(this.index<this.movie.length){
				System.out.println("the given element is within the range");
				this.movie[this.index]=movie;
				System.out.println("getting the properties of the movie:"+movie);
				index++;
			}
			else{
				System.out.println("the data is out of range");
			}
		}
		else{
			System.out.println("invalid");
		}
	}

	void display(){
		for(int start=0;start<index;start++){
			movie[start].display();
		}
	}
}

