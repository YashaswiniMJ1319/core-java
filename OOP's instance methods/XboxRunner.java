class XboxRunner {
    public static void main(String[] args) {
        Xbox ref = new Xbox();
        System.out.println("Literal values");

        System.out.println("BrandName:" + ref.brandName);
        System.out.println("Type:" + ref.type);
        System.out.println("Buttons:" + ref.buttons);
        System.out.println("BatteryLife:" + ref.batteryLife);
        System.out.println("Connectivity:" + ref.connectivity);

        ref.brandName = "Sony";
        ref.type = "Wired";
        ref.buttons = 16;
        ref.batteryLife = 40.0f;
        ref.connectivity = 'B';

        System.out.println("updated Literal values");

        System.out.println("updated BrandName:" + ref.brandName);
        System.out.println("updated Type:" + ref.type);
        System.out.println("updated Buttons:" + ref.buttons);
        System.out.println("updated BatteryLife:" + ref.batteryLife);
        System.out.println("updated Connectivity:" + ref.connectivity);

        Xbox model = new Xbox();
        Xbox weight = new Xbox();
        Xbox sensitivity = new Xbox();
        Xbox code = new Xbox();
        Xbox price = new Xbox();
        Xbox users = new Xbox();
        Xbox size = new Xbox();
        Xbox quality = new Xbox();
        Xbox discount = new Xbox();

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

        
        model.model = "X100";
        model.weight = 0.9f;
        model.sensitivity = 85.0f;
        model.code = 'A';
        model.price = 5500;
        model.users = 2;
        model.size = 12.0f;
        model.quality = 'A';
        model.discount = 5;

        System.out.println(model.model + " " + model.weight + " " + model.sensitivity + " " + model.code + " " +
                model.price + " " + model.users + " " + model.size + " " + model.quality + " " + model.discount);

        weight.model = "X200";
        weight.weight = 1.0f;
        weight.sensitivity = 88.0f;
        weight.code = 'B';
        weight.price = 5800;
        weight.users = 3;
        weight.size = 13.0f;
        weight.quality = 'B';
        weight.discount = 6;

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

                

        sensitivity.model = "X300";
        sensitivity.weight = 1.1f;
        sensitivity.sensitivity = 90.0f;
        sensitivity.code = 'C';
        sensitivity.price = 6000;
        sensitivity.users = 4;
        sensitivity.size = 14.0f;
        sensitivity.quality = 'A';
        sensitivity.discount = 7;

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

        code.model = "X400";
        code.weight = 1.2f;
        code.sensitivity = 92.0f;
        code.code = 'D';
        code.price = 6200;
        code.users = 5;
        code.size = 15.0f;
        code.quality = 'B';
        code.discount = 8;

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

        price.model = "X500";
        price.weight = 1.3f;
        price.sensitivity = 95.0f;
        price.code = 'E';
        price.price = 6500;
        price.users = 6;
        price.size = 16.0f;
        price.quality = 'A';
        price.discount = 9;

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

        users.model = "X600";
        users.weight = 1.4f;
        users.sensitivity = 97.0f;
        users.code = 'F';
        users.price = 6700;
        users.users = 7;
        users.size = 17.0f;
        users.quality = 'B';
        users.discount = 10;

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

        size.model = "X700";
        size.weight = 1.5f;
        size.sensitivity = 99.0f;
        size.code = 'G';
        size.price = 7000;
        size.users = 8;
        size.size = 18.0f;
        size.quality = 'A';
        size.discount = 11;

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

        quality.model = "X800";
        quality.weight = 1.6f;
        quality.sensitivity = 100.0f;
        quality.code = 'H';
        quality.price = 7200;
        quality.users = 9;
        quality.size = 19.0f;
        quality.quality = 'B';
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

        discount.model = "X900";
        discount.weight = 1.7f;
        discount.sensitivity = 102.0f;
        discount.code = 'I';
        discount.price = 7500;
        discount.users = 10;
        discount.size = 20.0f;
        discount.quality = 'A';
        discount.discount = 13;

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