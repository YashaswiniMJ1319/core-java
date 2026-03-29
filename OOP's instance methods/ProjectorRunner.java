class ProjectorRunner {
    public static void main(String[] args) {
        Projector ref = new Projector();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("Lumens:" + ref.lumens);
        System.out.println("Resolution:" + ref.resolution);
        System.out.println("Connectivity:" + ref.connectivity);

        ref.brandName = "BenQ";
        ref.type = "DLP";
        ref.lumens = 3500;
        ref.resolution = 1440.0f;
        ref.connectivity = 'H';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated Lumens:" + ref.lumens);
        System.out.println("updated Resolution:" + ref.resolution);
        System.out.println("updated Connectivity:" + ref.connectivity);

        Projector model = new Projector();
        Projector weight = new Projector();
        Projector powerConsumption = new Projector();
        Projector code = new Projector();
        Projector price = new Projector();
        Projector users = new Projector();
        Projector size = new Projector();
        Projector quality = new Projector();
        Projector discount = new Projector();

        System.out.println("Model:");
        System.out.println(model.model + " " + model.weight + " " + model.powerConsumption + " " + model.code + " " +
        model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);

        System.out.println("\n  \n");

        
        System.out.println("weight:" + weight.weight);
        System.out.println("powerConsumption:" + weight.powerConsumption);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("size:" + weight.size);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

  
        System.out.println("\n  \n");
        System.out.println("weight:" + powerConsumption.weight);
        System.out.println("powerConsumption:" + powerConsumption.powerConsumption);
        System.out.println("code:" + powerConsumption.code);
        System.out.println("price:" + powerConsumption.price);
        System.out.println("users:" + powerConsumption.users);
        System.out.println("size:" + powerConsumption.size);
        System.out.println("quality:" + powerConsumption.quality);
        System.out.println("discount:" + powerConsumption.discount);
        System.out.println("model:" + powerConsumption.model);

        
        System.out.println("\n  \n");
        System.out.println("weight:" + code.weight);
        System.out.println("powerConsumption:" + code.powerConsumption);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        
        System.out.println("\n  \n");
        System.out.println("weight:" + price.weight);
        System.out.println("powerConsumption:" + price.powerConsumption);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        
        System.out.println("\n  \n");
        System.out.println("weight:" + users.weight);
        System.out.println("powerConsumption:" + users.powerConsumption);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        
        System.out.println("\n  \n");
        System.out.println("weight:" + size.weight);
        System.out.println("powerConsumption:" + size.powerConsumption);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

 
        System.out.println("\n  \n");
        System.out.println("weight:" + quality.weight);
        System.out.println("powerConsumption:" + quality.powerConsumption);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + discount.weight);
        System.out.println("powerConsumption:" + discount.powerConsumption);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

        
        model.model = "PX100";
        model.weight = 3;
        model.powerConsumption = 200.0f;
        model.code = 'A';
        model.price = 45000;
        model.users = 2;
        model.size = 20.5f;
        model.quality = 'A';
        model.discount = 5;
		System.out.println(model.model + " " + model.weight + " " + model.powerConsumption + " " + model.code + " " +
                model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);


        weight.model = "PX200";
        weight.weight = 4;
        weight.powerConsumption = 220.0f;
        weight.code = 'B';
        weight.price = 50000;
        weight.users = 3;
        weight.size = 22.0f;
        weight.quality = 'B';
        weight.discount = 7;  
		
		System.out.println("\n  \n");

        // Placeholder prints for weight object
        System.out.println("weight:" + weight.weight);
        System.out.println("powerConsumption:" + weight.powerConsumption);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("size:" + weight.size);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

        powerConsumption.model = "PX300";
        powerConsumption.weight = 5;
        powerConsumption.powerConsumption = 250.0f;
        powerConsumption.code = 'C';
        powerConsumption.price = 60000;
        powerConsumption.users = 4;
        powerConsumption.size = 24.0f;
        powerConsumption.quality = 'A';
        powerConsumption.discount = 10;
		
		System.out.println("\n  \n");
        System.out.println("weight:" + powerConsumption.weight);
        System.out.println("powerConsumption:" + powerConsumption.powerConsumption);
        System.out.println("code:" + powerConsumption.code);
        System.out.println("price:" + powerConsumption.price);
        System.out.println("users:" + powerConsumption.users);
        System.out.println("size:" + powerConsumption.size);
        System.out.println("quality:" + powerConsumption.quality);
        System.out.println("discount:" + powerConsumption.discount);
        System.out.println("model:" + powerConsumption.model);

        code.model = "PX400";
        code.weight = 3;
        code.powerConsumption = 210.0f;
        code.code = 'D';
        code.price = 55000;
        code.users = 2;
        code.size = 21.0f;
        code.quality = 'B';
        code.discount = 6;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + code.weight);
        System.out.println("powerConsumption:" + code.powerConsumption);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        price.model = "PX500";
        price.weight = 4;
        price.powerConsumption = 230.0f;
        price.code = 'E';
        price.price = 58000;
        price.users = 3;
        price.size = 22.5f;
        price.quality = 'A';
        price.discount = 8;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + price.weight);
        System.out.println("powerConsumption:" + price.powerConsumption);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        users.model = "PX600";
        users.weight = 5;
        users.powerConsumption = 240.0f;
        users.code = 'F';
        users.price = 62000;
        users.users = 4;
        users.size = 23.0f;
        users.quality = 'B';
        users.discount = 9;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + users.weight);
        System.out.println("powerConsumption:" + users.powerConsumption);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        size.model = "PX700";
        size.weight = 6;
        size.powerConsumption = 260.0f;
        size.code = 'G';
        size.price = 65000;
        size.users = 5;
        size.size = 24.5f;
        size.quality = 'A';
        size.discount = 10;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + size.weight);
        System.out.println("powerConsumption:" + size.powerConsumption);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);


        quality.model = "PX800";
        quality.weight = 7;
        quality.powerConsumption = 280.0f;
        quality.code = 'H';
        quality.price = 70000;
        quality.users = 6;
        quality.size = 25.0f;
        quality.quality = 'A';
        quality.discount = 12;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + quality.weight);
        System.out.println("powerConsumption:" + quality.powerConsumption);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        discount.model = "PX900";
        discount.weight = 3;
        discount.powerConsumption = 200.0f;
        discount.code = 'I';
        discount.price = 40000;
        discount.users = 2;
        discount.size = 20.0f;
        discount.quality = 'C';
        discount.discount = 15;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + discount.weight);
        System.out.println("powerConsumption:" + discount.powerConsumption);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);
		}
		}