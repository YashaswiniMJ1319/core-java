class ControllerRunner {
    public static void main(String[] args) {
        Controller ref = new Controller();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("Buttons:" + ref.buttons);
        System.out.println("BatteryLife:" + ref.batteryLife);
        System.out.println("Connectivity:" + ref.connectivity);

        ref.brandName = "Microsoft";
        ref.type = "Wired";
        ref.buttons = 14;
        ref.batteryLife = 50.0f;
        ref.connectivity = 'A';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated Buttons:" + ref.buttons);
        System.out.println("updated BatteryLife:" + ref.batteryLife);
        System.out.println("updated Connectivity:" + ref.connectivity);

        // Create 10 objects like FireRunner
        Controller model = new Controller();
        Controller weight = new Controller();
        Controller sensitivity = new Controller();
        Controller code = new Controller();
        Controller price = new Controller();
        Controller users = new Controller();
        Controller size = new Controller();
        Controller quality = new Controller();
        Controller discount = new Controller();

        System.out.println("Model:");
        System.out.println(model.model + " " + model.weight + " " + model.sensitivity + " " + model.code + " " +
                model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);

        
        System.out.println("\n  \n");
        System.out.println("weight:" + weight.weight);
        System.out.println("sensitivity:" + weight.sensitivity);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("size:" + weight.size);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + sensitivity.weight);
        System.out.println("sensitivity:" + sensitivity.sensitivity);
        System.out.println("code:" + sensitivity.code);
        System.out.println("price:" + sensitivity.price);
        System.out.println("users:" + sensitivity.users);
        System.out.println("size:" + sensitivity.size);
        System.out.println("quality:" + sensitivity.quality);
        System.out.println("discount:" + sensitivity.discount);
        System.out.println("model:" + sensitivity.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + code.weight);
        System.out.println("sensitivity:" + code.sensitivity);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + price.weight);
        System.out.println("sensitivity:" + price.sensitivity);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + users.weight);
        System.out.println("sensitivity:" + users.sensitivity);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + size.weight);
        System.out.println("sensitivity:" + size.sensitivity);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + quality.weight);
        System.out.println("sensitivity:" + quality.sensitivity);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        System.out.println("\n  \n");
        System.out.println("weight:" + discount.weight);
        System.out.println("sensitivity:" + discount.sensitivity);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

        
        model.model = "C100";
        model.weight = 0.8f;
        model.sensitivity = 90.0f;
        model.code = 'A';
        model.price = 4500;
        model.users = 2;
        model.size = 12.5f;
        model.quality = 'A';
        model.discount = 5;
		
		System.out.println(model.model + " " + model.weight + " " + model.sensitivity + " " + model.code + " " +
                model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);


        weight.model = "C200";
        weight.weight = 0.9f;
        weight.sensitivity = 95.0f;
        weight.code = 'B';
        weight.price = 5000;
        weight.users = 3;
        weight.size = 13.0f;
        weight.quality = 'B';
        weight.discount = 7; 
		
		System.out.println("\n  \n");
        System.out.println("weight:" + weight.weight);
        System.out.println("sensitivity:" + weight.sensitivity);
        System.out.println("code:" + weight.code);
        System.out.println("price:" + weight.price);
        System.out.println("users:" + weight.users);
        System.out.println("size:" + weight.size);
        System.out.println("quality:" + weight.quality);
        System.out.println("discount:" + weight.discount);
        System.out.println("model:" + weight.model);

        sensitivity.model = "C300";
        sensitivity.weight = 1;
        sensitivity.sensitivity = 100.0f;
        sensitivity.code = 'C';
        sensitivity.price = 5500;
        sensitivity.users = 4;
        sensitivity.size = 14.0f;
        sensitivity.quality = 'A';
        sensitivity.discount = 10;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + sensitivity.weight);
        System.out.println("sensitivity:" + sensitivity.sensitivity);
        System.out.println("code:" + sensitivity.code);
        System.out.println("price:" + sensitivity.price);
        System.out.println("users:" + sensitivity.users);
        System.out.println("size:" + sensitivity.size);
        System.out.println("quality:" + sensitivity.quality);
        System.out.println("discount:" + sensitivity.discount);
        System.out.println("model:" + sensitivity.model);

        code.model = "C400";
        code.weight = 0.85f;
        code.sensitivity = 92.0f;
        code.code = 'D';
        code.price = 4800;
        code.users = 2;
        code.size = 12.8f;
        code.quality = 'B';
        code.discount = 6;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + code.weight);
        System.out.println("sensitivity:" + code.sensitivity);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        price.model = "C500";
        price.weight = 0.95f;
        price.sensitivity = 97.0f;
        price.code = 'E';
        price.price = 5200;
        price.users = 3;
        price.size = 13.2f;
        price.quality = 'A';
        price.discount = 8; 
		
		System.out.println("\n  \n");
        System.out.println("weight:" + price.weight);
        System.out.println("sensitivity:" + price.sensitivity);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        users.model = "C600";
        users.weight = 1.0f;
        users.sensitivity = 99.0f;
        users.code = 'F';
        users.price = 5600;
        users.users = 4;
        users.size = 14.5f;
        users.quality = 'B';
        users.discount = 9;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + users.weight);
        System.out.println("sensitivity:" + users.sensitivity);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        size.model = "C700";
        size.weight = 1.1f;
        size.sensitivity = 102.0f;
        size.code = 'G';
        size.price = 6000;
        size.users = 5;
        size.size = 15.0f;
        size.quality = 'A';
        size.discount = 10;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + size.weight);
        System.out.println("sensitivity:" + size.sensitivity);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        quality.model = "C800";
        quality.weight = 1.2f;
        quality.sensitivity = 105.0f;
        quality.code = 'H';
        quality.price = 6500;
        quality.users = 6;
        quality.size = 15.5f;
        quality.quality = 'A';
        quality.discount = 12;  
		
		System.out.println("\n  \n");
        System.out.println("weight:" + quality.weight);
        System.out.println("sensitivity:" + quality.sensitivity);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        discount.model = "C900";
        discount.weight = 0.75f;
        discount.sensitivity = 88.0f;
        discount.code = 'I';
        discount.price = 4000;
        discount.users = 1;
        discount.size = 12.0f;
        discount.quality = 'C';
        discount.discount = 15;

        System.out.println("\n  \n");
        System.out.println("weight:" + discount.weight);
        System.out.println("sensitivity:" + discount.sensitivity);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

       
    }
}