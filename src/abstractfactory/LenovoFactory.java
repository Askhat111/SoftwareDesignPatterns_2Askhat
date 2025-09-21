package abstractfactory;

import laptopfactory.products.*;

public class LenovoFactory implements LaptopBrandFactory {
    @Override
    public Laptop createBusinessLaptop() {
        return new LenovoLaptop();
    }

    @Override
    public Laptop createGamingLaptop() {
        return new LenovoGamingLaptop();
    }
}
