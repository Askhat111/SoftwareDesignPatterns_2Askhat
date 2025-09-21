package abstractfactory;

import laptopfactory.products.Laptop;

public interface LaptopBrandFactory {
    Laptop createBusinessLaptop();
    Laptop createGamingLaptop();
}
