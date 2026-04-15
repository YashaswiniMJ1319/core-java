class SpaceShipStoreRunner{
	public static void main(String... args){
		SpaceShipStore spaceShipStore = new SpaceShipStore();

		SpaceShip s1 = new SpaceShip("Apollo",5000000,3,"Crew",false,25000,true,"White",false,30);
		SpaceShip s2 = new SpaceShip("Falcon9",7000000,0,"Cargo",true,27000,false,"White",true,40);
		SpaceShip s3 = new SpaceShip("Dragon",6500000,7,"Crew",true,26000,true,"White",true,35);
		SpaceShip s4 = new SpaceShip("Starship",9000000,100,"Crew",true,30000,true,"Silver",false,100);
		SpaceShip s5 = new SpaceShip("Soyuz",5500000,3,"Crew",false,24000,true,"Grey",true,28);
		SpaceShip s6 = new SpaceShip("Shenzhou",5800000,3,"Crew",false,24500,true,"White",true,29);
		SpaceShip s7 = new SpaceShip("NewShepard",6000000,6,"Tourism",true,26000,true,"Blue",true,32);
		SpaceShip s8 = new SpaceShip("SaturnV",10000000,3,"Cargo",false,28000,true,"White",false,120);
		SpaceShip s9 = new SpaceShip("Vostok",5200000,1,"Crew",false,23000,true,"Grey",false,25);
		SpaceShip s10 = new SpaceShip("Challenger",7500000,7,"Crew",true,27000,true,"White",false,45);
		SpaceShip s11 = new SpaceShip("ApolloX",5100000,3,"Crew",false,25500,true,"White",false,31);
		SpaceShip s12 = new SpaceShip("FalconHeavy",8000000,0,"Cargo",true,29000,false,"White",true,50);
		SpaceShip s13 = new SpaceShip("DragonX",6700000,7,"Crew",true,26500,true,"White",true,36);
		SpaceShip s14 = new SpaceShip("Starliner",8800000,5,"Crew",true,29500,true,"White",true,60);
		SpaceShip s15 = new SpaceShip("SoyuzX",5600000,3,"Crew",false,24200,true,"Grey",true,27);
		SpaceShip s16 = new SpaceShip("ShenzhouX",5900000,3,"Crew",false,24700,true,"White",true,30);
		SpaceShip s17 = new SpaceShip("NewGlenn",8500000,0,"Cargo",true,28500,false,"Blue",true,55);
		SpaceShip s18 = new SpaceShip("SaturnVI",10200000,3,"Cargo",false,28200,true,"White",false,125);
		SpaceShip s19 = new SpaceShip("VostokX",5300000,1,"Crew",false,23200,true,"Grey",false,26);
		SpaceShip s20 = new SpaceShip("Discovery",7700000,7,"Crew",true,27500,true,"White",true,48);

		spaceShipStore.store(s1);
		spaceShipStore.store(s2);
		spaceShipStore.store(s3);
		spaceShipStore.store(s4);
		spaceShipStore.store(s5);
		spaceShipStore.store(s6);
		spaceShipStore.store(s7);
		spaceShipStore.store(s8);
		spaceShipStore.store(s9);
		spaceShipStore.store(s10);
		spaceShipStore.store(s11);
		spaceShipStore.store(s12);
		spaceShipStore.store(s13);
		spaceShipStore.store(s14);
		spaceShipStore.store(s15);
		spaceShipStore.store(s16);
		spaceShipStore.store(s17);
		spaceShipStore.store(s18);
		spaceShipStore.store(s19);
		spaceShipStore.store(s20);

		spaceShipStore.display();
	}
}