class FireRunner{
	public static void main(String[] args){
		Fire ref=new Fire();
		System.out.println("Literal values");
		
		System.out.println("BrandName:"+ref.brandName);
		System.out.println("Type:"+ref.type);
		System.out.println("Capacity:"+ref.capacity);
		System.out.println("Range:"+ref.range);
		System.out.println("ClassType:"+ref.classType);
		
		ref.brandName="BlazeGuard";
		ref.type="Foam";
		ref.capacity=6;
		ref.range=4.0f;
		ref.classType='B';
		
		System.out.println("updated Literal values");
		
		System.out.println("updated BrandName:"+ref.brandName);
		System.out.println("updated Type:"+ref.type);
		System.out.println("updated Capacity:"+ref.capacity);
		System.out.println("updated Range:"+ref.range);
		System.out.println("updated ClassType:"+ref.classType);
		
		Fire model=new Fire();
		Fire weight=new Fire();
		Fire pressure=new Fire();
		Fire code=new Fire();
		Fire price=new Fire();
		Fire refillLife=new Fire();
		Fire users=new Fire();
		Fire size=new Fire();
		Fire quality=new Fire();
		Fire discount=new Fire();
		
		System.out.println("Model:");
		System.out.println(model.model+" "+model.weight+" "+model.pressure+" "+model.code+" "+model.price+" "+
		model.refillLife+" "+model.users+" "+model.size+" "+model.quality+" "+model.discount);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+weight.weight);
		System.out.println("pressure:"+weight.pressure);
		System.out.println("code:"+weight.code);
		System.out.println("price:"+weight.price);
		System.out.println("refillLife:"+weight.refillLife);
		System.out.println("users:"+weight.users);
		System.out.println("size:"+weight.size);
		System.out.println("quality:"+weight.quality);
		System.out.println("discount:"+weight.discount);
		System.out.println("model:"+weight.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+pressure.weight);
		System.out.println("pressure:"+pressure.pressure);
		System.out.println("code:"+pressure.code);
		System.out.println("price:"+pressure.price);
		System.out.println("refillLife:"+pressure.refillLife);
		System.out.println("users:"+pressure.users);
		System.out.println("size:"+pressure.size);
		System.out.println("quality:"+pressure.quality);
		System.out.println("discount:"+pressure.discount);
		System.out.println("model:"+pressure.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+code.weight);
		System.out.println("pressure:"+code.pressure);
		System.out.println("code:"+code.code);
		System.out.println("price:"+code.price);
		System.out.println("refillLife:"+code.refillLife);
		System.out.println("users:"+code.users);
		System.out.println("size:"+code.size);
		System.out.println("quality:"+code.quality);
		System.out.println("discount:"+code.discount);
		System.out.println("model:"+code.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+price.weight);
		System.out.println("pressure:"+price.pressure);
		System.out.println("code:"+price.code);
		System.out.println("price:"+price.price);
		System.out.println("refillLife:"+price.refillLife);
		System.out.println("users:"+price.users);
		System.out.println("size:"+price.size);
		System.out.println("quality:"+price.quality);
		System.out.println("discount:"+price.discount);
		System.out.println("model:"+price.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+refillLife.weight);
		System.out.println("pressure:"+refillLife.pressure);
		System.out.println("code:"+refillLife.code);
		System.out.println("price:"+refillLife.price);
		System.out.println("refillLife:"+refillLife.refillLife);
		System.out.println("users:"+refillLife.users);
		System.out.println("size:"+refillLife.size);
		System.out.println("quality:"+refillLife.quality);
		System.out.println("discount:"+refillLife.discount);
		System.out.println("model:"+refillLife.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+users.weight);
		System.out.println("pressure:"+users.pressure);
		System.out.println("code:"+users.code);
		System.out.println("price:"+users.price);
		System.out.println("refillLife:"+users.refillLife);
		System.out.println("users:"+users.users);
		System.out.println("size:"+users.size);
		System.out.println("quality:"+users.quality);
		System.out.println("discount:"+users.discount);
		System.out.println("model:"+users.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+size.weight);
		System.out.println("pressure:"+size.pressure);
		System.out.println("code:"+size.code);
		System.out.println("price:"+size.price);
		System.out.println("refillLife:"+size.refillLife);
		System.out.println("users:"+size.users);
		System.out.println("size:"+size.size);
		System.out.println("quality:"+size.quality);
		System.out.println("discount:"+size.discount);
		System.out.println("model:"+size.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+quality.weight);
		System.out.println("pressure:"+quality.pressure);
		System.out.println("code:"+quality.code);
		System.out.println("price:"+quality.price);
		System.out.println("refillLife:"+quality.refillLife);
		System.out.println("users:"+quality.users);
		System.out.println("size:"+quality.size);
		System.out.println("quality:"+quality.quality);
		System.out.println("discount:"+quality.discount);
		System.out.println("model:"+quality.model);
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+discount.weight);
		System.out.println("pressure:"+discount.pressure);
		System.out.println("code:"+discount.code);
		System.out.println("price:"+discount.price);
		System.out.println("refillLife:"+discount.refillLife);
		System.out.println("users:"+discount.users);
		System.out.println("size:"+discount.size);
		System.out.println("quality:"+discount.quality);
		System.out.println("discount:"+discount.discount);
		System.out.println("model:"+discount.model);
		
		System.out.println("\n  \n");
		
		
		
		model.model="FX100";
		model.weight=8;
		model.pressure=15.0f;
		model.code='A';
		model.price=2500;
		model.refillLife=12;
		model.users=2;
		model.size=35.5f;
		model.quality='A';
		model.discount=5;
		
		System.out.println(model.model+" "+model.weight+" "+model.pressure+" "+model.code+" "+model.price+" "+
		model.refillLife+" "+model.users+" "+model.size+" "+model.quality+" "+model.discount);
		

		model.model="FX100";
		model.weight=8;
		model.pressure=15.0f;
		model.code='A';
		model.price=2500;
		model.refillLife=12;
		model.users=2;
		model.size=35.5f;
		model.quality='A';
		model.discount=5; 
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+weight.weight);
		System.out.println("pressure:"+weight.pressure);
		System.out.println("code:"+weight.code);
		System.out.println("price:"+weight.price);
		System.out.println("refillLife:"+weight.refillLife);
		System.out.println("users:"+weight.users);
		System.out.println("size:"+weight.size);
		System.out.println("quality:"+weight.quality);
		System.out.println("discount:"+weight.discount);
		System.out.println("model:"+weight.model);

		weight.model="WG200";
		weight.weight=10;
		weight.pressure=18.0f;
		weight.code='B';
		weight.price=3000;
		weight.refillLife=15;
		weight.users=3;
		weight.size=40.0f;
		weight.quality='B';
		weight.discount=7;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+pressure.weight);
		System.out.println("pressure:"+pressure.pressure);
		System.out.println("code:"+pressure.code);
		System.out.println("price:"+pressure.price);
		System.out.println("refillLife:"+pressure.refillLife);
		System.out.println("users:"+pressure.users);
		System.out.println("size:"+pressure.size);
		System.out.println("quality:"+pressure.quality);
		System.out.println("discount:"+pressure.discount);
		System.out.println("model:"+pressure.model);
		

		pressure.model="PR300";
		pressure.weight=12;
		pressure.pressure=20.5f;
		pressure.code='C';
		pressure.price=3500;
		pressure.refillLife=18;
		pressure.users=4;
		pressure.size=42.0f;
		pressure.quality='A';
		pressure.discount=10;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+pressure.weight);
		System.out.println("pressure:"+pressure.pressure);
		System.out.println("code:"+pressure.code);
		System.out.println("price:"+pressure.price);
		System.out.println("refillLife:"+pressure.refillLife);
		System.out.println("users:"+pressure.users);
		System.out.println("size:"+pressure.size);
		System.out.println("quality:"+pressure.quality);
		System.out.println("discount:"+pressure.discount);
		System.out.println("model:"+pressure.model);

		code.model="CD400";
		code.weight=9;
		code.pressure=17.5f;
		code.code='D';
		code.price=2800;
		code.refillLife=14;
		code.users=2;
		code.size=38.0f;
		code.quality='B';
		code.discount=6;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+code.weight);
		System.out.println("pressure:"+code.pressure);
		System.out.println("code:"+code.code);
		System.out.println("price:"+code.price);
		System.out.println("refillLife:"+code.refillLife);
		System.out.println("users:"+code.users);
		System.out.println("size:"+code.size);
		System.out.println("quality:"+code.quality);
		System.out.println("discount:"+code.discount);
		System.out.println("model:"+code.model);

		price.model="PX500";
		price.weight=11;
		price.pressure=19.0f;
		price.code='E';
		price.price=3200;
		price.refillLife=16;
		price.users=3;
		price.size=41.5f;
		price.quality='A';
		price.discount=9;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+price.weight);
		System.out.println("pressure:"+price.pressure);
		System.out.println("code:"+price.code);
		System.out.println("price:"+price.price);
		System.out.println("refillLife:"+price.refillLife);
		System.out.println("users:"+price.users);
		System.out.println("size:"+price.size);
		System.out.println("quality:"+price.quality);
		System.out.println("discount:"+price.discount);
		System.out.println("model:"+price.model);

		refillLife.model="RL600";
		refillLife.weight=13;
		refillLife.pressure=22.0f;
		refillLife.code='F';
		refillLife.price=3700;
		refillLife.refillLife=20;
		refillLife.users=5;
		refillLife.size=45.0f;
		refillLife.quality='A';
		refillLife.discount=12;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+refillLife.weight);
		System.out.println("pressure:"+refillLife.pressure);
		System.out.println("code:"+refillLife.code);
		System.out.println("price:"+refillLife.price);
		System.out.println("refillLife:"+refillLife.refillLife);
		System.out.println("users:"+refillLife.users);
		System.out.println("size:"+refillLife.size);
		System.out.println("quality:"+refillLife.quality);
		System.out.println("discount:"+refillLife.discount);
		System.out.println("model:"+refillLife.model);

		users.model="US700";
		users.weight=7;
		users.pressure=16.0f;
		users.code='G';
		users.price=2600;
		users.refillLife=10;
		users.users=2;
		users.size=36.0f;
		users.quality='C';
		users.discount=5;  
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+users.weight);
		System.out.println("pressure:"+users.pressure);
		System.out.println("code:"+users.code);
		System.out.println("price:"+users.price);
		System.out.println("refillLife:"+users.refillLife);
		System.out.println("users:"+users.users);
		System.out.println("size:"+users.size);
		System.out.println("quality:"+users.quality);
		System.out.println("discount:"+users.discount);
		System.out.println("model:"+users.model);
		

		size.model="SZ800";
		size.weight=14;
		size.pressure=23.5f;
		size.code='H';
		size.price=3900;
		size.refillLife=22;
		size.users=6;
		size.size=46.5f;
		size.quality='B';
		size.discount=15;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+size.weight);
		System.out.println("pressure:"+size.pressure);
		System.out.println("code:"+size.code);
		System.out.println("price:"+size.price);
		System.out.println("refillLife:"+size.refillLife);
		System.out.println("users:"+size.users);
		System.out.println("size:"+size.size);
		System.out.println("quality:"+size.quality);
		System.out.println("discount:"+size.discount);
		System.out.println("model:"+size.model);

		quality.model="QL900";
		quality.weight=15;
		quality.pressure=25.0f;
		quality.code='I';
		quality.price=4200;
		quality.refillLife=25;
		quality.users=7;
		quality.size=48.0f;
		quality.quality='A';
		quality.discount=18;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+quality.weight);
		System.out.println("pressure:"+quality.pressure);
		System.out.println("code:"+quality.code);
		System.out.println("price:"+quality.price);
		System.out.println("refillLife:"+quality.refillLife);
		System.out.println("users:"+quality.users);
		System.out.println("size:"+quality.size);
		System.out.println("quality:"+quality.quality);
		System.out.println("discount:"+quality.discount);
		System.out.println("model:"+quality.model);

		discount.model="DC1000";
		discount.weight=6;
		discount.pressure=14.0f;
		discount.code='J';
		discount.price=2000;
		discount.refillLife=8;
		discount.users=1;
		discount.size=34.0f;
		discount.quality='C';
		discount.discount=20;
		
		System.out.println("\n  \n");
		
		System.out.println("weight:"+discount.weight);
		System.out.println("pressure:"+discount.pressure);
		System.out.println("code:"+discount.code);
		System.out.println("price:"+discount.price);
		System.out.println("refillLife:"+discount.refillLife);
		System.out.println("users:"+discount.users);
		System.out.println("size:"+discount.size);
		System.out.println("quality:"+discount.quality);
		System.out.println("discount:"+discount.discount);
		System.out.println("model:"+discount.model);
	}
}