class TissueStoreRunner{
	public static void main(String... args){
		TissueStore tissueStore = new TissueStore();

		Tissue t1 = new Tissue("Kleenex",120,100,"Facial",true,3,false,"White",false,0.5);
		Tissue t2 = new Tissue("Origami",90,80,"Facial",true,2,true,"White",false,0.4);
		Tissue t3 = new Tissue("Premier",110,90,"Toilet",true,3,false,"White",false,0.6);
		Tissue t4 = new Tissue("Bella",85,70,"Napkin",false,2,true,"White",true,0.3);
		Tissue t5 = new Tissue("Softy",95,85,"Facial",true,2,false,"White",false,0.45);
		Tissue t6 = new Tissue("Paseo",130,120,"Toilet",true,3,false,"White",false,0.7);
		Tissue t7 = new Tissue("Velvet",100,95,"Facial",true,2,true,"White",true,0.5);
		Tissue t8 = new Tissue("Selpak",140,110,"Toilet",true,3,false,"White",false,0.75);
		Tissue t9 = new Tissue("Tempo",150,130,"Facial",true,4,false,"White",true,0.8);
		Tissue t10 = new Tissue("Nice",80,60,"Napkin",false,1,true,"White",false,0.25);
		Tissue t11 = new Tissue("Kleenex",125,105,"Facial",true,3,false,"White",false,0.55);
		Tissue t12 = new Tissue("Origami",95,85,"Facial",true,2,true,"White",false,0.42);
		Tissue t13 = new Tissue("Premier",115,95,"Toilet",true,3,false,"White",false,0.65);
		Tissue t14 = new Tissue("Bella",88,75,"Napkin",false,2,true,"White",true,0.35);
		Tissue t15 = new Tissue("Softy",98,88,"Facial",true,2,false,"White",false,0.48);
		Tissue t16 = new Tissue("Paseo",135,125,"Toilet",true,3,false,"White",false,0.72);
		Tissue t17 = new Tissue("Velvet",105,98,"Facial",true,2,true,"White",true,0.52);
		Tissue t18 = new Tissue("Selpak",145,115,"Toilet",true,3,false,"White",false,0.78);
		Tissue t19 = new Tissue("Tempo",155,135,"Facial",true,4,false,"White",true,0.82);
		Tissue t20 = new Tissue("Nice",82,65,"Napkin",false,1,true,"White",false,0.28);

		tissueStore.store(t1);
		tissueStore.store(t2);
		tissueStore.store(t3);
		tissueStore.store(t4);
		tissueStore.store(t5);
		tissueStore.store(t6);
		tissueStore.store(t7);
		tissueStore.store(t8);
		tissueStore.store(t9);
		tissueStore.store(t10);
		tissueStore.store(t11);
		tissueStore.store(t12);
		tissueStore.store(t13);
		tissueStore.store(t14);
		tissueStore.store(t15);
		tissueStore.store(t16);
		tissueStore.store(t17);
		tissueStore.store(t18);
		tissueStore.store(t19);
		tissueStore.store(t20);

		tissueStore.display();
	}
}