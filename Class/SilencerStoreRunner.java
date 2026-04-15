class SilencerStoreRunner{
	public static void main(String... args){
		SilencerStore silencerStore = new SilencerStore();

		Silencer s1 = new Silencer("Yamaha",5000,"Steel",30,2.5,true,"Black","Sport",true,2);
		Silencer s2 = new Silencer("Honda",4500,"Alloy",28,2.2,false,"Silver","Standard",true,1);
		Silencer s3 = new Silencer("Suzuki",5200,"Steel",32,2.8,true,"Black","Sport",false,2);
		Silencer s4 = new Silencer("Bajaj",4000,"Iron",27,2.0,false,"Grey","Standard",true,1);
		Silencer s5 = new Silencer("TVS",3800,"Steel",26,1.9,true,"Black","Standard",false,1);
		Silencer s6 = new Silencer("KTM",7000,"Titanium",35,3.0,true,"Orange","Racing",false,3);
		Silencer s7 = new Silencer("RoyalEnfield",6500,"Steel",34,3.2,false,"Black","Classic",false,2);
		Silencer s8 = new Silencer("Hero",3500,"Iron",25,1.8,true,"Silver","Standard",true,1);
		Silencer s9 = new Silencer("Jawa",6000,"Steel",33,2.9,true,"Black","Classic",false,2);
		Silencer s10 = new Silencer("Benelli",7200,"Titanium",36,3.3,true,"Black","Racing",false,3);
		Silencer s11 = new Silencer("Yamaha",5100,"Steel",30,2.6,true,"Blue","Sport",true,2);
		Silencer s12 = new Silencer("Honda",4600,"Alloy",29,2.3,false,"Grey","Standard",true,1);
		Silencer s13 = new Silencer("Suzuki",5300,"Steel",31,2.7,true,"Black","Sport",false,2);
		Silencer s14 = new Silencer("Bajaj",4200,"Iron",28,2.1,false,"Silver","Standard",true,1);
		Silencer s15 = new Silencer("TVS",3900,"Steel",26,1.9,true,"Black","Standard",false,1);
		Silencer s16 = new Silencer("KTM",7500,"Titanium",37,3.4,true,"Orange","Racing",false,3);
		Silencer s17 = new Silencer("RoyalEnfield",6700,"Steel",34,3.1,false,"Black","Classic",false,2);
		Silencer s18 = new Silencer("Hero",3600,"Iron",25,1.7,true,"Silver","Standard",true,1);
		Silencer s19 = new Silencer("Jawa",6200,"Steel",33,3.0,true,"Black","Classic",false,2);
		Silencer s20 = new Silencer("Benelli",7300,"Titanium",36,3.5,true,"Black","Racing",false,3);

		silencerStore.store(s1);
		silencerStore.store(s2);
		silencerStore.store(s3);
		silencerStore.store(s4);
		silencerStore.store(s5);
		silencerStore.store(s6);
		silencerStore.store(s7);
		silencerStore.store(s8);
		silencerStore.store(s9);
		silencerStore.store(s10);
		silencerStore.store(s11);
		silencerStore.store(s12);
		silencerStore.store(s13);
		silencerStore.store(s14);
		silencerStore.store(s15);
		silencerStore.store(s16);
		silencerStore.store(s17);
		silencerStore.store(s18);
		silencerStore.store(s19);
		silencerStore.store(s20);

		silencerStore.display();
	}
}