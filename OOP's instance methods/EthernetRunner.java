class EthernetRunner {
    public static void main(String[] args) {
        Ethernet ref = new Ethernet();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("Ports:" + ref.ports);
        System.out.println("Speed:" + ref.speed);
        System.out.println("Connectivity:" + ref.connectivity);

        ref.brandName = "Netgear";
        ref.type = "Fiber";
        ref.ports = 8;
        ref.speed = 10000.0f;
        ref.connectivity = 'B';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated Ports:" + ref.ports);
        System.out.println("updated Speed:" + ref.speed);
        System.out.println("updated Connectivity:" + ref.connectivity);

        
        Ethernet model = new Ethernet();
        Ethernet cableLength = new Ethernet();
        Ethernet bandwidth = new Ethernet();
        Ethernet code = new Ethernet();
        Ethernet price = new Ethernet();
        Ethernet users = new Ethernet();
        Ethernet size = new Ethernet();
        Ethernet quality = new Ethernet();
        Ethernet discount = new Ethernet();

        System.out.println("Model:");
        System.out.println(model.model + " " + model.cableLength + " " + model.bandwidth + " " + model.code + " " +
                model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + cableLength.cableLength);
        System.out.println("bandwidth:" + cableLength.bandwidth);
        System.out.println("code:" + cableLength.code);
        System.out.println("price:" + cableLength.price);
        System.out.println("users:" + cableLength.users);
        System.out.println("size:" + cableLength.size);
        System.out.println("quality:" + cableLength.quality);
        System.out.println("discount:" + cableLength.discount);
        System.out.println("model:" + cableLength.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + bandwidth.cableLength);
        System.out.println("bandwidth:" + bandwidth.bandwidth);
        System.out.println("code:" + bandwidth.code);
        System.out.println("price:" + bandwidth.price);
        System.out.println("users:" + bandwidth.users);
        System.out.println("size:" + bandwidth.size);
        System.out.println("quality:" + bandwidth.quality);
        System.out.println("discount:" + bandwidth.discount);
        System.out.println("model:" + bandwidth.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + code.cableLength);
        System.out.println("bandwidth:" + code.bandwidth);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + price.cableLength);
        System.out.println("bandwidth:" + price.bandwidth);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + users.cableLength);
        System.out.println("bandwidth:" + users.bandwidth);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + size.cableLength);
        System.out.println("bandwidth:" + size.bandwidth);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + quality.cableLength);
        System.out.println("bandwidth:" + quality.bandwidth);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        System.out.println("\n  \n");
        System.out.println("cableLength:" + discount.cableLength);
        System.out.println("bandwidth:" + discount.bandwidth);
        System.out.println("code:" + discount.code);
        System.out.println("price:" + discount.price);
        System.out.println("users:" + discount.users);
        System.out.println("size:" + discount.size);
        System.out.println("quality:" + discount.quality);
        System.out.println("discount:" + discount.discount);
        System.out.println("model:" + discount.model);

        
        model.model = "E100";
        model.cableLength = 1.0f;
        model.bandwidth = 100.0f;
        model.code = 'A';
        model.price = 500;
        model.users = 5;
        model.size = 10.0f;
        model.quality = 'A';
        model.discount = 5;   
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + model.cableLength);
        System.out.println("bandwidth:" + model.bandwidth);
        System.out.println("code:" + model.code);
        System.out.println("price:" + model.price);
        System.out.println("users:" + model.users);
        System.out.println("size:" + model.size);
        System.out.println("quality:" + model.quality);
        System.out.println("discount:" + model.discount);
        System.out.println("model:" + model.model);

        cableLength.model = "E200";
        cableLength.cableLength = 2.0f;
        cableLength.bandwidth = 200.0f;
        cableLength.code = 'B';
        cableLength.price = 600;
        cableLength.users = 6;
        cableLength.size = 11.0f;
        cableLength.quality = 'B';
        cableLength.discount = 6;   
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + cableLength.cableLength);
        System.out.println("bandwidth:" + cableLength.bandwidth);
        System.out.println("code:" + cableLength.code);
        System.out.println("price:" + cableLength.price);
        System.out.println("users:" + cableLength.users);
        System.out.println("size:" + cableLength.size);
        System.out.println("quality:" + cableLength.quality);
        System.out.println("discount:" + cableLength.discount);
        System.out.println("model:" + cableLength.model);

        bandwidth.model = "E300";
        bandwidth.cableLength = 3.0f;
        bandwidth.bandwidth = 300.0f;
        bandwidth.code = 'C';
        bandwidth.price = 700;
        bandwidth.users = 7;
        bandwidth.size = 12.0f;
        bandwidth.quality = 'A';
        bandwidth.discount = 7;   
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + bandwidth.cableLength);
        System.out.println("bandwidth:" + bandwidth.bandwidth);
        System.out.println("code:" + bandwidth.code);
        System.out.println("price:" + bandwidth.price);
        System.out.println("users:" + bandwidth.users);
        System.out.println("size:" + bandwidth.size);
        System.out.println("quality:" + bandwidth.quality);
        System.out.println("discount:" + bandwidth.discount);
        System.out.println("model:" + bandwidth.model);

        code.model = "E400";
        code.cableLength = 4.0f;
        code.bandwidth = 400.0f;
        code.code = 'D';
        code.price = 800;
        code.users = 8;
        code.size = 13.0f;
        code.quality = 'B';
        code.discount = 8;  
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + code.cableLength);
        System.out.println("bandwidth:" + code.bandwidth);
        System.out.println("code:" + code.code);
        System.out.println("price:" + code.price);
        System.out.println("users:" + code.users);
        System.out.println("size:" + code.size);
        System.out.println("quality:" + code.quality);
        System.out.println("discount:" + code.discount);
        System.out.println("model:" + code.model);

        price.model = "E500";
        price.cableLength = 5.0f;
        price.bandwidth = 500.0f;
        price.code = 'E';
        price.price = 900;
        price.users = 9;
        price.size = 14.0f;
        price.quality = 'A';
        price.discount = 9;   
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + price.cableLength);
        System.out.println("bandwidth:" + price.bandwidth);
        System.out.println("code:" + price.code);
        System.out.println("price:" + price.price);
        System.out.println("users:" + price.users);
        System.out.println("size:" + price.size);
        System.out.println("quality:" + price.quality);
        System.out.println("discount:" + price.discount);
        System.out.println("model:" + price.model);

        users.model = "E600";
        users.cableLength = 6.0f;
        users.bandwidth = 600.0f;
        users.code = 'F';
        users.price = 1000;
        users.users = 10;
        users.size = 15.0f;
        users.quality = 'B';
        users.discount = 10;
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + users.cableLength);
        System.out.println("bandwidth:" + users.bandwidth);
        System.out.println("code:" + users.code);
        System.out.println("price:" + users.price);
        System.out.println("users:" + users.users);
        System.out.println("size:" + users.size);
        System.out.println("quality:" + users.quality);
        System.out.println("discount:" + users.discount);
        System.out.println("model:" + users.model);

        size.model = "E700";
        size.cableLength = 7.0f;
        size.bandwidth = 700.0f;
        size.code = 'G';
        size.price = 1100;
        size.users = 11;
        size.size = 16.0f;
        size.quality = 'A';
        size.discount = 11;   
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + size.cableLength);
        System.out.println("bandwidth:" + size.bandwidth);
        System.out.println("code:" + size.code);
        System.out.println("price:" + size.price);
        System.out.println("users:" + size.users);
        System.out.println("size:" + size.size);
        System.out.println("quality:" + size.quality);
        System.out.println("discount:" + size.discount);
        System.out.println("model:" + size.model);

        quality.model = "E800";
        quality.cableLength = 8.0f;
        quality.bandwidth = 800.0f;
        quality.code = 'H';
        quality.price = 1200;
        quality.users = 12;
        quality.size = 17.0f;
        quality.quality = 'B';
        quality.discount = 12;  
		
		System.out.println("\n  \n");
        System.out.println("cableLength:" + quality.cableLength);
        System.out.println("bandwidth:" + quality.bandwidth);
        System.out.println("code:" + quality.code);
        System.out.println("price:" + quality.price);
        System.out.println("users:" + quality.users);
        System.out.println("size:" + quality.size);
        System.out.println("quality:" + quality.quality);
        System.out.println("discount:" + quality.discount);
        System.out.println("model:" + quality.model);

        discount.model = "E900";
        discount.cableLength = 9.0f;
        discount.bandwidth = 900.0f;
        discount.code = 'I';
        discount.price = 1300;
        discount.users = 13;
        discount.size = 18.0f;
        discount.quality = 'A';
        discount.discount = 13;

        System.out.println("\n  \n");
        System.out.println("cableLength:" + discount.cableLength);
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