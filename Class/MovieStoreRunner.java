class MovieStoreRunner{
	public static void main(String... args){
		MovieStore movieStore = new MovieStore();

		Movie m1 = new Movie("KGF",100000,"Prashanth Neel","Action",true,8.5,true,"Kannada",true,2.5);
		Movie m2 = new Movie("RRR",120000,"S S Rajamouli","Action",true,9.0,true,"Telugu",true,3.0);
		Movie m3 = new Movie("Inception",160000,"Christopher Nolan","SciFi",true,8.8,true,"English",false,2.8);
		Movie m4 = new Movie("Bahubali",180000,"S S Rajamouli","Epic",true,9.2,true,"Telugu",true,2.9);
		Movie m5 = new Movie("Pushpa",90000,"Sukumar","Action",true,8.0,true,"Telugu",true,2.7);
		Movie m6 = new Movie("Avatar",200000,"James Cameron","SciFi",true,9.1,true,"English",false,3.1);
		Movie m7 = new Movie("Dangal",70000,"Nitesh Tiwari","Drama",true,8.9,true,"Hindi",true,2.6);
		Movie m8 = new Movie("Jawan",110000,"Atlee","Action",true,8.3,true,"Hindi",true,2.5);
		Movie m9 = new Movie("Leo",95000,"Lokesh Kanagaraj","Action",true,8.2,true,"Tamil",true,2.6);
		Movie m10 = new Movie("Interstellar",165000,"Christopher Nolan","SciFi",true,9.3,true,"English",false,3.2);
		Movie m11 = new Movie("KGF2",120000,"Prashanth Neel","Action",true,9.0,true,"Kannada",true,2.6);
		Movie m12 = new Movie("RRR2",130000,"S S Rajamouli","Action",false,0.0,false,"Telugu",true,3.1);
		Movie m13 = new Movie("Tenet",150000,"Christopher Nolan","SciFi",true,7.5,false,"English",false,2.7);
		Movie m14 = new Movie("Salaar",140000,"Prashanth Neel","Action",true,8.7,true,"Telugu",true,2.8);
		Movie m15 = new Movie("Animal",100000,"Sandeep Reddy Vanga","Drama",true,8.4,true,"Hindi",true,2.9);
		Movie m16 = new Movie("Titanic",180000,"James Cameron","Romance",true,9.2,true,"English",false,3.1);
		Movie m17 = new Movie("PK",85000,"Rajkumar Hirani","Comedy",true,8.6,true,"Hindi",true,2.5);
		Movie m18 = new Movie("3Idiots",80000,"Rajkumar Hirani","Comedy",true,9.1,true,"Hindi",true,2.7);
		Movie m19 = new Movie("Vikram",95000,"Lokesh Kanagaraj","Action",true,8.9,true,"Tamil",true,2.6);
		Movie m20 = new Movie("Doctor Strange",170000,"Scott Derrickson","Fantasy",true,8.1,true,"English",false,2.4);

		movieStore.store(m1);
		movieStore.store(m2);
		movieStore.store(m3);
		movieStore.store(m4);
		movieStore.store(m5);
		movieStore.store(m6);
		movieStore.store(m7);
		movieStore.store(m8);
		movieStore.store(m9);
		movieStore.store(m10);
		movieStore.store(m11);
		movieStore.store(m12);
		movieStore.store(m13);
		movieStore.store(m14);
		movieStore.store(m15);
		movieStore.store(m16);
		movieStore.store(m17);
		movieStore.store(m18);
		movieStore.store(m19);
		movieStore.store(m20);

		movieStore.display();
	}
}