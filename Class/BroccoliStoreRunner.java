class BroccoliStoreRunner{
	public static void main(String... args){
		BroccoliStore broccoliStore = new BroccoliStore();

		Broccoli b1 = new Broccoli("FreshFarm",120,0.5,"Organic",true,"Green",true,"India",true,10);
		Broccoli b2 = new Broccoli("GreenLeaf",110,0.6,"Hybrid",false,"Green",true,"India",false,12);
		Broccoli b3 = new Broccoli("NatureBest",130,0.7,"Organic",true,"DarkGreen",true,"USA",true,8);
		Broccoli b4 = new Broccoli("VeggieMart",100,0.5,"Hybrid",false,"Green",true,"India",false,15);
		Broccoli b5 = new Broccoli("FarmFresh",115,0.55,"Organic",true,"Green",true,"India",true,9);
		Broccoli b6 = new Broccoli("EcoVeg",140,0.8,"Organic",true,"DarkGreen",true,"Australia",true,7);
		Broccoli b7 = new Broccoli("DailyVeg",105,0.5,"Hybrid",false,"Green",true,"India",false,14);
		Broccoli b8 = new Broccoli("HealthyFarm",125,0.65,"Organic",true,"Green",true,"USA",true,11);
		Broccoli b9 = new Broccoli("GreenBasket",135,0.75,"Organic",true,"DarkGreen",true,"UK",true,6);
		Broccoli b10 = new Broccoli("SuperVeg",95,0.45,"Hybrid",false,"Green",true,"India",false,16);
		Broccoli b11 = new Broccoli("FreshFarm",122,0.52,"Organic",true,"Green",true,"India",true,10);
		Broccoli b12 = new Broccoli("GreenLeaf",112,0.62,"Hybrid",false,"Green",true,"India",false,12);
		Broccoli b13 = new Broccoli("NatureBest",132,0.72,"Organic",true,"DarkGreen",true,"USA",true,8);
		Broccoli b14 = new Broccoli("VeggieMart",102,0.52,"Hybrid",false,"Green",true,"India",false,15);
		Broccoli b15 = new Broccoli("FarmFresh",118,0.57,"Organic",true,"Green",true,"India",true,9);
		Broccoli b16 = new Broccoli("EcoVeg",145,0.82,"Organic",true,"DarkGreen",true,"Australia",true,7);
		Broccoli b17 = new Broccoli("DailyVeg",108,0.5,"Hybrid",false,"Green",true,"India",false,14);
		Broccoli b18 = new Broccoli("HealthyFarm",128,0.67,"Organic",true,"Green",true,"USA",true,11);
		Broccoli b19 = new Broccoli("GreenBasket",138,0.77,"Organic",true,"DarkGreen",true,"UK",true,6);
		Broccoli b20 = new Broccoli("SuperVeg",98,0.48,"Hybrid",false,"Green",true,"India",false,16);

		broccoliStore.store(b1);
		broccoliStore.store(b2);
		broccoliStore.store(b3);
		broccoliStore.store(b4);
		broccoliStore.store(b5);
		broccoliStore.store(b6);
		broccoliStore.store(b7);
		broccoliStore.store(b8);
		broccoliStore.store(b9);
		broccoliStore.store(b10);
		broccoliStore.store(b11);
		broccoliStore.store(b12);
		broccoliStore.store(b13);
		broccoliStore.store(b14);
		broccoliStore.store(b15);
		broccoliStore.store(b16);
		broccoliStore.store(b17);
		broccoliStore.store(b18);
		broccoliStore.store(b19);
		broccoliStore.store(b20);

		broccoliStore.display();
	}
}