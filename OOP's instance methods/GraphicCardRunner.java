class GraphicCardRunner {
    public static void main(String[] args) {
        GraphicCard ref = new GraphicCard();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("Memory:" + ref.memory);
        System.out.println("Frequency:" + ref.frequency);
        System.out.println("Connectivity:" + ref.connectivity);

        ref.brandName = "AMD";
        ref.type = "Professional";
        ref.memory = 12;
        ref.frequency = 1.8f;
        ref.connectivity = 'Q';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated Memory:" + ref.memory);
        System.out.println("updated Frequency:" + ref.frequency);
        System.out.println("updated Connectivity:" + ref.connectivity);

        GraphicCard model = new GraphicCard();
        GraphicCard weight = new GraphicCard();
        GraphicCard powerConsumption = new GraphicCard();
        GraphicCard code = new GraphicCard();
        GraphicCard price = new GraphicCard();
        GraphicCard users = new GraphicCard();
        GraphicCard size = new GraphicCard();
        GraphicCard quality = new GraphicCard();
        GraphicCard discount = new GraphicCard();

        System.out.println("Model:");
        System.out.println(model.model + " " + model.weight + " " + model.powerConsumption + " " + model.code + " " + model.price + " " +
                model.users + " " + model.size + " " + model.quality + " " + model.discount);

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

        
        model.model = "RTX3080";
        model.weight = 1200;
        model.powerConsumption = 320.0f;
        model.code = 'A';
        model.price = 70000;
        model.users = 1;
        model.size = 30.0f;
        model.quality = 'A';
        model.discount = 5;  
		
		System.out.println(model.model + " " + model.weight + " " + model.powerConsumption + " " + model.code + " " + model.price + " " +
                model.users + " " + model.size + " " + model.quality + " " + model.discount);


        weight.model = "RX6800";
        weight.weight = 1100;
        weight.powerConsumption = 250.0f;
        weight.code = 'B';
        weight.price = 55000;
        weight.users = 1;
        weight.size = 28.0f;
        weight.quality = 'B';
        weight.discount = 7;
		
		System.out.println("weight:" + weight.weight);
        System.out.println("powerConsumption:" + weight.powerConsumption);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("size:" + weight.size);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

        powerConsumption.model = "GTX1660";
        powerConsumption.weight = 900;
        powerConsumption.powerConsumption = 120.0f;
        powerConsumption.code = 'C';
        powerConsumption.price = 30000;
        powerConsumption.users = 1;
        powerConsumption.size = 25.0f;
        powerConsumption.quality = 'B';
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

        code.model = "RTX3090";
        code.weight = 1500;
        code.powerConsumption = 350.0f;
        code.code = 'D';
        code.price = 120000;
        code.users = 1;
        code.size = 32.0f;
        code.quality = 'A';
        code.discount = 8;
		
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

        price.model = "RX6900XT";
        price.weight = 1400;
        price.powerConsumption = 300.0f;
        price.code = 'E';
        price.price = 95000;
        price.users = 1;
        price.size = 31.0f;
        price.quality = 'A';
        price.discount = 6;
		
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

        users.model = "GTX1050Ti";
        users.weight = 800;
        users.powerConsumption = 75.0f;
        users.code = 'F';
        users.price = 20000;
        users.users = 1;
        users.size = 24.0f;
        users.quality = 'C';
        users.discount = 5;  
		
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

        size.model = "RTX3070";
        size.weight = 1100;
        size.powerConsumption = 220.0f;
        size.code = 'G';
        size.price = 60000;
        size.users = 1;
        size.size = 29.0f;
        size.quality = 'A';
        size.discount = 7;
		
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

        quality.model = "RX6700";
        quality.weight = 1000;
        quality.powerConsumption = 180.0f;
        quality.code = 'H';
        quality.price = 45000;
        quality.users = 1;
        quality.size = 27.0f;
        quality.quality = 'B';
        quality.discount = 6;
		
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

        discount.model = "GTX1080Ti";
        discount.weight = 950;
        discount.powerConsumption = 150.0f;
        discount.code = 'I';
        discount.price = 40000;
        discount.users = 1;
        discount.size = 26.0f;
        discount.quality = 'B';
        discount.discount = 10;

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