class LampRunner{
    public static void main(String[] args){
        
        Lamp ref=new Lamp();
        System.out.println("Literal values");
        
        System.out.println("BrandName:"+ref.brandName);
        System.out.println("Type:"+ref.type);
        System.out.println("Watt:"+ref.watt);
        System.out.println("Voltage:"+ref.voltage);
        System.out.println("Grade:"+ref.grade);
        
        ref.brandName="Havells";
        ref.type="SmartLED";
        ref.watt=12;
        ref.voltage=240.5f;
        ref.grade='B';
        
        System.out.println("updated Literal values");
        
        System.out.println("updated BrandName:"+ref.brandName);
        System.out.println("updated Type:"+ref.type);
        System.out.println("updated Watt:"+ref.watt);
        System.out.println("updated Voltage:"+ref.voltage);
        System.out.println("updated Grade:"+ref.grade);
        
        Lamp model=new Lamp();
        Lamp range=new Lamp();
        Lamp frequency=new Lamp();
        Lamp code=new Lamp();
        Lamp price=new Lamp();
        Lamp brightness=new Lamp();
        Lamp users=new Lamp();
        Lamp weight=new Lamp();
        Lamp quality=new Lamp();
        Lamp discount=new Lamp();
        
        System.out.println("Model:");
        System.out.println(model.model+" "+model.range+" "+model.frequency+" "+model.code+" "+model.price+" "+
        model.brightness+" "+model.users+" "+model.weight+" "+model.quality+" "+model.discount);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+range.range);
        System.out.println("frequency:"+range.frequency);
        System.out.println("code:"+range.code);
        System.out.println("price:"+range.price);
        System.out.println("brightness:"+range.brightness);
        System.out.println("users:"+range.users);
        System.out.println("weight:"+range.weight);
        System.out.println("quality:"+range.quality);
        System.out.println("discount:"+range.discount);
        System.out.println("model:"+range.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+frequency.range);
        System.out.println("frequency:"+frequency.frequency);
        System.out.println("code:"+frequency.code);
        System.out.println("price:"+frequency.price);
        System.out.println("brightness:"+frequency.brightness);
        System.out.println("users:"+frequency.users);
        System.out.println("weight:"+frequency.weight);
        System.out.println("quality:"+frequency.quality);
        System.out.println("discount:"+frequency.discount);
        System.out.println("model:"+frequency.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+code.range);
        System.out.println("frequency:"+code.frequency);
        System.out.println("code:"+code.code);
        System.out.println("price:"+code.price);
        System.out.println("brightness:"+code.brightness);
        System.out.println("users:"+code.users);
        System.out.println("weight:"+code.weight);
        System.out.println("quality:"+code.quality);
        System.out.println("discount:"+code.discount);
        System.out.println("model:"+code.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+price.range);
        System.out.println("frequency:"+price.frequency);
        System.out.println("code:"+price.code);
        System.out.println("price:"+price.price);
        System.out.println("brightness:"+price.brightness);
        System.out.println("users:"+price.users);
        System.out.println("weight:"+price.weight);
        System.out.println("quality:"+price.quality);
        System.out.println("discount:"+price.discount);
        System.out.println("model:"+price.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+brightness.range);
        System.out.println("frequency:"+brightness.frequency);
        System.out.println("code:"+brightness.code);
        System.out.println("price:"+brightness.price);
        System.out.println("brightness:"+brightness.brightness);
        System.out.println("users:"+brightness.users);
        System.out.println("weight:"+brightness.weight);
        System.out.println("quality:"+brightness.quality);
        System.out.println("discount:"+brightness.discount);
        System.out.println("model:"+brightness.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+users.range);
        System.out.println("frequency:"+users.frequency);
        System.out.println("code:"+users.code);
        System.out.println("price:"+users.price);
        System.out.println("brightness:"+users.brightness);
        System.out.println("users:"+users.users);
        System.out.println("weight:"+users.weight);
        System.out.println("quality:"+users.quality);
        System.out.println("discount:"+users.discount);
        System.out.println("model:"+users.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+weight.range);
        System.out.println("frequency:"+weight.frequency);
        System.out.println("code:"+weight.code);
        System.out.println("price:"+weight.price);
        System.out.println("brightness:"+weight.brightness);
        System.out.println("users:"+weight.users);
        System.out.println("weight:"+weight.weight);
        System.out.println("quality:"+weight.quality);
        System.out.println("discount:"+weight.discount);
        System.out.println("model:"+weight.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+quality.range);
        System.out.println("frequency:"+quality.frequency);
        System.out.println("code:"+quality.code);
        System.out.println("price:"+quality.price);
        System.out.println("brightness:"+quality.brightness);
        System.out.println("users:"+quality.users);
        System.out.println("weight:"+quality.weight);
        System.out.println("quality:"+quality.quality);
        System.out.println("discount:"+quality.discount);
        System.out.println("model:"+quality.model);
        
