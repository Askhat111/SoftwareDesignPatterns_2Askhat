package laptopfactory.products;

public class LenovoGamingLaptop implements Laptop {
    @Override
    public String getBrand() { return "Lenovo"; }
    @Override
    public String getModel() { return "Legion 5 Pro"; }
    @Override
    public void showDetails() {
        System.out.println("Lenovo Legion 5 Pro - Ryzen 7, 32GB RAM, RTX 3070");
    }
}
