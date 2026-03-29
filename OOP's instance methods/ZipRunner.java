class ZipRunner {
    public static void main(String[] args) {
        Zip ref = new Zip();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("MaxWeight:" + ref.maxWeight);
        System.out.println("DeliveryTime:" + ref.deliveryTime);
        System.out.println("ServiceLevel:" + ref.serviceLevel);

        ref.brandName = "FedEx";
        ref.type = "Overnight";
        ref.maxWeight = 15;
        ref.deliveryTime = 12.0f;
        ref.serviceLevel = 'B';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated MaxWeight:" + ref.maxWeight);
        System.out.println("updated DeliveryTime:" + ref.deliveryTime);
        System.out.println("updated ServiceLevel:" + ref.serviceLevel);

        // Create 10 objects like ControllerRunner
        Zip model = new Zip();
        Zip size = new Zip();
        Zip speed = new Zip();
        Zip code = new Zip();
        Zip price = new Zip();
        Zip users = new Zip();
        Zip weight = new Zip();
        Zip quality = new Zip();
        Zip discount = new Zip();

        System.out.println("Model:");
        System.out.println(model.model + " " + model.size + " " + model.speed + " " + model.code + " " +
                model.price + " " + model.users + " " + model.weight + " " + model.quality + " " + model.discount);

        System.out.println("\n  \n");
        System.out.println("size:" + size.size);
        System.out.println("speed:" + size.speed);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("weight:" + size.weight);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        System.out.println("\n  \n");
        System.out.println("size:" + speed.size);
        System.out.println("speed:" + speed.speed);
        System.out.println("code:" + speed.code);
        System.out.println("price:" + speed.price);
        System.out.println("users:" + speed.users);
        System.out.println("weight:" + speed.weight);
        System.out.println("quality:" + speed.quality);
        System.out.println("discount:" + speed.discount);
        System.out.println("model:" + speed.model);

        System.out.println("\n  \n");
        System.out.println("size:" + code.size);
        System.out.println("speed:" + code.speed);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("weight:" + code.weight);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        System.out.println("\n  \n");
        System.out.println("size:" + price.size);
        System.out.println("speed:" + price.speed);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("weight:" + price.weight);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        System.out.println("\n  \n");
        System.out.println("size:" + users.size);
        System.out.println("speed:" + users.speed);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("weight:" + users.weight);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        System.out.println("\n  \n");
        System.out.println("size:" + weight.size);
        System.out.println("speed:" + weight.speed);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("weight:" + weight.weight);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

        System.out.println("\n  \n");
        System.out.println("size:" + quality.size);
        System.out.println("speed:" + quality.speed);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("weight:" + quality.weight);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        System.out.println("\n  \n");
        System.out.println("size:" + discount.size);
        System.out.println("speed:" + discount.speed);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("weight:" + discount.weight);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

        // Initialize objects individually
        model.model = "Z100";
        model.size = 10.0f;
        model.speed = 50.0f;
        model.code = 'A';
        model.price = 500;
        model.users = 5;
        model.weight = 2.0f;
        model.quality = 'A';
        model.discount = 5;  
		
		System.out.println("\n  \n");
        System.out.println("size:" + model.size);
        System.out.println("speed:" + model.speed);
        System.out.println("code:" + model.code);
        System.out.println("price:" + model.price);
        System.out.println("users:" + model.users);
        System.out.println("weight:" + model.weight);
        System.out.println("quality:" + model.quality);
        System.out.println("discount:" + model.discount);
        System.out.println("model:" + model.model);

        size.model = "Z200";
        size.size = 11.0f;
        size.speed = 60.0f;
        size.code = 'B';
        size.price = 600;
        size.users = 6;
        size.weight = 2.5f;
        size.quality = 'B';
        size.discount = 6;   
		
		System.out.println("\n  \n");
        System.out.println("size:" + size.size);
        System.out.println("speed:" + size.speed);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("weight:" + size.weight);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        speed.model = "Z300";
        speed.size = 12.0f;
        speed.speed = 70.0f;
        speed.code = 'C';
        speed.price = 700;
        speed.users = 7;
        speed.weight = 3.0f;
        speed.quality = 'A';
        speed.discount = 7;  
		
		System.out.println("\n  \n");
        System.out.println("size:" + speed.size);
        System.out.println("speed:" + speed.speed);
        System.out.println("code:" + speed.code);
        System.out.println("price:" + speed.price);
        System.out.println("users:" + speed.users);
        System.out.println("weight:" + speed.weight);
        System.out.println("quality:" + speed.quality);
        System.out.println("discount:" + speed.discount);
        System.out.println("model:" + speed.model);

        code.model = "Z400";
        code.size = 13.0f;
        code.speed = 80.0f;
        code.code = 'D';
        code.price = 800;
        code.users = 8;
        code.weight = 3.5f;
        code.quality = 'B';
        code.discount = 8;   
		
		 System.out.println("\n  \n");
        System.out.println("size:" + code.size);
        System.out.println("speed:" + code.speed);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("weight:" + code.weight);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        price.model = "Z500";
        price.size = 14.0f;
        price.speed = 90.0f;
        price.code = 'E';
        price.price = 900;
        price.users = 9;
        price.weight = 4.0f;
        price.quality = 'A';
        price.discount = 9;  
		
		System.out.println("\n  \n");
        System.out.println("size:" + price.size);
        System.out.println("speed:" + price.speed);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("weight:" + price.weight);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);


        users.model = "Z600";
        users.size = 15.0f;
        users.speed = 100.0f;
        users.code = 'F';
        users.price = 1000;
        users.users = 10;
        users.weight = 4.5f;
        users.quality = 'B';
        users.discount = 10;  
		
		System.out.println("\n  \n");
        System.out.println("size:" + users.size);
        System.out.println("speed:" + users.speed);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("weight:" + users.weight);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        weight.model = "Z700";
        weight.size = 16.0f;
        weight.speed = 110.0f;
        weight.code = 'G';
        weight.price = 1100;
        weight.users = 11;
        weight.weight = 5.0f;
        weight.quality = 'A';
        weight.discount = 11;   
		
		System.out.println("\n  \n");
        System.out.println("size:" + weight.size);
        System.out.println("speed:" + weight.speed);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("weight:" + weight.weight);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

        quality.model = "Z800";
        quality.size = 17.0f;
        quality.speed = 120.0f;
        quality.code = 'H';
        quality.price = 1200;
        quality.users = 12;
        quality.weight = 5.5f;
        quality.quality = 'B';
        quality.discount = 12;   
		
		
        System.out.println("\n  \n");
        System.out.println("size:" + quality.size);
        System.out.println("speed:" + quality.speed);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("weight:" + quality.weight);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        discount.model = "Z900";
        discount.size = 18.0f;
        discount.speed = 130.0f;
        discount.code = 'I';
        discount.price = 1300;
        discount.users = 13;
        discount.weight = 6.0f;
        discount.quality = 'A';
        discount.discount = 13;

        System.out.println("\n  \n");
        System.out.println("size:" + discount.size);
        System.out.println("speed:" + discount.speed);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("weight:" + discount.weight);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);
       
        
    }
}