        System.out.println("\n  \n");
        
        System.out.println("range:"+discount.range);
        System.out.println("frequency:"+discount.frequency);
        System.out.println("code:"+discount.code);
        System.out.println("price:"+discount.price);
        System.out.println("brightness:"+discount.brightness);
        System.out.println("users:"+discount.users);
        System.out.println("weight:"+discount.weight);
        System.out.println("quality:"+discount.quality);
        System.out.println("discount:"+discount.discount);
        System.out.println("model:"+discount.model);
        
        System.out.println("\n  \n");
        
        
        
        model.model="GlowX";
        model.range=50;
        model.frequency=2.4f;
        model.code='A';
        model.price=500;
        model.brightness=800;
        model.users=2;
        model.weight=0.5f;
        model.quality='A';
        model.discount=10;
        
        System.out.println(model.model+" "+model.range+" "+model.frequency+" "+model.code+" "+model.price+" "+
        model.brightness+" "+model.users+" "+model.weight+" "+model.quality+" "+model.discount);
        
        System.out.println("\n  \n");
        
        range.model="BrightMax";
        range.range=100;
        range.frequency=5.0f;
        range.code='B';
        range.price=1000;
        range.brightness=1200;
        range.users=3;
        range.weight=0.6f;
        range.quality='B';
        range.discount=15;
        
        System.out.println("range:"+range.range);
        System.out.println("frequency:"+range.frequency);
        System.out.println("code:"+range.code);
        System.out.println("price:"+range.price);
        System.out.println("brightness:"+range.brightness);
        System.out.println("users:"+range.users);
        System.out.println("weight:"+range.weight);
        System.out.println("quality:"+range.quality);
        System.out.println("discount:"+range.discount);
        System.out.println("model:"+range.model);
		
		        System.out.println("\n  \n");

        frequency.model="EcoLight";
        frequency.range=70;
        frequency.frequency=3.5f;
        frequency.code='C';
        frequency.price=700;
        frequency.brightness=900;
        frequency.users=2;
        frequency.weight=0.55f;
        frequency.quality='A';
        frequency.discount=12;

        System.out.println("range:"+frequency.range);
        System.out.println("frequency:"+frequency.frequency);
        System.out.println("code:"+frequency.code);
        System.out.println("price:"+frequency.price);
        System.out.println("brightness:"+frequency.brightness);
        System.out.println("users:"+frequency.users);
        System.out.println("weight:"+frequency.weight);
        System.out.println("quality:"+frequency.quality);
        System.out.println("discount:"+frequency.discount);
        System.out.println("model:"+frequency.model);

        System.out.println("\n  \n");

        code.model="UltraGlow";
        code.range=80;
        code.frequency=4.0f;
        code.code='D';
        code.price=850;
        code.brightness=1000;
        code.users=3;
        code.weight=0.6f;
        code.quality='B';
        code.discount=8;

        System.out.println("range:"+code.range);
        System.out.println("frequency:"+code.frequency);
        System.out.println("code:"+code.code);
        System.out.println("price:"+code.price);
        System.out.println("brightness:"+code.brightness);
        System.out.println("users:"+code.users);
        System.out.println("weight:"+code.weight);
        System.out.println("quality:"+code.quality);
        System.out.println("discount:"+code.discount);
        System.out.println("model:"+code.model);

        System.out.println("\n  \n");

        price.model="ValueLamp";
        price.range=60;
        price.frequency=2.8f;
        price.code='E';
        price.price=600;
        price.brightness=850;
        price.users=2;
        price.weight=0.5f;
        price.quality='A';
        price.discount=10;

