class CricketStoreRunner{
	public static void main(String... args){
		CricketStore cricketStore = new CricketStore();

		Cricket c1 = new Cricket("India",1000000,11,"Rohit",true,5,true,"Blue",true,1);
		Cricket c2 = new Cricket("Australia",950000,11,"Cummins",true,6,true,"Yellow",true,2);
		Cricket c3 = new Cricket("England",900000,11,"Buttler",true,4,true,"Red",false,3);
		Cricket c4 = new Cricket("Pakistan",850000,11,"Babar",true,2,true,"Green",false,4);
		Cricket c5 = new Cricket("SouthAfrica",800000,11,"Markram",true,1,true,"Green",false,5);
		Cricket c6 = new Cricket("NewZealand",820000,11,"Williamson",true,1,true,"Black",false,6);
		Cricket c7 = new Cricket("SriLanka",780000,11,"Shanaka",true,2,true,"Blue",false,7);
		Cricket c8 = new Cricket("Bangladesh",750000,11,"Shakib",true,0,true,"Green",false,8);
		Cricket c9 = new Cricket("Afghanistan",700000,11,"Nabi",true,0,true,"Blue",false,9);
		Cricket c10 = new Cricket("WestIndies",770000,11,"Holder",true,2,true,"Maroon",false,10);
		Cricket c11 = new Cricket("India",1100000,11,"Rohit",true,6,true,"Blue",true,1);
		Cricket c12 = new Cricket("Australia",960000,11,"Cummins",true,6,true,"Yellow",true,2);
		Cricket c13 = new Cricket("England",910000,11,"Buttler",true,4,true,"Red",false,3);
		Cricket c14 = new Cricket("Pakistan",860000,11,"Babar",true,2,true,"Green",false,4);
		Cricket c15 = new Cricket("SouthAfrica",810000,11,"Markram",true,1,true,"Green",false,5);
		Cricket c16 = new Cricket("NewZealand",830000,11,"Williamson",true,1,true,"Black",false,6);
		Cricket c17 = new Cricket("SriLanka",790000,11,"Shanaka",true,2,true,"Blue",false,7);
		Cricket c18 = new Cricket("Bangladesh",760000,11,"Shakib",true,0,true,"Green",false,8);
		Cricket c19 = new Cricket("Afghanistan",710000,11,"Nabi",true,0,true,"Blue",false,9);
		Cricket c20 = new Cricket("WestIndies",780000,11,"Holder",true,2,true,"Maroon",false,10);

		cricketStore.store(c1);
		cricketStore.store(c2);
		cricketStore.store(c3);
		cricketStore.store(c4);
		cricketStore.store(c5);
		cricketStore.store(c6);
		cricketStore.store(c7);
		cricketStore.store(c8);
		cricketStore.store(c9);
		cricketStore.store(c10);
		cricketStore.store(c11);
		cricketStore.store(c12);
		cricketStore.store(c13);
		cricketStore.store(c14);
		cricketStore.store(c15);
		cricketStore.store(c16);
		cricketStore.store(c17);
		cricketStore.store(c18);
		cricketStore.store(c19);
		cricketStore.store(c20);

		cricketStore.display();
	}
}