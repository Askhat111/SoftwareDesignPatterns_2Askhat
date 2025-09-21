package abstractfactory;

import laptopfactory.products.*;

public class DellFactory implements LaptopBrandFactory {
    @Override
    public Laptop createBusinessLaptop() {
        return new DellLaptop();
    }

    @Override
    public Laptop createGamingLaptop() {
        return new DellLaptop();
    }
}
