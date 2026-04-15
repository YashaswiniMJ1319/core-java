class LaserStoreRunner{
	public static void main(String... args){
		LaserStore laserStore = new LaserStore();

		Laser l1 = new Laser("Bosch",5000,5,"Industrial",false,650,true,"Red",true,1.2);
		Laser l2 = new Laser("Philips",3500,3,"Medical",true,532,true,"Green",false,0.9);
		Laser l3 = new Laser("Sony",4200,4,"Cutting",false,808,false,"Black",true,1.5);
		Laser l4 = new Laser("Panasonic",3000,2.5,"Pointer",true,650,true,"Red",false,0.6);
		Laser l5 = new Laser("LG",2800,2,"Pointer",true,532,false,"Green",false,0.5);
		Laser l6 = new Laser("Samsung",4500,4.5,"Industrial",false,1064,true,"Black",true,1.7);
		Laser l7 = new Laser("Hitachi",3900,3.8,"Cutting",false,808,false,"Grey",true,1.4);
		Laser l8 = new Laser("Sharp",3200,2.8,"Medical",true,650,true,"White",false,0.8);
		Laser l9 = new Laser("Toshiba",4700,5.2,"Industrial",false,1064,true,"Black",true,1.8);
		Laser l10 = new Laser("Canon",3100,2.6,"Pointer",true,532,false,"Red",false,0.7);
		Laser l11 = new Laser("Bosch",5200,5.5,"Industrial",false,650,true,"Red",true,1.3);
		Laser l12 = new Laser("Philips",3600,3.2,"Medical",true,532,true,"Green",false,0.95);
		Laser l13 = new Laser("Sony",4300,4.2,"Cutting",false,808,false,"Black",true,1.6);
		Laser l14 = new Laser("Panasonic",3100,2.7,"Pointer",true,650,true,"Red",false,0.65);
		Laser l15 = new Laser("LG",2900,2.1,"Pointer",true,532,false,"Green",false,0.55);
		Laser l16 = new Laser("Samsung",4600,4.7,"Industrial",false,1064,true,"Black",true,1.75);
		Laser l17 = new Laser("Hitachi",4000,3.9,"Cutting",false,808,false,"Grey",true,1.45);
		Laser l18 = new Laser("Sharp",3300,2.9,"Medical",true,650,true,"White",false,0.85);
		Laser l19 = new Laser("Toshiba",4800,5.3,"Industrial",false,1064,true,"Black",true,1.85);
		Laser l20 = new Laser("Canon",3200,2.7,"Pointer",true,532,false,"Red",false,0.75);

		laserStore.store(l1);
		laserStore.store(l2);
		laserStore.store(l3);
		laserStore.store(l4);
		laserStore.store(l5);
		laserStore.store(l6);
		laserStore.store(l7);
		laserStore.store(l8);
		laserStore.store(l9);
		laserStore.store(l10);
		laserStore.store(l11);
		laserStore.store(l12);
		laserStore.store(l13);
		laserStore.store(l14);
		laserStore.store(l15);
		laserStore.store(l16);
		laserStore.store(l17);
		laserStore.store(l18);
		laserStore.store(l19);
		laserStore.store(l20);

		laserStore.display();
	}
}