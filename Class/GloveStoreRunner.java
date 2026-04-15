class GloveStoreRunner{
	public static void main(String... args){
		GloveStore gloveStore = new GloveStore();

		Glove g1 = new Glove("Puma",500,"Leather","M",true,"Sports",true,"Black",false,0.3);
		Glove g2 = new Glove("Nike",550,"Synthetic","L",true,"Sports",true,"Blue",false,0.35);
		Glove g3 = new Glove("Adidas",600,"Leather","S",true,"Sports",true,"White",false,0.32);
		Glove g4 = new Glove("Reebok",450,"Cotton","M",false,"Casual",true,"Grey",false,0.25);
		Glove g5 = new Glove("Woodland",700,"Leather","L",true,"Winter",true,"Brown",false,0.4);
		Glove g6 = new Glove("Decathlon",400,"Synthetic","M",true,"Sports",true,"Black",false,0.28);
		Glove g7 = new Glove("HRX",350,"Cotton","S",false,"Casual",true,"Blue",false,0.2);
		Glove g8 = new Glove("Quechua",650,"Wool","L",true,"Winter",true,"Grey",false,0.45);
		Glove g9 = new Glove("Nivia",300,"Synthetic","M",false,"Sports",true,"Black",false,0.27);
		Glove g10 = new Glove("Yonex",750,"Leather","L",true,"Sports",true,"White",false,0.38);
		Glove g11 = new Glove("Puma",520,"Leather","M",true,"Sports",true,"Black",false,0.31);
		Glove g12 = new Glove("Nike",570,"Synthetic","L",true,"Sports",true,"Blue",false,0.36);
		Glove g13 = new Glove("Adidas",620,"Leather","S",true,"Sports",true,"White",false,0.33);
		Glove g14 = new Glove("Reebok",470,"Cotton","M",false,"Casual",true,"Grey",false,0.26);
		Glove g15 = new Glove("Woodland",720,"Leather","L",true,"Winter",true,"Brown",false,0.42);
		Glove g16 = new Glove("Decathlon",420,"Synthetic","M",true,"Sports",true,"Black",false,0.29);
		Glove g17 = new Glove("HRX",360,"Cotton","S",false,"Casual",true,"Blue",false,0.21);
		Glove g18 = new Glove("Quechua",670,"Wool","L",true,"Winter",true,"Grey",false,0.46);
		Glove g19 = new Glove("Nivia",320,"Synthetic","M",false,"Sports",true,"Black",false,0.28);
		Glove g20 = new Glove("Yonex",770,"Leather","L",true,"Sports",true,"White",false,0.39);

		gloveStore.store(g1);
		gloveStore.store(g2);
		gloveStore.store(g3);
		gloveStore.store(g4);
		gloveStore.store(g5);
		gloveStore.store(g6);
		gloveStore.store(g7);
		gloveStore.store(g8);
		gloveStore.store(g9);
		gloveStore.store(g10);
		gloveStore.store(g11);
		gloveStore.store(g12);
		gloveStore.store(g13);
		gloveStore.store(g14);
		gloveStore.store(g15);
		gloveStore.store(g16);
		gloveStore.store(g17);
		gloveStore.store(g18);
		gloveStore.store(g19);
		gloveStore.store(g20);

		gloveStore.display();
	}
}