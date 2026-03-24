class GunModels{
public static void main(String[] values)
	{
		String gun1="AK-47";
		String gun2="AK-74";
		String gun3="M16";
		String gun4="M4 Carbine";
		String gun5="AR-15";
		String gun6="Glock 17";
		String gun7="Glock 19";
		String gun8="Beretta M9";
		String gun9="SIG Sauer P320";
		String gun10="Desert Eagle";
		String gun11="MP5";
		String gun12="UMP45";
		String gun13="FN SCAR";
		String gun14="FAMAS";
		String gun15="Steyr AUG";
		String gun16="Tavor X95";
		String gun17="Lee-Enfield";
		String gun18="Kar98k";
		String gun19="Barrett M82";
		String gun20="Dragunov SVD";
		String gun21="Remington 870";
		String gun22="Mossberg 500";
		String gun23="Winchester Model 70";
		String gun24="Ruger 10/22";
		String gun25="Colt Python";
		String gun26="Smith & Wesson Model 29";
		String gun27="CZ 75";
		String gun28="Walther PPK";
		String gun29="HK416";
		String gun30="HK417";
		String [] guns={gun1,gun2, gun3, gun4, gun5,gun6, gun7, gun8, gun9, gun10,gun11, gun12, gun13, gun14, gun15,
        gun16, gun17, gun18, gun19, gun20,gun21, gun22, gun23, gun24, gun25,gun26, gun27, gun28, gun29, gun30};
		int size=guns.length;
		guns[1]="nothing";
		System.out.println("The size of available elements are :"+size);
		System.out.println("The updated element is:"+guns[1]);
		for(int items=0;items<size;items++){
			System.out.println(guns[items]);
		}
		System.out.println("\n reverse order \n");
		for(int items=29;items>=0;items--){
			System.out.println(guns[items]);
		}
		String name1=guns[31];
		System.out.println("The retrived gun name is:"+name1);
		
	}
	}