        System.out.println("range:"+price.range);
        System.out.println("frequency:"+price.frequency);
        System.out.println("code:"+price.code);
        System.out.println("price:"+price.price);
        System.out.println("brightness:"+price.brightness);
        System.out.println("users:"+price.users);
        System.out.println("weight:"+price.weight);
        System.out.println("quality:"+price.quality);
        System.out.println("discount:"+price.discount);
        System.out.println("model:"+price.model);

        System.out.println("\n  \n");

        brightness.model="SuperBright";
        brightness.range=90;
        brightness.frequency=5.5f;
        brightness.code='F';
        brightness.price=1200;
        brightness.brightness=1500;
        brightness.users=4;
        brightness.weight=0.7f;
        brightness.quality='A';
        brightness.discount=18;

        System.out.println("range:"+brightness.range);
        System.out.println("frequency:"+brightness.frequency);
        System.out.println("code:"+brightness.code);
        System.out.println("price:"+brightness.price);
        System.out.println("brightness:"+brightness.brightness);
        System.out.println("users:"+brightness.users);
        System.out.println("weight:"+brightness.weight);
        System.out.println("quality:"+brightness.quality);
        System.out.println("discount:"+brightness.discount);
        System.out.println("model:"+brightness.model);

        System.out.println("\n  \n");

        users.model="HomeLite";
        users.range=40;
        users.frequency=2.2f;
        users.code='G';
        users.price=400;
        users.brightness=700;
        users.users=1;
        users.weight=0.4f;
        users.quality='C';
        users.discount=5;

        System.out.println("range:"+users.range);
        System.out.println("frequency:"+users.frequency);
        System.out.println("code:"+users.code);
        System.out.println("price:"+users.price);
        System.out.println("brightness:"+users.brightness);
        System.out.println("users:"+users.users);
        System.out.println("weight:"+users.weight);
        System.out.println("quality:"+users.quality);
        System.out.println("discount:"+users.discount);
        System.out.println("model:"+users.model);

        System.out.println("\n  \n");

        weight.model="LightPro";
        weight.range=55;
        weight.frequency=3.0f;
        weight.code='H';
        weight.price=650;
        weight.brightness=800;
        weight.users=2;
        weight.weight=0.3f;
        weight.quality='B';
        weight.discount=7;

        System.out.println("range:"+weight.range);
        System.out.println("frequency:"+weight.frequency);
        System.out.println("code:"+weight.code);
        System.out.println("price:"+weight.price);
        System.out.println("brightness:"+weight.brightness);
        System.out.println("users:"+weight.users);
        System.out.println("weight:"+weight.weight);
        System.out.println("quality:"+weight.quality);
        System.out.println("discount:"+weight.discount);
        System.out.println("model:"+weight.model);

        System.out.println("\n  \n");

        quality.model="PrimeLamp";
        quality.range=75;
        quality.frequency=4.5f;
        quality.code='I';
        quality.price=950;
        quality.brightness=1100;
        quality.users=3;
        quality.weight=0.6f;
        quality.quality='A';
        quality.discount=14;

        System.out.println("range:"+quality.range);
        System.out.println("frequency:"+quality.frequency);
        System.out.println("code:"+quality.code);
        System.out.println("price:"+quality.price);
        System.out.println("brightness:"+quality.brightness);
        System.out.println("users:"+quality.users);
        System.out.println("weight:"+quality.weight);
        System.out.println("quality:"+quality.quality);
        System.out.println("discount:"+quality.discount);
        System.out.println("model:"+quality.model);

        System.out.println("\n  \n");

        discount.model="BudgetLight";
        discount.range=30;
        discount.frequency=2.0f;
        discount.code='J';
        discount.price=300;
        discount.brightness=600;
        discount.users=1;
        discount.weight=0.25f;
        discount.quality='C';
        discount.discount=20;

        System.out.println("range:"+discount.range);
        System.out.println("frequency:"+discount.frequency);
        System.out.println("code:"+discount.code);
        System.out.println("price:"+discount.price);
        System.out.println("brightness:"+discount.brightness);
        System.out.println("users:"+discount.users);
        System.out.println("weight:"+discount.weight);
        System.out.println("quality:"+discount.quality);
        System.out.println("discount:"+discount.discount);
        System.out.println("model:"+discount.model);
        
    }
}