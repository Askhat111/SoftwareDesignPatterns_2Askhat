package factorymethod;

import laptopfactory.products.*;

public class LaptopFactory {
    public static Laptop createLaptop(String type) {
        switch (type.toLowerCase()) {
            case "apple": return new AppleLaptop();
            case "hp": return new HPLaptop();
            case "dell": return new DellLaptop();
            case "lenovo": return new LenovoLaptop();
            default: throw new IllegalArgumentException("Unknown laptop type");
        }
    }
}
