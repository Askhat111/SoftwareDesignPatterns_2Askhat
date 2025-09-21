import abstractfactory.*;
import factorymethod.LaptopFactory;
import laptopfactory.products.Laptop;

public class Main {
    public static void main(String[] args) {
        System.out.print("Factory Method: ");
        LaptopFactory.createLaptop("hp").showDetails();
        LaptopFactory.createLaptop("apple").showDetails();
        LaptopFactory.createLaptop("dell").showDetails();
        LaptopFactory.createLaptop("lenovo").showDetails();

        new AppleFactory().createBusinessLaptop().showDetails();
        new AppleFactory().createGamingLaptop().showDetails();
        new DellFactory().createGamingLaptop().showDetails();
        new LenovoFactory().createBusinessLaptop().showDetails();
        new LenovoFactory().createGamingLaptop().showDetails();
    }
}
