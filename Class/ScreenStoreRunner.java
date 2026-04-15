class ScreenStoreRunner{
	public static void main(String... args){
		ScreenStore screenStore = new ScreenStore();
		Screen screen1 = new Screen("Samsung",25000,32,"LED",true,1080,true,"Black",false,4.5);
		Screen screen2 = new Screen("LG",26000,40,"OLED",true,1440,true,"Silver",true,5.0);
		Screen screen3 = new Screen("Sony",30000,43,"LED",false,1080,true,"Black",false,5.5);
		Screen screen4 = new Screen("Dell",20000,27,"LCD",true,1080,false,"White",false,4.0);
		Screen screen5 = new Screen("HP",22000,24,"LED",false,720,false,"Black",false,3.8);
		Screen screen6 = new Screen("Asus",28000,32,"OLED",true,1440,true,"Grey",true,4.9);
		Screen screen7 = new Screen("Acer",21000,29,"LED",true,1080,false,"Black",false,4.2);
		Screen screen8 = new Screen("Lenovo",23000,31,"LCD",false,1080,true,"Silver",false,4.6);
		Screen screen9 = new Screen("MSI",35000,34,"OLED",true,2160,true,"Black",true,5.8);
		Screen screen10 = new Screen("BenQ",24000,28,"LED",false,1080,false,"White",false,4.3);
		Screen screen11 = new Screen("Samsung",27000,33,"QLED",true,1440,true,"Black",true,5.1);
		Screen screen12 = new Screen("LG",29000,35,"OLED",true,2160,true,"Grey",true,5.6);
		Screen screen13 = new Screen("Sony",31000,40,"LED",false,1080,true,"Black",false,5.2);
		Screen screen14 = new Screen("Dell",26000,30,"LCD",true,1440,false,"Silver",false,4.7);
		Screen screen15 = new Screen("HP",21000,25,"LED",false,720,false,"Black",false,3.9);
		Screen screen16 = new Screen("Asus",32000,38,"OLED",true,2160,true,"Black",true,6.0);
		Screen screen17 = new Screen("Acer",22000,27,"LED",true,1080,false,"White",false,4.1);
		Screen screen18 = new Screen("Lenovo",25000,29,"LCD",false,1080,true,"Grey",false,4.4);
		Screen screen19 = new Screen("MSI",36000,42,"OLED",true,2160,true,"Black",true,6.2);
		Screen screen20 = new Screen("BenQ",23000,26,"LED",false,1080,false,"Silver",false,4.0);

		screenStore.store(screen1);
		screenStore.store(screen2);
		screenStore.store(screen3);
		screenStore.store(screen4);
		screenStore.store(screen5);
		screenStore.store(screen6);
		screenStore.store(screen7);
		screenStore.store(screen8);
		screenStore.store(screen9);
		screenStore.store(screen10);
		screenStore.store(screen11);
		screenStore.store(screen12);
		screenStore.store(screen13);
		screenStore.store(screen14);
		screenStore.store(screen15);
		screenStore.store(screen16);
		screenStore.store(screen17);
		screenStore.store(screen18);
		screenStore.store(screen19);
		screenStore.store(screen20);

		screenStore.display();
	}
}