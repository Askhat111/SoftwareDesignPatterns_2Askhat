package abstractfactory;

import laptopfactory.products.*;

public class AppleFactory implements LaptopBrandFactory {
    @Override
    public Laptop createBusinessLaptop() {
        return new AppleLaptop();
    }
    @Override
    public Laptop createGamingLaptop() {
        return new AppleGamingLaptop();
    }
}
