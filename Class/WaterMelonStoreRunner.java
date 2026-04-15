class WaterMelonStoreRunner{
	public static void main(String... args){
		WaterMelonStore waterMelonStore = new WaterMelonStore();
		WaterMelon waterMelon1 = new WaterMelon("green",23.4,100,"Hassan",true,12,true,"sweet",true,12.4);
		WaterMelon waterMelon2 = new WaterMelon("dark green",24.4,101,"Mysore",true,13,true,"red",false,12.5);
		WaterMelon waterMelon3 = new WaterMelon("light green",25.4,102,"Bangalore",true,14,true,"hybrid",true,12.6);
		WaterMelon waterMelon4 = new WaterMelon("green stripes",26.4,103,"Tumkur",true,15,true,"local",false,12.7);
		WaterMelon waterMelon5 = new WaterMelon("yellow green",27.4,104,"Mandya",true,16,true,"sweet",true,12.8);
		WaterMelon waterMelon6 = new WaterMelon("green",28.4,105,"Hubli",true,17,true,"seeded",false,12.9);
		WaterMelon waterMelon7 = new WaterMelon("dark green",29.4,106,"Dharwad",true,18,true,"export",true,13.0);
		WaterMelon waterMelon8 = new WaterMelon("light green",30.4,107,"Belgaum",true,19,true,"local",false,13.1);
		WaterMelon waterMelon9 = new WaterMelon("striped",31.4,108,"Shivamogga",true,20,true,"sweet",true,13.2);
		WaterMelon waterMelon10 = new WaterMelon("green",32.4,109,"Chitradurga",true,21,true,"red",false,13.3);
		WaterMelon waterMelon11 = new WaterMelon("dark green",33.4,110,"Davangere",true,22,true,"hybrid",true,13.4);
		WaterMelon waterMelon12 = new WaterMelon("light green",34.4,111,"Udupi",true,23,true,"local",false,13.5);
		WaterMelon waterMelon13 = new WaterMelon("striped",35.4,112,"Mangalore",true,24,true,"sweet",true,13.6);
		WaterMelon waterMelon14 = new WaterMelon("yellow green",36.4,113,"Raichur",true,25,true,"seeded",false,13.7);
		WaterMelon waterMelon15 = new WaterMelon("green",37.4,114,"Ballari",true,26,true,"export",true,13.8);
		WaterMelon waterMelon16 = new WaterMelon("dark green",38.4,115,"Kolar",true,27,true,"local",false,13.9);
		WaterMelon waterMelon17 = new WaterMelon("light green",39.4,116,"Chikkaballapur",true,28,true,"sweet",true,14.0);
		WaterMelon waterMelon18 = new WaterMelon("striped",40.4,117,"Ramanagara",true,29,true,"red",false,14.1);
		WaterMelon waterMelon19 = new WaterMelon("yellow green",41.4,118,"Bidar",true,30,true,"hybrid",true,14.2);
		WaterMelon waterMelon20 = new WaterMelon("green",42.4,119,"Kalaburagi",true,31,true,"export",false,14.3);

		waterMelonStore.store(waterMelon1);
		waterMelonStore.store(waterMelon2);
		waterMelonStore.store(waterMelon3);
		waterMelonStore.store(waterMelon4);
		waterMelonStore.store(waterMelon5);
		waterMelonStore.store(waterMelon6);
		waterMelonStore.store(waterMelon7);
		waterMelonStore.store(waterMelon8);
		waterMelonStore.store(waterMelon9);
		waterMelonStore.store(waterMelon10);
		waterMelonStore.store(waterMelon11);
		waterMelonStore.store(waterMelon12);
		waterMelonStore.store(waterMelon13);
		waterMelonStore.store(waterMelon14);
		waterMelonStore.store(waterMelon15);
		waterMelonStore.store(waterMelon16);
		waterMelonStore.store(waterMelon17);
		waterMelonStore.store(waterMelon18);
		waterMelonStore.store(waterMelon19);
		waterMelonStore.store(waterMelon20);

		waterMelonStore.display();
	}
}