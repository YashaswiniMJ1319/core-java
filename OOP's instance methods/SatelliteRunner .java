class SatelliteRunner {
    public static void main(String[] args) {
        Satellite ref = new Satellite();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("Panels:" + ref.panels);
        System.out.println("Weight:" + ref.weight);
        System.out.println("Connectivity:" + ref.connectivity);

        ref.brandName = "NASA";
        ref.type = "Observation";
        ref.panels = 6;
        ref.weight = 600.0f;
        ref.connectivity = 'B';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated Panels:" + ref.panels);
        System.out.println("updated Weight:" + ref.weight);
        System.out.println("updated Connectivity:" + ref.connectivity);

        // Create 10 objects like ControllerRunner
        Satellite model = new Satellite();
        Satellite orbitHeight = new Satellite();
        Satellite bandwidth = new Satellite();
        Satellite code = new Satellite();
        Satellite price = new Satellite();
        Satellite users = new Satellite();
        Satellite size = new Satellite();
        Satellite quality = new Satellite();
        Satellite discount = new Satellite();

        System.out.println("Model:");
        System.out.println(model.model + " " + model.orbitHeight + " " + model.bandwidth + " " + model.code + " " +
                model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + orbitHeight.orbitHeight);
        System.out.println("bandwidth:" + orbitHeight.bandwidth);
        System.out.println("code:" + orbitHeight.code);
        System.out.println("price:" + orbitHeight.price);
        System.out.println("users:" + orbitHeight.users);
        System.out.println("size:" + orbitHeight.size);
        System.out.println("quality:" + orbitHeight.quality);
        System.out.println("discount:" + orbitHeight.discount);
        System.out.println("model:" + orbitHeight.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + bandwidth.orbitHeight);
        System.out.println("bandwidth:" + bandwidth.bandwidth);
        System.out.println("code:" + bandwidth.code);
        System.out.println("price:" + bandwidth.price);
        System.out.println("users:" + bandwidth.users);
        System.out.println("size:" + bandwidth.size);
        System.out.println("quality:" + bandwidth.quality);
        System.out.println("discount:" + bandwidth.discount);
        System.out.println("model:" + bandwidth.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + code.orbitHeight);
        System.out.println("bandwidth:" + code.bandwidth);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + price.orbitHeight);
        System.out.println("bandwidth:" + price.bandwidth);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + users.orbitHeight);
        System.out.println("bandwidth:" + users.bandwidth);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + size.orbitHeight);
        System.out.println("bandwidth:" + size.bandwidth);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + quality.orbitHeight);
        System.out.println("bandwidth:" + quality.bandwidth);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + discount.orbitHeight);
        System.out.println("bandwidth:" + discount.bandwidth);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

        
        model.model = "S100";
        model.orbitHeight = 550.0f;
        model.bandwidth = 100.0f;
        model.code = 'A';
        model.price = 5000000;
        model.users = 5;
        model.size = 10.0f;
        model.quality = 'A';
        model.discount = 5;  
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + model.orbitHeight);
        System.out.println("bandwidth:" + model.bandwidth);
        System.out.println("code:" + model.code);
        System.out.println("price:" + model.price);
        System.out.println("users:" + model.users);
        System.out.println("size:" + model.size);
        System.out.println("quality:" + model.quality);
        System.out.println("discount:" + model.discount);
        System.out.println("model:" + model.model);

        orbitHeight.model = "S200";
        orbitHeight.orbitHeight = 600.0f;
        orbitHeight.bandwidth = 110.0f;
        orbitHeight.code = 'B';
        orbitHeight.price = 5500000;
        orbitHeight.users = 6;
        orbitHeight.size = 11.0f;
        orbitHeight.quality = 'B';
        orbitHeight.discount = 6;   
		
		 System.out.println("\n  \n");
        System.out.println("orbitHeight:" + orbitHeight.orbitHeight);
        System.out.println("bandwidth:" + orbitHeight.bandwidth);
        System.out.println("code:" + orbitHeight.code);
        System.out.println("price:" + orbitHeight.price);
        System.out.println("users:" + orbitHeight.users);
        System.out.println("size:" + orbitHeight.size);
        System.out.println("quality:" + orbitHeight.quality);
        System.out.println("discount:" + orbitHeight.discount);
        System.out.println("model:" + orbitHeight.model);

        bandwidth.model = "S300";
        bandwidth.orbitHeight = 650.0f;
        bandwidth.bandwidth = 120.0f;
        bandwidth.code = 'C';
        bandwidth.price = 6000000;
        bandwidth.users = 7;
        bandwidth.size = 12.0f;
        bandwidth.quality = 'A';
        bandwidth.discount = 7;  
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + bandwidth.orbitHeight);
        System.out.println("bandwidth:" + bandwidth.bandwidth);
        System.out.println("code:" + bandwidth.code);
        System.out.println("price:" + bandwidth.price);
        System.out.println("users:" + bandwidth.users);
        System.out.println("size:" + bandwidth.size);
        System.out.println("quality:" + bandwidth.quality);
        System.out.println("discount:" + bandwidth.discount);
        System.out.println("model:" + bandwidth.model);

        code.model = "S400";
        code.orbitHeight = 700.0f;
        code.bandwidth = 130.0f;
        code.code = 'D';
        code.price = 6500000;
        code.users = 8;
        code.size = 13.0f;
        code.quality = 'B';
        code.discount = 8;  
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + code.orbitHeight);
        System.out.println("bandwidth:" + code.bandwidth);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        price.model = "S500";
        price.orbitHeight = 750.0f;
        price.bandwidth = 140.0f;
        price.code = 'E';
        price.price = 7000000;
        price.users = 9;
        price.size = 14.0f;
        price.quality = 'A';
        price.discount = 9; 
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + price.orbitHeight);
        System.out.println("bandwidth:" + price.bandwidth);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        users.model = "S600";
        users.orbitHeight = 800.0f;
        users.bandwidth = 150.0f;
        users.code = 'F';
        users.price = 7500000;
        users.users = 10;
        users.size = 15.0f;
        users.quality = 'B';
        users.discount = 10;  
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + users.orbitHeight);
        System.out.println("bandwidth:" + users.bandwidth);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        size.model = "S700";
        size.orbitHeight = 850.0f;
        size.bandwidth = 160.0f;
        size.code = 'G';
        size.price = 8000000;
        size.users = 11;
        size.size = 16.0f;
        size.quality = 'A';
        size.discount = 11;  
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + size.orbitHeight);
        System.out.println("bandwidth:" + size.bandwidth);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);


        quality.model = "S800";
        quality.orbitHeight = 900.0f;
        quality.bandwidth = 170.0f;
        quality.code = 'H';
        quality.price = 8500000;
        quality.users = 12;
        quality.size = 17.0f;
        quality.quality = 'B';
        quality.discount = 12;
		
		System.out.println("\n  \n");
        System.out.println("orbitHeight:" + quality.orbitHeight);
        System.out.println("bandwidth:" + quality.bandwidth);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);


        discount.model = "S900";
        discount.orbitHeight = 950.0f;
        discount.bandwidth = 180.0f;
        discount.code = 'I';
        discount.price = 9000000;
        discount.users = 13;
        discount.size = 18.0f;
        discount.quality = 'A';
        discount.discount = 13;

        
        System.out.println("\n  \n");
        System.out.println("orbitHeight:" + discount.orbitHeight);
        System.out.println("bandwidth:" + discount.bandwidth);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

       
     
    }
}